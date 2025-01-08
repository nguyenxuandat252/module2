package ss2_loop_to_java.thuc_hanh;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number1: ");
        int num1 = in.nextInt();
        System.out.print("enter the number2: ");
        int num2 = in.nextInt();
        if(num1 > num2){
            for(int i = num2;i>0;i--){
                if(num2%i == 0&&num1%i == 0){
                    System.out.println("greatest common divisor: "+i);
                    break;
                }
            }
        }

    }
}
