import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        // String[] parts = {"tires", "keys"};

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2020, "yellow", new String[]{"tires", "filter"})
        };

        // Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
        // Car dodge = new Car("Dodge", 8500, 2019, "blue", parts);
        // Car nissan2 = new Car(nissan);

        // nissan2.setColor("yellow");
        // nissan2.setParts(new String[]{"tires", "filter"});  // return new String[] {"1", "2"}

        // System.out.println(Arrays.toString(nissan2.getParts()));

        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        // Car newCar = dealership.getCar(0);
        // newCar.setColor("blue");
        System.out.println(dealership.getCar(0));

        // dealership.setCar(cars[0], 0);
        // dealership.setCar(cars[1], 1);
        // dealership.setCar(cars[2], 2);

    }
    
}
