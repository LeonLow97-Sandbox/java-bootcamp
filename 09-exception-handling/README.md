# Importing Packages

```java
// importing individual files
import models.Car;
import models.Dealership;

// importing all files in that folder
import models.*;
```

# Exception Handling

- Exception is a failure that can crash the application.
- Catching **checked** exceptions.
- Fixing **unchecked** exceptions.

## Checked Exceptions

- Failure that the app cannot control
  - code that is likely to fail if you access outside resources.
- Java forces you to catch checked exceptions.
  - `NetworkException`: failure to connect to a website.
  - `FileNotFoundException`: failure to access a missing file.
  - `SQLException`: failure to access or query from a database.
  - `MalformedURLException`

```java
/// Catching the Exception
// try to run the code
try {
    loadFile();
} catch (FileNotFoundException e) {
    // catch the exception if it fails
}
```

```java
// method that is prone to failure should throw a checked exception
public void loadFile() throws FileNotFoundException {
    ...
}
```

# Unchecked Exceptions

- Badly written code.
- Never catch an unchecked exception.
- Fix unchecked exceptions.
- Runtime exceptions (happens will the app is running, will crash the application)
- E.g., `ArrayIndexOutOfBoundsException`, `NullPointerException`, `IllegalArgumentException`, `InputMismatchException`, `IllegalStateException`
- Never replace if-else with try-catch.
- Only use try-catch for checked exceptions.

## Throwing Unchecked Exceptions

- Maintain quality control
- Forbid the caller from misusing methods/cons.
- Most common exceptions to throw
  - `IllegalArgumentException`
  - Method/constructor receives illegal values.
  ```java
      if (name == null || name.isBlank() || position == null || position.isBlank()) {
          throw new IllegalArgumentException("Name or position cannot be null or blank.");
      }
  ```
  - `IllegalStateException`
    - Object calls a method with an Illegal State.
    ```java
      for (int i = 0; i < employees.length; i++) {
          if (employees[i] == null) {
              throw new IllegalStateException("You must be fully staffed before opening the store");
          }
      }
    ```

# Mutable / Immutable Objects

## Mutator

- Another name for "setter".

## Mutable Object

- Object that can update its fields.
- It uses **mutators** (setters) to update fields.
- Vulnerable to reference trap
- Every _array_ is a mutable object.
  - mutable object of `type[]` class.

## Immutable Object

- Object that **cannot** update its fields.
- It does not have **mutators** (setters).
- Not vulnerable to reference trap.

|                  | Primitive Type | Mutable Object | Immutable Object |
| :--------------: | :------------: | :------------: | :--------------: |
|      Stores      |     Value      |   Reference    |    Reference     |
|     Nullable     |       No       |      Yes       |       Yes        |
| Callable Methods |       No       |      Yes       |       Yes        |
| Can Update State |      N/A       |      Yes       |        No        |
|  Reference Trap  |      N/A       |   Vulnerable   |      Immune      |

# Wrapper Class

- Java is Object Oriented
- There is a Class for every primitive type.
- `new Wrapper(value)` is deprecated.
- **Wrapper**: Immutable class that wraps around a primitive type.
  - E.g., `Integer` is a immutable class that wraps around `int`.
  ```java
    // new Integer(value) is deprecated.
    Integer number = new Integer(5);

    // new way
    Integer number = 5;
  ```
- Wrapper Objects are immutable (not vulnerable to reference trap);

| Immutable Class | Primitive Type |
| :-------------: | :------------: |
|     Integer     |      int       |
|      Long       |      long      |
|     Double      |     double     |
|    Character    |      char      |
|     String      |      N/A       |

## When to use Primitive vs Wrapper?

- Use Primitive 90% of the time.
  - Primitive types are faster than wrapper classes.
  - Use a Wrapper only when you need to. Examples:
    - Needs to be `null`
    - Needs to call methods.




