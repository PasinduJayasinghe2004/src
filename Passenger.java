public class Passenger extends Person{
   private String passportNumber;
   public Passenger(String name,String ID,String passportNumber){
       super(name,ID);
       this.passportNumber=passportNumber;
   }

   public String getPassportNumber(){
       return passportNumber;
   }


   @Override
    public void showInfo(){
       System.out.println("Name of Passanger: "+getName()+"\n"+"ID number of passenger: "+getID()+"\n"+"passport number: "+getPassportNumber());
   }

}
