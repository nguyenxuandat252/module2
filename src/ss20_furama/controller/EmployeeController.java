package ss20_furama.controller;

import ss20_furama.model.Employee;
import ss20_furama.service.EmployeeService;
import ss20_furama.service.IEmployeeService;
import ss20_furama.view.ViewFurama;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayEmployeeMenu() {
        IEmployeeService employeeService = new EmployeeService();
        boolean flag = true;
        while (flag) {
            System.out.print("---Function---\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee \n" +
                    "4.Return main menu\n");
            int choose = ViewFurama.inputSelection();
            switch (choose) {
                case 1:
                    List<Employee> employeeList = employeeService.getList();
                    for (Employee employee: employeeList){
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    employeeService.add(ViewFurama.inputDataEmployee());
                    break;
                case 3:
                    employeeService.edit(ViewFurama.inputNumber(),ViewFurama.inputDataEmployee());
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
