package ss20_furama.service;

import ss20_furama.model.Booking;
import ss20_furama.model.Contract;
import ss20_furama.model.Customer;
import ss20_furama.model.Employee;
import ss20_furama.util.ReadAndWriteFile;

import java.util.*;

public class BookingService implements IBookingService{
    public static Set<Booking> bookingSet = new TreeSet<>();
    public static String CONTRACT_FILE = "src/ss20_furama/data/contract.csv";
    public static Queue<Contract> contractQueue = new LinkedList<>();
    public Set<Booking> getBookings() {
        for(Booking booking: bookingSet){
            System.out.println(booking);
        }
        return bookingSet;
    }
    public void addBooking(Booking booking){
        bookingSet.add(booking);
    }

    public Queue<Contract> getContract(){
        List<String> stringList = ReadAndWriteFile.readFile(CONTRACT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(array[0]),array[1],Float.parseFloat(array[2]),Float.parseFloat(array[3]));
            contractQueue.add(contract);
        }
        return contractQueue;
    }

    public void addContract(Contract contract){
        List<String> stringList = new ArrayList<>();
        stringList.add(contract.getInfoEmployeeData());
        ReadAndWriteFile.writeFile(CONTRACT_FILE, stringList, true);
    }

    @Override
    public List getList() {
        return List.of();
    }

    @Override
    public void add(Object o) {

    }
}
