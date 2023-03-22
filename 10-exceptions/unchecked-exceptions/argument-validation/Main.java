import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");

        // Prevent IllegalArgumentException from being thrown
        String username = scanner.nextLine();
        if (username.isBlank()) {
            System.out.println("Username cannot be blank");
        } else {
            user.setUsername(username);
        }
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");

        // Prevent IllegalArgumentException from being thrown
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be negative!");
            } else {
                user.setAge(scanner.nextInt());
            }
        } else {
            scanner.nextLine();
        }
        
        scanner.close();
    }     
}