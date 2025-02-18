package ss20_furama.controller;

import ss20_furama.view.ViewFurama;

import java.util.Scanner;

public class PromotionController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayPromotionMenu() {
        boolean flag = true;
        while (flag) {
            System.out.print("---Function---\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n");
            int choose = ViewFurama.inputSelection();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println(" ");
            }
        }
    }
}
