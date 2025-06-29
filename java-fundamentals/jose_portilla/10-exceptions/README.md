# Exceptions

- **Compile Time Exception**: predictable failure checked before execution.
- **Runtime Exception**: occurs at runtime and is not checked by the compiler.

|     Compile Time      |            Runtime             |
| :-------------------: | :----------------------------: |
| FileNotFoundException | ArrayIndexOutOfBoundsException |
|   NetworkException    |      NullPointerException      |
|     SQLException      |     InputMismatchException     |
|      IOException      |    IllegalArgumentException    |

## Compile Time

- The potential failure is predictable, but unpreventable.
- The compiler forces you to catch the exception and recover.
- Two matches to catch compile time errors using Try...Catch...Finally... block.

```java
// Method 1:
try {
  FileInputStream fis = new FileInputStream("greetings.txt");
} catch (FileNotFoundException e) {
  System.out.println(e.getMessage());
}

// Method 2:
public static void main(String[] args) {
    try {
        readFile("greetings.txt");
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}

public static void readFile(String fileName) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream("greetings.txt");
}
```

## Argument Validation

- Argument Validation ensures methods receive correct arguments.
- **Quality Control**: throwing an `IllegalArgumentException`.
- **Handling User Input**: prevent exceptions from being thrown.
