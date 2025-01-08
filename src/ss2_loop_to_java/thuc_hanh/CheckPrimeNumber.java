package ss2_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("input number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float sqrtn = (float) Math.sqrt(number);
        if(number<=1){
            System.out.println(number+" is not a prime number");
        }else if(number==2){
            System.out.println(number+" is a prime number");
        }else {
            for(int i=2;i<=sqrtn;i++){
                if(number%i==0){
                    System.out.println(number+" is not a prime number");
                    break;
                }else {
                    System.out.println(number+" is a prime number");
                }
            }
        }
    }
}
