package FlightReservationSystem;

//ENCAPSULATED AS SAID IN CHECKPOINT 3

public class RegularTicket {
    private String specialServices;

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

