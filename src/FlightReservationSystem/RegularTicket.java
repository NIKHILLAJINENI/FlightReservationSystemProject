package FlightReservationSystem;

//INHERITANCE RELATIONSHIP PROVIDED AS SAID IN CHECKPOINT4

public class RegularTicket extends Ticket {
    private String specialServices;

// ALL REQUIRED ATTRIBUTES AND METHODS MOVED AS SAID IN CHECKPOINT 4

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatno, float price, boolean cancelled,String specialServices) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatno, price, cancelled);
        this.specialServices=specialServices;
    }
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
    public String getSpecialServices() {
        return this.specialServices;
    }
    public void updateSpecialServices(String specialServices) {
        this.specialServices=specialServices;
    }

}