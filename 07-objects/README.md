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


