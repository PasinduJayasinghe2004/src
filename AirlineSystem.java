
import java.util.ArrayList;
import java.util.Scanner;

public class AirlineSystem {
    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;
    private static Scanner input=new Scanner(System.in);

    public AirlineSystem(){
        flights=new ArrayList<>();
        passengers=new ArrayList<>();

    }
    public void addFlight(Flight flight){
        flights.add(flight);
        System.out.println("Flight "+flight.getFlightNumber()+"added.");
    }
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
        System.out.println("Passenger "+passenger.getName()+"added.");
    }

    public Flight findFlightById(String id){
        for(Flight f:flights){
            if(f.getFlightNumber().equalsIgnoreCase(id)) return f;
        }
        return null;
    }
    public Passenger findPassengerById(String id){
        for(Passenger p:passengers){
            if(p.getID().equalsIgnoreCase(id))return p;
        }
        return null;
    }
    public void bookTicket(String FlightNumber,String passengerId,String seatNumber){
        Flight flight=findFlightById(FlightNumber);
        Passenger passenger=findPassengerById(passengerId);

        if(flight==null||passenger==null){
            System.out.println("Flight or Passenger Found.");
            return;
        }
        Ticket ticket=new Ticket(seatNumber,passenger,flight);
        flight.addTicket(ticket);
        System.out.println("Ticket booked for "+passenger.getName()+"On flight "+flight.getFlightNumber());

    }
    public void showAllPassengers(){
        if(passengers.isEmpty()){
            System.out.println("No Passengers added.");
            return;
        }
        for(Passenger p:passengers){
            p.showInfo();
        }
    }
    public void showAllFlight(){
        if(flights.isEmpty()){
            System.out.println("No Flight found.");
            return;

        }
        for(Flight f:flights){
            f.showFlighgtInfo();
        }
    }
    public void SaveData(){

    }
    public void LoadData(){

    }




}
