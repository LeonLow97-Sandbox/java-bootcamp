import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person leon = new Person();
        
        leon.name = "Leon";
        leon.nationality = "Singapore";
        leon.dateOfBirth = "01/01/1111";
        leon.passport = new String[]{leon.name, leon.nationality, leon.dateOfBirth};
        leon.seatNumber = 195;
        
        System.out.println(leon.name);
        System.out.println(leon.nationality);
        System.out.println(leon.dateOfBirth);
        System.out.println(Arrays.toString(leon.passport));
        System.out.println(leon.seatNumber);
      
    }
  
  
}
