package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Hello: " + name);

    }
}
