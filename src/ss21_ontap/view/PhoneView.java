package ss21_ontap.view;

import ss21_ontap.controller.PhoneController;
import ss21_ontap.model.Phone;
import ss21_ontap.model.PhoneNew;
import ss21_ontap.model.PhoneUnBox;

import java.util.List;
import java.util.Scanner;

public class PhoneView {
    private Scanner scanner = new Scanner(System.in);

    public String[] inputPhone(){
        System.out.println("Input code:");
        String code= scanner.nextLine();
        System.out.println("Input Id:");
        String id= scanner.nextLine();
        System.out.println("Input trademark:");
        String trademark= scanner.nextLine();
        System.out.println("Input Name:");
        String name= scanner.nextLine();
        System.out.println("Input Price:");
        String price= scanner.nextLine();
        String[] array = {code,id,trademark,name,price};
        return array;
    }
    public PhoneNew inputPhoneNew(){
        String[] array = inputPhone();
        System.out.println("Input Warranty:");
        String warranty= scanner.nextLine();
        System.out.println("Input Warranty:");
        String warrantyScope= scanner.nextLine();
        PhoneNew phoneNew = new PhoneNew(array[0],Integer.parseInt(array[1]),array[2],array[3],Double.parseDouble(array[4]),warranty,warrantyScope);
        return phoneNew;
    }
    public PhoneUnBox inputPhoneUnbox(){
        String[] array = inputPhone();
        System.out.println("Input Status:");
        String status= scanner.nextLine();
        System.out.println("Input present:");
        String present = scanner.nextLine();
        System.out.println("Input Country:");
        String country = scanner.nextLine();
        PhoneUnBox phoneUnBox = new PhoneUnBox(array[0],Integer.parseInt(array[1]),array[2],array[3],Double.parseDouble(array[4]),status,present,country);
        return phoneUnBox;
    }
    public int inputId(){
        System.out.println("input id: ");
        int id= Integer.parseInt(scanner.nextLine());
        return id;
    }
}
