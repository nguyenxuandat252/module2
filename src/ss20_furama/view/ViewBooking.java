package ss20_furama.view;

import ss20_furama.model.Booking;
import ss20_furama.model.Contract;

import java.time.LocalDate;
import java.util.Scanner;

public class ViewBooking {
    public Scanner scanner=new Scanner(System.in);
    public Booking inputDataBooking(){
        System.out.println("input codeBooking:");
        String codeBooking = scanner.nextLine();
        System.out.println("input startDate:");
        String startDate = scanner.nextLine();
        System.out.println("input endDate:");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(codeBooking,startDate,endDate);
        return booking;
    }
    public Contract inputContract(){
        System.out.println("input numberContract:");
        String numberContract = scanner.nextLine();
        System.out.println("input deposit:");
        String deposit = scanner.nextLine();
        System.out.println("input totalPayment:");
        String totalPayment = scanner.nextLine();
        Contract contract = new Contract(Integer.parseInt(numberContract),Float.parseFloat(deposit),Float.parseFloat(totalPayment));
        return contract;
    }
}
