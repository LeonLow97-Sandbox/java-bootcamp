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
