package ss20_furama.model;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking>{
    private String codeBooking;
    private String dateBooking;
    private String startDate;
    private String endDate;
    private int codeCustomer;
    private String codeFacility;

    public Booking() {
    }

    public Booking(String codeBooking, String dateBooking, String startDate, String endDate, int codeCustomer, String codeFacility) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.codeCustomer = codeCustomer;
        this.codeFacility = codeFacility;
    }

    public Booking(String codeBooking, String startDate, String endDate) {
        this.codeBooking = codeBooking;
        this.dateBooking = LocalDate.now().toString();;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCodeFacility() {
        return codeFacility;
    }

    public void setCodeFacility(String codeFacility) {
        this.codeFacility = codeFacility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking +
                ", dateBooking='" + dateBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", codeCustomer='" + codeCustomer +
                ", codeFacility='" + codeFacility +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        return this.dateBooking.compareTo(o.dateBooking);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return codeCustomer == booking.codeCustomer && Objects.equals(codeFacility, booking.codeFacility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeCustomer, codeFacility);
    }
}
