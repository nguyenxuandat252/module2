package ss20_furama.controller;

import com.sun.jdi.Value;
import ss20_furama.model.*;
import ss20_furama.service.BookingService;
import ss20_furama.service.CustomerService;
import ss20_furama.service.FacilityService;
import ss20_furama.util.ReadAndWriteFile;
import ss20_furama.view.ViewBooking;
import ss20_furama.view.ViewFurama;

import java.util.*;

import static ss20_furama.service.FacilityService.FACILITY_FILE;

public class BookingController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayBookingMenu() {
        CustomerService customerService = new CustomerService();
        BookingService bookingService = new BookingService();
        FacilityService facilityService = new FacilityService();
        Set<Booking> bookingSet = bookingService.getBookings();
        ViewBooking viewBooking = new ViewBooking();
        boolean flag = true;
        while (flag) {
            System.out.print("---Function---\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n");
            int choose = ViewFurama.inputSelection();
            switch (choose) {
                case 1:
                    Booking booking = viewBooking.inputDataBooking();
                    bookingService.addBooking(booking);
                    List<Customer> customers = customerService.getList();
                    for (int i = 0; i < customers.size(); i++) {
                        System.out.println((i + 1) + ". " + customers.get(i).toString());
                    }
                    System.out.print("Select customer: ");
                    int customerSelect = Integer.parseInt(scanner.nextLine());
                    Customer customer = customers.get(customerSelect - 1);
                    booking.setCodeCustomer(customer.getCode());
                    System.out.println("Danh sách dịch vụ");
                    Map<Facility, Integer> facilityMaps = facilityService.getMap();
                    for (Facility facility : facilityMaps.keySet()) {
                        System.out.println(("Key: " + facility.getCode() + " Name: " + facility.getName() + " value: " + facilityMaps.get(facility)));
                    }
                    boolean flagNew = true;
                    String facilityCode = "";
                    while (flagNew) {
                        System.out.println("Nhập mã dịch vụ cần chọn");
                        facilityCode = scanner.nextLine();
                        for (Facility facility : facilityMaps.keySet()) {
                            if (facilityCode.equals(facility.getCode())) {
                                flagNew = false;
                                break;
                            }
                        }
                        if (flagNew) {
                            System.out.println("Mã dịch vụ không tồn tại");
                        }
                    }
                    booking.setCodeFacility(facilityCode);
                    bookingService.addBooking(booking);
                    System.out.println("Booking thành công");
                    for (Facility facility : facilityMaps.keySet()) {
                        if (facilityCode.equals(facility.getCode())) {
                            List<String> stringList = ReadAndWriteFile.readFile(FACILITY_FILE);
                            String[] array;
                            for (int i = 0; i < stringList.size(); i++) {
                                array = stringList.get(i).split(",");
                                if (array[0].equals(facilityCode)) {
                                    int valule = Integer.parseInt(array[array.length - 1]);
                                    valule = valule + 1;
                                    array[array.length - 1] = String.valueOf(valule);
                                    stringList.set(i, String.join(",", array));
                                    break;
                                }

                            }
                            ReadAndWriteFile.writeFile(FACILITY_FILE, stringList, false);
                        }
                    }
                    break;
                case 2:
                    bookingService.getBookings();
                    break;
                case 3:
                    Contract contract = viewBooking.inputContract();
                    for (Booking booking1 : bookingSet) {
                        contract.setCodeBooking(booking1.getCodeBooking());
                    }
                    bookingService.addContract(contract);
                    break;
                case 4:
                    for (Contract contract1 : bookingService.getContract()) {
                        System.out.println(contract1);
                    }
                    break;
                case 5:
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println(" ");
            }
        }
    }
}
