package baithi_module2.cotroller;

import baithi_module2.model.PaymentAccount;
import baithi_module2.model.SavingsAccount;
import baithi_module2.service.PaymentAccountService;
import baithi_module2.service.SavingsAccountService;
import baithi_module2.view.View;

import java.util.List;
import java.util.Scanner;

public class BankAccountController {
    PaymentAccountService paymentAccountService = new PaymentAccountService();
    SavingsAccountService savingsAccountService = new SavingsAccountService();
    View view = new View();

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("---Menu---" +
                    "\n 1. Add" +
                    "\n 2. Delete" +
                    "\n 3. Display" +
                    "\n 4. Search" +
                    "\n 5. Exit");
            System.out.print("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    menu();
                    break;
                case 2:
                    System.out.println("input code: ");
                    String cardNumber = scanner.nextLine();
                    if (paymentAccountService.check(cardNumber)) {
                        paymentAccountService.delete(cardNumber);
                    } else if (savingsAccountService.check(cardNumber)) {
                        savingsAccountService.delete(cardNumber);
                    } else {
                        System.out.println("code not found !");
                    }
                    break;
                case 3:
                    System.out.println("-----PaymentAccount------");
                    for (PaymentAccount paymentAccount : paymentAccountService.getAll()) {
                        System.out.println(paymentAccount);
                    }
                    System.out.println("-----SavingsAccount------");
                    for (SavingsAccount savingsAccount : savingsAccountService.getAll()) {
                        System.out.println(savingsAccount);
                    }
                    break;
                case 4:
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    List<PaymentAccount> paymentAccountList = paymentAccountService.searchByName(name);
                    int count = 0;
                    System.out.println("-----Payment Account List----");
                    for (PaymentAccount paymentAccount : paymentAccountList) {
                        System.out.println(paymentAccount);
                        count++;
                    }
                    if (count == 0) {
                        System.out.println("Not found !");
                    }
                    List<SavingsAccount> savingsAccountList = savingsAccountService.searchByName(name);
                    int count1 = 0;
                    System.out.println("-----Savings Account List----");
                    for (SavingsAccount savingsAccount : savingsAccountList) {
                        System.out.println(savingsAccount);
                        count1++;
                    }
                    if (count1 == 0) {
                        System.out.println("Not found !");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("wrong input ! input again ");
            }
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("---Menu---" +
                    "\n 1. PaymentAccount" +
                    "\n 2. SavingsAccount" +
                    "\n 3. Main menu");
            System.out.print("Select: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    paymentAccountService.add(view.inputDataPaymentAccount());
                    break;
                case 2:
                    savingsAccountService.add(view.inputDataSavingsAccount());
                    break;
                case 3:
                    mainMenu();
                    break;

            }
        }
    }
}
