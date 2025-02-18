package ss21_ontap.controller;

import ss20_furama.model.Facility;
import ss21_ontap.model.PhoneNew;
import ss21_ontap.model.PhoneUnBox;
import ss21_ontap.service.PhoneNewService;
import ss21_ontap.service.PhoneUnBoxService;
import ss21_ontap.view.PhoneView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneController {
    private Scanner scanner = new Scanner(System.in);

    PhoneNewService phoneNewService = new PhoneNewService();
    PhoneUnBoxService phoneUnBoxService = new PhoneUnBoxService();
    PhoneView phoneView = new PhoneView();

    public void displayPhoneMenu() {
        List<PhoneNew> phoneNewList = phoneNewService.getAll();
        List<PhoneUnBox> phoneUnBoxList = phoneUnBoxService.getAll();
        boolean flag = true;
        while (flag) {
            System.out.println("-----Main menu-----" +
                    "\n 1. Display" +
                    "\n 2. Add" +
                    "\n 3. Edit" +
                    "\n 4. Delete" +
                    "\n 5. Search By Id" +
                    "\n 6. Search By name" +
                    "\n 7. Exit");
            System.out.print("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("----Phone New----");

                    for (int i = 0; i < phoneNewList.size(); i++) {
                        System.out.println(phoneNewList.get(i));
                    }
                    System.out.println("----Phone Unbox----");

                    for (int i = 0; i < phoneUnBoxList.size(); i++) {
                        System.out.println(phoneUnBoxList.get(i));
                    }
                    break;
                case 2:
                    displayAddMenu();
                    break;
                case 3:
                    int id = phoneView.inputId();
                    if (phoneNewService.checkIdNew(id)) {
                        phoneNewService.edit(id, phoneView.inputPhoneNew());
                        System.out.println("Edited successfully");
                    } else if (phoneUnBoxService.checkIdUnbox(id)) {
                        phoneUnBoxService.edit(id, phoneView.inputPhoneUnbox());
                        System.out.println("Edited successfully");
                    } else {
                        System.out.println("ID incorrect !");
                    }
                    break;
                case 4:
                    int id1 = phoneView.inputId();
                    if (phoneNewService.checkIdNew(id1)) {
                        phoneNewService.delete(id1);
                        System.out.println("Delete successfully");
                    } else if (phoneUnBoxService.checkIdUnbox(id1)) {
                        phoneUnBoxService.delete(id1);
                        System.out.println("Delete successfully");
                    } else {
                        System.out.println("ID incorrect !");
                    }
                    break;
                case 5:
                    int id2 = phoneView.inputId();
                    if (phoneNewService.checkIdNew(id2)) {
                        phoneNewService.searchById(id2);
                        System.out.println("Search successfully");
                    } else if (phoneUnBoxService.searchById(id2)) {
                        phoneUnBoxService.searchById(id2);
                        System.out.println("Search successfully");
                    } else {
                        System.out.println("ID incorrect !");
                    }
                    break;
                case 6:
                    System.out.println("input name: ");
                    String name = scanner.nextLine();
                    List<String> stringList = new ArrayList<>();
                    for(PhoneNew phoneNew: phoneNewList){
                        if(phoneNew.getName().contains(name)){
                            stringList.add(phoneNew.toString());
                        }
                    }
                    for(PhoneUnBox phoneUnBox: phoneUnBoxList){
                        if(phoneUnBox.getName().contains(name)){
                            stringList.add(phoneUnBox.toString());
                        }
                    }
                    for (String string: stringList){
                        System.out.println(string);
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("");
            }
        }
    }

    public void displayAddMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("-----Main menu-----" +
                    "\n 1. Add New Phone" +
                    "\n 2. Add Unbox Phone" +
                    "\n 3. Main Menu");
            System.out.println("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    phoneNewService.add(phoneView.inputPhoneNew());
                    break;
                case 2:
                    phoneUnBoxService.add(phoneView.inputPhoneUnbox());
                    break;
                case 3:
                    displayPhoneMenu();
                    break;
                default:
                    System.out.println("");
            }
        }
    }
}
