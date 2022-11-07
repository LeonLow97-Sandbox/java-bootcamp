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
    
}
