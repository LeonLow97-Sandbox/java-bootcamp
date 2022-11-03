# Content

- [Variables CheatSheet](https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/1a271db7-127c-4ab1-9375-5414a3fd161d)
- Variables
- Operators

---

# Variables

|   Type   |     Description     |
| :------: | :-----------------: |
|  `int`   |    whole numbers    |
|  `long`  | large whole numbers |
| `double` |      decimals       |
|  `char`  |     characters      |
| `String` |        text         |

---

## Objectives

- Variables
- Updating variables
- Store Text
- Store Characters
- Store Integers
- Store Decimals
- Build a Survey Project

## Syntax of writing a variable

1. The type of value
2. The variable name
3. The variable value

```java
int people = 2;

// this is not allowed (type mismatch)
int people = "Some text value";
```

## Naming Variables

- Variables are named using lower camelCase.
  - E.g., `peopleOnBus`

## Setting Variables equal to each other

- This creates a copy.

```java
    public static void main(String[] args) {
        int passengers = 5;

        int busTickets = passengers;
    }
```

## Updating Variables

- Set it equal to a new value.
- Can use `+=` and `-=` operators.

# Type: String

---

## Define `String` variable

1. The variable type: `String`.
2. The name.
3. A `String` value

```java
String sentence = "Number of passengers: ";
```

- Join string values using `+` symbol.

## Joining String with int

1. Text
2. `+` icon
3. A number

```java
"His grade is " + 50;
```

# Type: char

---

## When to use `char`?

- One character
- Use of single quotes (') for `char` type and double quotes (") for `String` type.

## Define `char` type

1. The value type `char`
2. The variable name
3. The `char` value

```java
char gender = 'M';

char name = 'Leon'; // throws an error
```

## Why not always use String?

- Memory and performance
  - `char` consumes less memory
  - `char` is faster than `String`
- Use `char` to store single character.
- Use `String` to store text.

# Type: int and long

---

## Difference between `int` and `long`

- Use `int` to store small whole numbers.
- `int` can only store numbers inside 2 billion (-2,147,483,647 to 2,147,483,647).
- `long` can store numbers from (-9223372036854775808 to 9223372036854775807)

## Define `long` type

1. The variable type
2. The variable name
3. The variable value

```java
long population = 7000000000L; // with the 'L' at the end.
```

## Why not always use `long`?

- `int` variables only takes up 4 bytes of memory compared to `long` which takes up 8 bytes
  - `int` saves more memory
  - `int` performs faster

# Type: double

---

## `double` type

- Use `double` to store decimal numbers
- Cannot store decimals inside `int` and `long`
- Use `double` for math calculations
- Storing whole numbers as type `double` renders decimals
  - E.g.,

```java
double dividend = 25;
System.out.println(dividend);  // returns 25.0
```

## Define `double` type

1. The variable type: `double`
2. The variable name
3. The variable value

```java
double price = 3.99;
```

## Avoid using `int` and `long` for math calculations

- The mathematical operation below removes the decimal place to return an integer.

```java
int dividend = 25;
int divisor = 2;
System.out.println(dividend / divisor);  // returns 12 (inaccurate)
```

# Operators

| Operator |                       Description                        |
| :------: | :------------------------------------------------------: |
|   `+`    |                           plus                           |
|   `-`    |                          minus                           |
|   `*`    |                      multiplication                      |
|   `/`    |                         division                         |
|   `%`    |      modulus - returns the remainder of a division       |
|   `++`   |             add 1 - increases the value by 1             |
|   `--`   |          subtract 1 - decreases the value by 1           |
|   `+=`   |   add by - increases the value by number on the right    |
|   `-=`   | subtract by - decreases the value by number on the right |

## Pattern

- An operation between whole numbers returns a whole number.
- An operation between decimals will preserve the decimal.

## Math Operations in Print Statements

- Use round brackets in print statement to perform math operations.

```java
int bagOfSweets1 = 5;
int bagOfSweets2 = 10;

System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
```

## The modulus % operator

- Dividend: 10
- Divisor: 2

```java
int remainder = 10 % 2;  // remainder = 0
```

## Type Casting

- Casting `double` to `int`
  1. The type you are casting to.
  2. The original value.

```java
int integer = (int)decimal;
```

```java
public static void main(String[] args) {

    double salary = 5833.3333333;
    int roundedSalary = (int)salary;
    System.out.println(salary); // 5833.3333333
    System.out.println(roundedSalary); // 5833 (just removes the decimals)

}
```

# Scanner

---

## Making Application Interactive

- The apps built so far are static (pre-defined).
- Use `Scanner` to get values from the user.
  - Waits for the user to enter a value.

## Import `Scanner`

```java
import java.util.Scanner
```

## Define `Scanner`

1. The type: `Scanner`
2. The variable name
3. A `new Scanner` value

```java
Scanner scan = new Scanner(System.in); // input from the system
```

## Methods of `Scanner`

- `nextLine()`
  - waits for user to enter a string.
  - Store the value in a string
    ```java
      String name = scan.nextLine();
    ```
- `nextDouble()`
  - waits for the user to enter a double.
- `nextInt()`
  - waits for the user to enter an integer.

## `scan.close()`

- Close scanner once you are done.
- Leaving scanner open is memory leak.
