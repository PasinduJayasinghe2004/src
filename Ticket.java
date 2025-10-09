public class Ticket {
    private String seatNumber;
    private Passenger passenger;
    private Flight flight;


    public Ticket(String seatNumber,Passenger passenger,Flight flight){
        this.seatNumber=seatNumber;
        this.passenger=passenger;
        this.flight=flight;



    }
    public String getSeatNumber(){
        return seatNumber;
    }
    public Passenger getPassenger(){
        return passenger;
    }
    public Flight getFlight(){
        return flight;

    }
    public void showTicket(){
        System.out.println("Ticket-seat: "+seatNumber+"\n"+"Passenger: "+passenger.getName()+"\n"+
                "Flight: "+flight.getFlightNumber()+"\n"+"destination:  "+flight.getDestination());
    }
}
