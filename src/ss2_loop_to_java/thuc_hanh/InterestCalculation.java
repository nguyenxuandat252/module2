package ss2_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        double monney;
        float interestRate;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the monney: ");
        monney = input.nextDouble();
        System.out.println("enter the interest rate: ");
        interestRate = input.nextFloat();
        System.out.println("enter the month: ");
        month = input.nextInt();
        double interest = monney*month*interestRate/12;
        System.out.println("The interest is: "+interest);
    }
}
