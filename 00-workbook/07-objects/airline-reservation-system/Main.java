import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person leon = new Person("Leon", "Singapore", "01/01/1111", 195);
        
        // leon.passport = new String[]{leon.name, leon.nationality, leon.dateOfBirth};
        leon.chooseSeat();
        Person leon2 = new Person(leon);
        leon2.setName("Daniel");
        leon2.chooseSeat();

        System.out.println("Name: " + leon.getName() + "\n" + "Nationality: " + leon.getNationality() + "\n" + "Date of Birth: " + leon.getDateOfBirth() + "\n" + "Seat Number: " + leon.getSeatNumber() + "\n");
        if (leon.applyPassport()) {
         System.out.println("Congratulations " + leon.getName() + ". Your passport was approved!\n");   
        } else {
            System.out.println("We're sorry " + leon.getName() + ". We cannot process your application.\n");
        }
        
        System.out.println("Name: " + leon2.getName() + "\n" + "Nationality: " + leon2.getNationality() + "\n" + "Date of Birth: " + leon2.getDateOfBirth() + "\n" + "Seat Number: " + leon2.getSeatNumber() + "\n");
        
    }
  
  
}
