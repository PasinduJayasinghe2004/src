public abstract class Person {
    private String name;
    private String ID;
    public Person(String name,String passportID){
        this.name=name;
        this.ID=ID;

    }
    public String getName(){
        return name;

    }
    public String getID(){
        return ID;
    }

    public abstract void showInfo();
}

