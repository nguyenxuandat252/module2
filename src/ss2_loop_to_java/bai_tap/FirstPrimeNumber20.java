package ss2_loop_to_java.bai_tap;

import java.util.Scanner;

public class FirstPrimeNumber20 {
    public static void main(String[] args) {
        int number=2;
        int count=0;
        while(count<20){
            if(isPrime(number)){
                count++;
                System.out.println(number);

            }number++;
        }

    }
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }if(n==2){
            return true;
        }else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}