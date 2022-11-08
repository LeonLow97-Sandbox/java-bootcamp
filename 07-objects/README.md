# Objects

- [Objects Cheatsheet](https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/d0578407-f92c-4879-b32c-78cea1e25073)

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
  - Your application's behavior becomes unpredictable.
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

## `toString`

- connects every field into a **String**.
- Why is **toString** special?
  - **toString** runs when you print an object.

```java
// It is public
// Has the name: toString
// Returns a String
public String toString() {
  return /* every field as part of a String */
}
```

## Manager Class

- A class that manages objects of another class.
- In this example, the manager class is the `Dealership` class.

## `constructor` in Manager Class

```java
public class Dealership {

    private Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
    }
 
}
```

## `setter` in Manager Class

```java
// the setter only updates 1 object
// the setter lets the user choose which one.
public void setCar(Car car, int index)
```

## `getter` in Manager Class

```java
// return one object
// at an index of your choice
public Car getCar(int index) {
  
}
```

## Reference Trap Example (Why not use `Arrays.copyOf()`?)

- Don't use it on an array objects.
- `Arrays.copyOf` shallow copies the reference in each element.
- For example, `array2 = Arrays.copyOf(array)`,
  - That is the same as the following:
  - This is because `Arrays.copyOf` behaves like a loop that sets each element in the cars field directly equal to each element in the cars parameter.
  ```java
    for (...) {
      array2[i] = array[i]
    }
  ```
  - Solution: Use a loop to deep copy the object in each element.
  ```java
    for (...) {
      array2[i] = new Object(array[i])
    }
  ```

```java
  // Main.java
  Car[] cars = new Car[] {
    new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
    new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
    new Car("Nissan", 5000, 2017, "yellow", new String[]{"tires", "filter"}),
    new Car("Honda", 7000, 2019, "orange", new String[]{"tires", "filter"}),
    new Car("Mercedes", 12000, 2015, "jet black", new String[]{"tires", "filter", "transmission"})
};
```

```java
  // Dealership.java
  public Dealership(Car[] cars) {
      this.cars = new Car[cars.length];
      for (int i = 0; i < this.cars.length; i++) {
          this.cars[i] = new Car(cars[i]);
      }
  }
```

# Reference Trap

- The state of a variable should not change because you updated another.

|Trap|Setting an array variable equal to another.|
|:-:|:-:|
|Pitfall|Both variables share a reference to the same array.|
|Solution|Set it equal to a copy of the array (`Arrays.copyOf`).|

|Trap|Setting an object variable equal to another.|
|:-:|:-:|
|Pitfall|Both variables share a reference to the same object.|
|Solution|Create a `new` copy of the object (copy constructor).|

|Trap|Getter returns an array field directly.|
|:-:|:-:|
|Pitfall|The outside variable and field share a reference to the same array.|
|Solution|Return a copy of the array (`Arrays.copyOf`).|

|Trap|Getter returns an object directly.|
|:-:|:-:|
|Pitfall|The outside variable and field share a reference to the same object.|
|Solution|Return a `new` copy of the object.|

## Primitive vs Class Types

- A variable of the primitive type stores a value directly.
- Primitives:
  - represent a value
  - cannot be null
  - have no methods.
- Classes: 
  - can create objects from
  - store a reference that points to an object
  - can be null
  - can call methods from its class.

|Primitive|Class|
|:-:|:-:|
|`int, double, long, boolean, char`|`object, String`|

## `String` Class
- `String` is a Class (it is in capital)
- `String` is not vulnerable to reference trap (immutable class type).
- `String` variables can be null

|String Methods|Description|
|:-:|:-:|
|`toCharArray()`|Converts this string to a new character array.|
|`toLowerCase()`|Converts all of the characters in this String to lower case.|
|`toLowerCase(Locale locale)`|Converts all of the characters in this String to lower case.|
|`toString()`|This object (which is already a string) is itself returned.|
|`toUpperCase()`|Converts all of the characters in this String to uppercase.|

## `Scanner` Class

- `Scanner` is also a Class type.
- `nextLine()`, `nextInt()`, `nextLong()`...

## `null` value

- primitive variables cannot be *null*.
  - have a fixed memory size.
- class variables (objects) can be *null*.
  - class types don't have a fixed memory size:
    - Object with 20 fields vs 1 field
    - Array of 50 elements vs 1 element.
- `null` applies when memory size is not fixed












