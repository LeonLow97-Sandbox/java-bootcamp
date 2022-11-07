public class Airline {

    private Person[] seats;

    public Airline() {
        this.seats = new Person[11]; 
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person) {
        int index = person.getSeatNumber();
        this.seats[index-1] = new Person(person);
    }
    
}
