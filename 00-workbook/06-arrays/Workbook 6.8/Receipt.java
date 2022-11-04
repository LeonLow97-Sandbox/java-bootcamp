public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");
        
        // See instructions on Learn the Part (Workbook 6.8)
        // Create an array that stores 3 apples you purchased
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {1.99, 1.49, 1.29};
        
        // Use a for loop to print each apple and its price
        for (int i = 0; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": $" + prices[i]);
        }
        
    }
}
