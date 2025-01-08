package ss3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the choice: ");
        int choice = input.nextInt();
        double fahrenheit, celsius;
        switch (choice) {
            case 1:
                System.out.print("input Fahrenheit: ");
                fahrenheit = input.nextDouble();
                celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println("Celsius is " + celsius);
                break;
            case 2:
                System.out.print("input Celsius: ");
                celsius = input.nextDouble();
                fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Fahrenheit is " + fahrenheit);
                break;
            case 3:
                System.exit(0);

        }
    }
}
