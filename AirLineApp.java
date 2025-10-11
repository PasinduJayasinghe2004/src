
import java.util.Scanner;


public class AirLineApp {

    private static AirlineSystem system=new AirlineSystem();
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("✈️ Welcome to Airline Reservation System!");
        runMenu();
    }
    public static void runMenu(){
        int choice;
        boolean cont=true;

        while(cont){
            System.out.println("\n--- Airline Menu  ---");
            System.out.println("1. Add Flight");
            System.out.println("2. Add Passenger");
            System.out.println("3. Show Flights");
            System.out.println("4. Show Passengers");
            System.out.println("5. Book Ticket");
            System.out.println("6. Save Data");
            System.out.println("7. Load Data");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch(choice){
                case 0:
                    System.out.println("........Thank you.......");
                    break;
                case 1:
                    AddFlight();
                    break;
                case 2:
                    AddPassenger();
                    break;
                case 3:
                    system.showAllFlight();
                    break;
                case 4:
                    system.showAllPassengers();
                    break;
                case 5:
                    BookTicket();
                    break;
                case 6:
                    system.SaveData();
                    break;
                case 7:
                    system.LoadData();
                    break;

                default:
                    System.out.println("Invalid Choice.....");

            }
        }


    }
    private static void AddFlight(){
        System.out.println("Enter FLight number: ");
        String number=input.nextLine();

        System.out.println("Enter destination: ");
        String destination=input.nextLine();

        System.out.println("Enter departure Time: ");
        String time=input.nextLine();

        System.out.println("Enter Price of Ticket: ");
        double price =Double.parseDouble(input.nextLine());

        system.addFlight(new Flight(number,destination,time,price));

    }
    public static void AddPassenger(){
        System.out.println("Enter Passenger name: ");
        String name=input.nextLine();

        System.out.println("Enter Passenger ID: ");
        String id=input.nextLine();

        System.out.println("Enter passport Number: ");
        String Pid=input.nextLine();

        system.addPassenger(new Passenger(name,id,Pid));



    }
    public static void BookTicket(){
        System.out.println("Enter a seatNumber: ");
        String SN=input.nextLine();

        System.out.println("Enter Passenger Id: ");
        String PID=input.nextLine();

        System.out.println("Enter Flight number: ");
        String FN=input.nextLine();

        system.bookTicket(SN,PID,FN);



















    }

}
