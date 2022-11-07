import java.util.Arrays;

public class Dealership {

    private Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
    }

    // passing in the source object from Car.java (avoid reference trap)
    // runs the copy constructor
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    // passing in the source object
    // return a new Object (avoid reference trap)
    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    // selling a car
    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    // searching a car
    public String search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                    return "\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested?";
            }
        }

        return "Sorry, we couldn't find any car for you.";
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "This parking spot is Empty!";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }

        return temp;
    }
    
}
