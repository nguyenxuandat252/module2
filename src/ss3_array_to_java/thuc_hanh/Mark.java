package ss3_array_to_java.thuc_hanh;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Nhập vào số lượng:");
            num = sc.nextInt();
        } while (num < 0 || num > 30);
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if(arr[i] >=5 && arr[i] <=10) {
                count++;
            }
        }
        System.out.println("Số lượng học sinh pass: "+count);
    }
}
