package ss3_array_to_java.bai_tap1;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7,8,9};
        System.out.println("Array before delete: "+ Arrays.toString(arr));
        System.out.print("enter number to delete: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                count =1;
                for (int j = index;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        if (count == 0){
                System.out.println("Not in array");
        }
        System.out.println("Array after delete: "+ Arrays.toString(arr));
    }
}
