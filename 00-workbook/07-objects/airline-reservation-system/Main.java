import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person leon = new Person("Leon", "Singapore", "01/01/1111", 195);
        
        // leon.passport = new String[]{leon.name, leon.nationality, leon.dateOfBirth};
        leon.setSeatNumber(10);
        
        System.out.println("Name: " + leon.getName() + "\n" + "Nationality: " + leon.getNationality() + "\n" + "Date of Birth: " + leon.getDateOfBirth() + "\n" + "Seat Number: " + leon.getSeatNumber() + "\n");
    
    }
  
  
}
