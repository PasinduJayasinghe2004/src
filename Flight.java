import java.util.ArrayList;

public class Flight {
    private String FlightNumber;
    private String destination;
    private String departureTime;
    private double Price;
    ArrayList<Ticket> tickets;

    public Flight(String FlightNumber,String departureTime,String destination,double Price){
        tickets=new ArrayList<>();
        this.FlightNumber=FlightNumber;
        this.destination=destination;
        this.departureTime=departureTime;
        this.Price=Price;
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
}
