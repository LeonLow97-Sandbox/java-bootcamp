
public class Main {

    public static void main(String[] args) {
        
        Car nissan = new Car("Nissan", 5000, 2020, "red");
        Car dodge = new Car("Dodge", 8500, 2019, "blue");

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);

        double newPriceTwo = dodge.getPrice() / 2;
        dodge.setPrice(newPriceTwo);

        // System.out.println(nissan.getColor());

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

    }
    
}
