# Functions

## Objectives

- Functions
- Parameters
- Return values
- Build a Dice Game

## Syntax of Function

1. Level of access
   - `public`: can be accessed anywhere
2. Return value
   - `void`: function returns nothing
3. Function name
4. Parameters

```java
public void name(int param) {
    // code
}

// if your class is static
public static void singChorus() {
    System.out.println("Don't blame it on the sunshine");
    System.out.println("Don't blame it on the moonlight");
    System.out.println("Don't blame it on the good times");
    System.out.println("Blame it on the boogie!\n");
}
```

## Things to consider

- Write function names using `lowerCamelCase`.
- 'function' and 'method' mean the same thing.

## Parameters

- Functions with parameters expect to receive values.
- _Arguments_: the actual values that are passed into the function.

## Return Values

- **Bad Practice**: your function handles the final result.
- **Good Practice**: your function should **return** the final result.

## Return Process

1. Your function must define a return type.
2. Your function must return a value.
3. The function call retains the return value.
    - can store it in a variable

```java
public static double areaOfRectangle(double length, double width) {
    double area = length * width;
    return area;
}
```

## Doc Comments

- Tells what the function does.

## Function Scope

- variables in function can only exist inside the function scope.

## Class Scope

- Variables defined at class level means that we can access it anywhere inside the class.

## Built-in Functions

- Function that Java has made for you

## DiceJack application

- The user needs to pick 3 numbers.
- The user needs to roll the dice 3 times.
    - use `Math.random()` which returns 0 - 0.99999999999
- The user wins if
    - The sum of dice rolls is smaller than the sum of numbers the user chose
    - AND the difference between the 2 numbers is less than 3.

