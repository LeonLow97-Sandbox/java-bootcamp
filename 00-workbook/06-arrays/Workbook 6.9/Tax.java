import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        // See instructions on Learn the Part (Workbook 6.9)
        // Create another array 'afterTax' with the same length
        double[] afterTax = new double[4];
        double tax = 0.13;
        
        for (int i = 0; i <  price.length; i++) {
            afterTax[i] = price[i] * (1 + tax);
        }

        System.out.println("The original prices are: " + (Arrays.toString(price)));
        System.out.println("The prices after tax are: " + (Arrays.toString(afterTax)));

    }
}
