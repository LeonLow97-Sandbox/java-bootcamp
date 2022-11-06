# Objects

## Objectives

- Plan code around objects
- Define a Car class.
- Create many Car objects
- Define a Dealership class
- Create a Dealership object
- Interactivity with Scanner

## Plan your code

1. Look for objects (things)
2. Look for fields that describe each object
3. Look for actions the object can perform

## Class

- blueprint from which you can create objects.
- If a class has fields, it needs:
  - Constructor
  - Getters
  - Setters

|    Big 3    |               Description                |
| :---------: | :--------------------------------------: |
| Constructor | updates every field of a **new** object. |
|   Getters   |           return field values            |
|   Setters   |           update field values            |

```java
public class Car {

    String make;
    double price;
    int year;
    String color;

}
```

## constructor

- runs after you create an object.
- update fields with a constructor.

## Syntax of Constructor

1. Level of access (usually `public`)
2. The class name.
3. Parameters.

```java
public Car (String make, double price, int year, String color) {

}
```

## `this` keyword

- `this` means current object.
- `this` helps distinguish between fields and parameters.

## Objects

- An object is a thing.
- Another name for object is: **instance**.
- **Fields** describe an object.
- **Actions** describes what the object can do.

## Syntax for Creating an Object

1. Write the type of object you are creating.
2. Pass in the fields that describe it.

```java
// Empty Object
Car dodge = new Car()  // null, 0.0, 0, null

Car dodge = new Car("dodge", 11000, 2019, "blue");
```

## Updating Fields in an object

```java
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "red";
```

## `public` vs `private`

- methods and constructors are **public**.
- Fields should be `private`, should not be able to access it outside the class.
  - to prevent updating or changing the fields by mistake (dangerous).
  - use a **getter** to access a field instead.
  - should not have direct access to a field
- `private` preserves the state of the object

```java
    private String make;
    private double price;
    private int year;
    private String color;
```

## `getters`

- Method (function) that returns a field's value.
- `getter` is public and lowerCamelCase.
- `getter` returns the field's value.
- For `getters`, the keyword `this` is not required.

```java
public String getBrand() {
    return this.brand;
}
```

## `setters`

- to update a private field.
- method (function) that updates a field.
- `getter` is public and lowerCamelCase.
- `getter` receives a parameter
- `getter` updates the field with a parameter.

```java
public void setMake(String make) {
    this.make = make
}
```

## Reference Trap

- The trap happens if you mishandle:
  - Arrays
  - Objects
- Many references to one object
- To avoid this trap, do not set class variables equal to each other.
- By setting class variables equal to each other, they are pointing to the same reference.

```java
// Reference Trap
Car nissan = new Car("Nissan", 5000, 2020, "red");
Car nissan2 = nissan;

nissan2.setColor("yellow");
// both nissan and nissan2 color were updated to "yellow".
```

- Solution: Create a new object.

## Copy Constructor

- Constructor overload
  - having more than 1 constructor
- a class can take several constructors
  - the constructors can also have the same name (java looks at the _number of arguments_ that were passed into the object).
- making a copy constructor
  - copies every value from one object to another

```java
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }
```

- better solution for Reference Trap (use copy constructor instead of making another object with the same values).

## Actions

- Add the `drive()` action to the class
- an action is a method
  - represents what the object can do.

## Adding an array to the field in Class

- have to make a copy of the array using `Arrays.copyOf()`
- the example below is a **constructor**.

```java
    String[] parts;

    public Car (String[] parts) {
        // ...
        this.parts = Arrays.copyOf(parts, parts.length)
        // reference trap: ("parts" parameter and argument share the same reference, dangerous)
        // this.parts = parts
    }
```

- When many variables share the same reference (reference trap, see above example):
  - Your application's behaviour becomes unpredictable.
  - Variables start changing when you don't expect them to.
  - Solution: create a new object or use Arrays.copyOf() to make a copy.

## `getters` for arrays (private arrays not supposed to be updated)

- By returning this `getter` of an array, it returns a reference pointed to this array (which is private).

  - Thus, can update the array in the outside variable.
  - `getter` is supposed to project your variable but it isn't in this case below.

- Below is the `Car.java` which contains the Class.

```java
    public String[] getParts() {
        return this.parts;
    }
```

- In `Main.java`

```java
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};
        Car nissan = new Car("Nissan", 5000, 2020, "red", parts);

        String[] outsideVariable = nissan.getParts();
        outsideVariable[1] = "hello";  // not supposed to be able to update

        // the output is wrong because we are not supposed to be able
        // to update the private value in the array.
        System.out.println(Arrays.toString(nissan.getParts()));  // [tires, hello]

    }
```

- Solution in `Car.java` Class
    - use `Arrays.copyOf`

```java
    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }
```












