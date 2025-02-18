package ss20_furama.controller;

import ss20_furama.model.Facility;
import ss20_furama.service.FacilityService;
import ss20_furama.view.ViewFacility;
import ss20_furama.view.ViewFurama;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityMenu() {
        FacilityService facilityService=new FacilityService();
        boolean flag = true;
        while (flag) {
            System.out.print("---Function---\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n");
            int choose = ViewFurama.inputSelection();
            switch (choose) {
                case 1:
                    Map<Facility,Integer> facilityMap = facilityService.getMap();
                    for (Facility key : facilityMap.keySet()) {
                        System.out.println("Key: " + key.getCode() + ", Value: " + facilityMap.get(key));
                    }
                    break;
                case 2:
                    Facility facility = ViewFacility.inputFacility();
                    facilityService.add(facility);
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println(" ");
            }
        }
    }
}
