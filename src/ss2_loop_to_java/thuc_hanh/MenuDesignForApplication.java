package ss2_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class MenuDesignForApplication {
    public static void main(String[] args) {
        System.out.println("enter choice: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * *");
                System.out.println("* * *");
                System.out.println("* * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * *");
                System.out.println("* * *");
                break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
