public class BusinessTicket extends Ticket {

    public BusinessTicket(String seatNumber,Passenger passenger,Flight flight){
        super(seatNumber,passenger,flight);
    }

    @Override
    public double calculaterPrice() {
        return getFlight().getPrice()*5;
    }
}
