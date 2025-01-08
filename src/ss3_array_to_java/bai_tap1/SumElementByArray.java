package ss3_array_to_java.bai_tap1;

import java.util.Scanner;

public class SumElementByArray {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("bạn muốn tính tổng cột mấy: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][num];
        }
        System.out.println("Tong các phần tử cột "+num+" là "+sum);
    }
}
