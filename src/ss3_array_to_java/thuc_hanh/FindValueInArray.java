package ss3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] arr = {"Dat", "Lưu", "Viet", "Minh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        String value = sc.nextLine();
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                result = true;
                System.out.println(value + " in position " + i);
                break;
            }

        }
        if (!result) {
            System.out.println(value + " not found in array ");
        }
    }
}
