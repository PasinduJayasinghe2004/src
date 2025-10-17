import java.util.ArrayList;

public class Flight {
    private String FlightNumber;
    private String destination;
    private String departureTime;
    private double Price;
    ArrayList<Ticket> tickets;

    private int totalEconomySeats;
    private int totalBusinessSeats;
    private int bookedEconomySeats;
    private int bookedBusinessSeats;

    public Flight(String FlightNumber,String departureTime,String destination,double Price){
        tickets=new ArrayList<>();
        this.FlightNumber=FlightNumber;
        this.destination=destination;
        this.departureTime=departureTime;
        this.Price=Price;

        this.totalBusinessSeats=20;
        this.totalEconomySeats=100;
        this.bookedEconomySeats=0;
        this.bookedBusinessSeats=0;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getPrice() {
        return Price;
    }
    public boolean hasEconomySeats(){
        return bookedEconomySeats<totalEconomySeats;
    }
    public boolean hasBusinessSeats(){
        return bookedBusinessSeats<totalBusinessSeats;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
        if(ticket instanceof EconomyTicket)bookedEconomySeats++;
        else if(ticket instanceof BusinessTicket)bookedBusinessSeats++;
    }
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
    public void showFlighgtInfo(){
        System.out.println("Flight: "+getFlightNumber()+"to "+"\n"+getDestination()+"at "+getDepartureTime()+"Price: "+getPrice());
        System.out.println("Tickets booked: "+tickets.size());
        System.out.println("Economy Seats: "+(totalEconomySeats-bookedEconomySeats)+"\n"+
                "Business Seats: "+(totalBusinessSeats-bookedBusinessSeats));
    }
}
