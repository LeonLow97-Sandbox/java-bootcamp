import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);
        shirt.fold();

        Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);
        pants.fold();

        productStore(shirt);
        productStore(pants);

        shirt.wear();
        pants.wear();
    }

    // Polymorphism
    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing the " + product.getBrand() + " "
                + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to $"
                + product.getPrice() + ".");
    }

    // public static void pantStore(Pants pants) {
    // System.out.println("Thank you for purchasing " + pants.getBrand() + " Pants. "
    // + " Your total comes to " + pants.getPrice());
    // }

    // public static void shirtStore(Shirt shirt) {
    // System.out.println("Thank you for purchasing " + shirt.getBrand() + " Pants. "
    // + " Your total comes to " + shirt.getPrice());
    // }

}
