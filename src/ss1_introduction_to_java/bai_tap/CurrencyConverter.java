package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rate = 25395;
        System.out.println("Input USD: ");
        Scanner sc = new Scanner(System.in);
        double usd = sc.nextDouble();
        double result = usd * rate;
        System.out.println(usd +" Converted vnd: " + result + " vnd");
    }
}
