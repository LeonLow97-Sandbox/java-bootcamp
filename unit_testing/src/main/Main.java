package unit_testing.src.main;

import java.text.DecimalFormat;

public class Main {

    public static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {
        
    }

    public static double getSubtotal() {
        double temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }
        return temp;
    }

    public static double getTax(double subTotal) {
        DecimalFormat formatter = new DecimalFormat("#.##");

        return Double.parseDouble(formatter.format(subTotal * 0.13));
    }

    public static double getTotal(double subTotal, double tax) {
        return subTotal + tax;
    }
    
}
