package ex_07_Payload_Management.Class.MaualWay.requestPOJO;

public class Booking {

    private String firstname;
    private String lastname;
    private  Integer totalprice;
    private  boolean depositepaid;
    private BookingDates bookingdates;
    private String additinalneeds;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isDepositepaid() {
        return depositepaid;
    }

    public void setDepositepaid(boolean depositepaid) {
        this.depositepaid = depositepaid;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditinalneeds() {
        return additinalneeds;
    }

    public void setAdditinalneeds(String additinalneeds) {
        this.additinalneeds = additinalneeds;
    }
}
