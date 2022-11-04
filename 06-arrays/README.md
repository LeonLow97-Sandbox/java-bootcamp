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
