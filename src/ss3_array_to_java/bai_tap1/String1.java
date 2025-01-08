package ss3_array_to_java.bai_tap1;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        String string = "Hello World";
        System.out.print("Nhập k tự cần tìm: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (s.charAt(0) == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của " + s + " trong  " + string + " là "+count);
    }
}
