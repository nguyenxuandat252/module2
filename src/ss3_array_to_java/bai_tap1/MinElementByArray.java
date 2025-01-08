package ss3_array_to_java.bai_tap1;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementByArray {
    public static void main(String[] args) {
        System.out.print("enter size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Array["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}
