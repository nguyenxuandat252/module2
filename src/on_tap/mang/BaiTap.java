package on_tap.mang;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap {
    /*Khai báo mảng gồm 7 phần tử kiểu dữ liệu số
    cho người dùng nhập từ bàn phím, sai nhập lại
    duyệt mảng in ra các phần tử
    sao chép mảng
    sắp xếp mảng
    đảo ngược mảng*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.print("Phần tử thứ " + (i + 1) + ": ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                }
            }

        }
        System.out.println(Arrays.toString(array));
        for (int j = 0, k = array.length - 1; j < k; j++, k--) {
            int temp = array[j];
            array[j] = array[k];
            array[k] = temp;
        }
        System.out.print("Mấngu khi đảo ngược: ");
        System.out.println(Arrays.toString(array));
    }
}
