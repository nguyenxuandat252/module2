package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap thang");
        int month = in.nextInt();
        switch (month) {
            case 1:
                System.out.print("tháng" + month + "có 31 ngày");
                break;
            case 3:
                System.out.print(" tháng" + month + " có 31 ngày");
                break;
            case 5:
                System.out.print(" tháng" + month + " có 31 ngày");
                break;
            case 7:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 8:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 10:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 12:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 4:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 6:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 9:
                System.out.print("tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.print("tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 11:
                System.out.print("tháng " + month + " có 31 ngày");
                break;

        }
    }
}
