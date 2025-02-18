package ss20_furama.controller;

import ss20_furama.model.Customer;
import ss20_furama.model.Employee;
import ss20_furama.service.CustomerService;
import ss20_furama.service.ICustomerService;
import ss20_furama.view.ViewFurama;

import java.util.List;
import java.util.Scanner;

public class CustomerController {


    public static Scanner scanner = new Scanner(System.in);

    public static void displayCustomerMenu() {
        ICustomerService customerService=new CustomerService();
        boolean flag = true;
        while (flag) {
            System.out.print("---Function---\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n");
            int choose = ViewFurama.inputSelection();
            switch (choose) {
                case 1:
                    List<Customer> customerList = customerService.getList();
                    for (Customer customer: customerList){
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    customerService.add(ViewFurama.inputDataCustomer());
                    break;
                case 3:
                    customerService.edit(ViewFurama.inputNumber(),ViewFurama.inputDataCustomer());
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
