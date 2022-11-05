import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person leon = new Person("Leon", "Singapore", "01/01/1111", 195);
        
        // leon.passport = new String[]{leon.name, leon.nationality, leon.dateOfBirth};
        
        System.out.println("Name: " + leon.name + "\n" + "Nationality: " + leon.nationality + "\n" + "Date of Birth: " + leon.dateOfBirth + "\n" + "Seat Number: " + leon.seatNumber + "\n");
      
    }
  
  
}
