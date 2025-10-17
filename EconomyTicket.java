public class EconomyTicket extends Ticket{
    public EconomyTicket(String seatNumber,Passenger passenger,Flight flight){
        super(seatNumber,passenger,flight);

    }
    @Override
    public double calculaterPrice(){
        return getFlight().getPrice();
    }
}
