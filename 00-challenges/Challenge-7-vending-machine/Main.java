import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        // Item item = new Item("Pepsi", 3.99, 10);
        // System.out.println(item);
        
        Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);
        // Item item = machine.getItem(2, 1);  // testing reference trap
        // item.setPrice(2.99);
        // machine.setItem(item, 2, 1);
        // System.out.println(machine.getItem(2, 1));
        
        // machine.dispense(0,0);
        // machine.dispense(0,0);

        // System.out.println(machine.getItem(0, 0));

        System.out.println(machine);

        while (true) {
            System.out.println("Pick a row: ");
            int row = scan.nextInt();
            System.out.println("Pick a spot in the row: ");
            int spot = scan.nextInt();
    
            boolean isDispensed = machine.dispense(row, spot);
            System.out.println("\n" + machine);
    
            if (isDispensed) {
                System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            } else {
                System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }
    
            if (scan.nextInt() != 1) {
                break;
            }
        }

    }
}
