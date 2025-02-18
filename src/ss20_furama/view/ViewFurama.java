package ss20_furama.view;

import ss20_furama.model.Customer;
import ss20_furama.model.Employee;
import ss20_furama.model.Facility;
import ss20_furama.model.Person;
import ss20_furama.service.FacilityService;

import java.util.Scanner;

public class ViewFurama {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputSelection() {
        while (true) {
            try {
                System.out.println("Input selection: ");
                int choose = Integer.parseInt(scanner.nextLine());
                return choose;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException");;
            }
        }
    }

    public static Employee inputDataEmployee(){
        System.out.println("Input code: ");
        int code = inputNumber();
        System.out.println("Input name: ");
        String name = inputString();
        System.out.println("Input dob: ");
        String dob = inputString();
        System.out.println("Input sex: ");
        String sex = inputString();
        System.out.println("Input identificationNumber: ");
        String identificationNumber = inputString();
        System.out.println("Input phoneNumber: ");
        String phoneNumber = inputString();
        System.out.println("Input email: ");
        String email = inputString();
        System.out.println("Input lever:");
        String lever = inputString();
        System.out.println("Input position:");
        String position = inputString();
        System.out.println("Input Salary:");
        double salary = inputDouble();
        Employee employee = new Employee(code,name,dob,sex,identificationNumber,phoneNumber,email,lever,position,salary);
        return employee;
    }

    public static int inputNumber(){
        return Integer.parseInt(scanner.nextLine());
    }
    public static String inputString(){
        return scanner.nextLine();
    }
    public static double inputDouble(){
        return Double.parseDouble(scanner.nextLine());
    }
    public static float inputFloat(){
        return Float.parseFloat(scanner.nextLine());
    }

    public static Customer inputDataCustomer(){
        System.out.println("Input code: ");
        int code = inputNumber();
        System.out.println("Input name: ");
        String name = inputString();
        System.out.println("Input dob: ");
        String dob = inputString();
        System.out.println("Input sex: ");
        String sex = inputString();
        System.out.println("Input identificationNumber: ");
        String identificationNumber = inputString();
        System.out.println("Input phoneNumber: ");
        String phoneNumber = inputString();
        System.out.println("Input email: ");
        String email = inputString();
        System.out.println("Input customer type:");
        String customerType = inputString();
        System.out.println("Input address:");
        String address = inputString();
        Customer customer = new Customer(code,name,dob,sex,identificationNumber,phoneNumber,email,customerType,address);
        return customer;
    }

}
