package ss4_oop_to_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double numA, numB, numC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    public double getNumC() {
        return numC;
    }

    public double getDetal() {
        return numB * numB - 4 * numA * numC;
    }

    public String getRoot0() {
        return "VN";
    }

    public double getRoot1() {
        return (-numB + Math.sqrt(numB * numB - 4 * numA * numC)) / (2 * numA);
    }

    public double getRoot2() {
        return (-numB - Math.sqrt(numB * numB - 4 * numA * numC)) / (2 * numA);
    }

    public double getRoot3() {
        return (-numB) / (2 * numA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();
        System.out.print("Enter b number: ");
        double b = sc.nextDouble();
        System.out.print("Enter c number: ");
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double detal = qe.getDetal();
        if (detal < 0) {
            System.out.println("PT" + qe.getRoot0());
        } else if (detal == 0) {
            System.out.println("PT có nghiệm kép X = " + qe.getRoot3());
        } else {
            System.out.println("PT có nghiệm X1 = " + qe.getRoot1());
            System.out.println("PT có nghiệm X2 = " + qe.getRoot2());
        }
    }
}
