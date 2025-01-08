package ss2_loop_to_java.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice: ");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the rectangle");
        System.out.println("3. Print the rectangle");
        System.out.println("4. Exit");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("right angle above ");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("right angle below ");
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("Enter length");
                int length = in.nextInt();
                System.out.println("Enter width");
                int width = in.nextInt();
                for (int i = 1; i <= length; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("No choice");


        }
    }
}
