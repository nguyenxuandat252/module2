package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight of the body: ");
        weight = in.nextDouble();
        System.out.print("Enter the height of the body: ");
        height = in.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println("Underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if(bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
