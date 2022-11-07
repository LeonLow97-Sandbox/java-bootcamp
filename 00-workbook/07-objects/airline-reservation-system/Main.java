import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person person = new Person("Leon", "Singaporean", "01/01/1111", 195); 
        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println(person);
     }
  
  
}
