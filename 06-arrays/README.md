# Arrays

## Objectives

- Arrays
- Looping Arrays
- Updating Arrays
- 2D Arrays
- Javapedia

## Arrays

- Use Arrays to store many values.
- Array elements must have the same type
- Syntax
  - Place square brackets next to the type.
  - Then, store many values of that type.
  ```java
      int[] integers = {1, 2, 3};
      String[] names = {"Leon", "Daniel", "Nicholas"};
      double[] decimals = {1.2, 3.4, 2.5, 10.2};
  ```

## Printing Arrays (points to the reference)

- Prints a 'reference' to the array.

```java
public static void main(String[] args) {
    String[] kingdom = {"Mercia", "Wessex", "Northumbria", "E A"};
    System.out.println(kingdom);  // [Ljava.lang.String;@7ad041f3
}

// Use Arrays.toString instead
import java.util.Arrays;

System.out.println(Arrays.toString(kingdom));  // [Mercia, Wessex, Northumbria, E A]
```

## Access values from an array

- Access by index.

```java
public static void main(String[] args) {
    String[] kingdom = {"Mercia", "Wessex", "Northumbria", "E A"};

    System.out.println(kingdom[0]);
    System.out.println(kingdom[1]);
    System.out.println(kingdom[2]);
    System.out.println(kingdom[3]);
}
```

- Can't access an index that is out of range.

## Looping Over Arrays

- Using `length` property to count the number of elements in an Array.

```java
String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
System.out.println("The number of elements is " + kingdoms.length);
for (int i = 0; i < kingdoms.length; i++) {
    System.out.println(i + " " + kingdoms[i]);
}
```

## Updating Arrays values

- Update an element from an index.

```java
String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
menu[2] = "Latte";
```

## Creating an Array with Size n

1. Make a new array
2. That can store 5 `String` values

```java
String[] newMenu = new String[5];

// Copying values from old array to new array
for (int i = 0; i < menu.length; i++) {
    // copies the values over to the new array
    newMenu[i] = menu[i];
}
```

## Reference Trap

- Could create another variable to store the same array (with the same array).
- To avoid reference trap, do not set array variables equal to each other.
  - to avoid having both arrays sharing the same reference.
  - use the `for loop`
  - or use `Arrays.copyOf()`
- The state of a variable should not change because you updated another.

```java
// Solution: Copy to a brand new array
String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
String[] staffThisYear = new String[3];
for (int i = 0; i < staffThisYear.length; i++) {
    staffThisYear[i] = staffLastYear[i];
}
staffThisYear[1] = "Abby";

// Another solution
String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
staffThisYear[1] = "Abby";
```

# 2D Arrays

- An array that contains arrays.
- Perfect for data in the form of a table.
- Syntax:
  - The type with 2 brackets.
  - Number of rows.
  - Number of elements per row
  ```java
      int[][] integers = new int[3][4];
  ```
- Another method to create 2D arrays

```java
    int[][]grades2 = {
        {72, 74, 78, 76},
        {65, 64, 61, 67},
        {95, 98, 99, 100}
    };
```

## Looping 2D array

- use nested loop
