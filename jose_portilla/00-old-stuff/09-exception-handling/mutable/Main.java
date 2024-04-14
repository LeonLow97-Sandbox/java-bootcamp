public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable (can use setters to update)
        car.setMake("Honda"); // can update the object's state.
        Car car2 = car;
        car2.setPrice(8000);

        System.out.println(car.getPrice()); // 8000.0
        System.out.println(car2.getPrice()); // 8000.0
        // Mutable Objects are vulnerable to the reference trap.
    }
}
