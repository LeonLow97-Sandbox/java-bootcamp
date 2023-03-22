import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            // opens a connection to "greetings.txt"
            FileInputStream fis = new FileInputStream("greetings.txt");

            // Read the data from the file using Scanner
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Completed...");
        }
    }
    
}