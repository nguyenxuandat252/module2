package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = in.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.print(year + " Is Leap Year");
        }else {
            System.out.print(year + " Is Not Leap Year");
        }
    }
}
