package baithi_module2.view;

import baithi_module2.model.PaymentAccount;
import baithi_module2.model.SavingsAccount;

import java.util.Scanner;

public class View {
    Scanner scanner=new Scanner(System.in);
    public PaymentAccount inputDataPaymentAccount(){
        System.out.println("input id");
        String id = scanner.nextLine();
        System.out.println("input code");
        String code = scanner.nextLine();
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input date");
        String date = scanner.nextLine();
        System.out.println("input cardNumber");
        String cardNumber = scanner.nextLine();
        System.out.println("input amount");
        String amount = scanner.nextLine();
        PaymentAccount paymentAccount=new PaymentAccount(Integer.parseInt(id), code,name, date, cardNumber,Integer.parseInt( amount));
        return paymentAccount;
    }
    public SavingsAccount inputDataSavingsAccount(){
        System.out.println("input id");
        String id = scanner.nextLine();
        System.out.println("input code");
        String code = scanner.nextLine();
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input date");
        String date = scanner.nextLine();
        System.out.println("input savings");
        String savings = scanner.nextLine();
        System.out.println("input dateCreate");
        String dateCreate = scanner.nextLine();
        System.out.println("input interestRate");
        String interestRate = scanner.nextLine();
        System.out.println("input term");
        String term = scanner.nextLine();
        SavingsAccount savingsAccount=new SavingsAccount(Integer.parseInt(id), code,name, date, Integer.parseInt(savings), dateCreate,Integer.parseInt( interestRate),Integer.parseInt( term));
        return savingsAccount;
    }

    public String inputStringNumber() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter a string of digits: ");
            input = scanner.nextLine();


            if (input.matches("\\d+")) {
                break;
            } else {
                System.out.println(" Please enter a string of digits");
            }
        }

        return input;
    }
    public int inputInteger() {
        int id = -1;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0) {
                    break;
                } else {
                    System.out.println("input number > 0, re-input: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter integer");
            }
        }
        return id;
    }
    public String inputName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Enter a name (letters only): ");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println(" Please enter a name with letters only");
            }
        }

        return name;
    }
}
