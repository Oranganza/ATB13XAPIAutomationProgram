package ex_07_Payload_Management.Class.MaualWay.responsePOJO;

import ex_07_Payload_Management.Class.MaualWay.requestPOJO.Booking;

public class Bookingresponse {

    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
