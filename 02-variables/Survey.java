import java.util.Scanner;

public class Survey {
    
    public static void main(String[] args) {

        int counter = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name +  " for answering all " + counter + " questions!");
        System.out.println("You spent $" + (coffeePrice * coffeeAmount) + " on coffee with " + coffeeAmount + " cups of coffee.");
        scan.close();

    }

}
