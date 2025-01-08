package ss3_array_to_java.bai_tap1;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        int[] newArray = new int[array.length + 1];
        System.out.print("enter element to array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("enter index to array: ");
        int index = sc.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("index out of bounds");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
                newArray[index] = num;
            }
            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            System.out.println("Array after add: "+Arrays.toString(newArray));
        }

    }
}
