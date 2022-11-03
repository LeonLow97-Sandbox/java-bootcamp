# Getting Started with Java

- Install Java
  - [Amazon Corretto](https://aws.amazon.com/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc)
  - Select Version 17
- Open terminal
  - type `java -version`

## Creating a Java File

- Java file names must be in **CamelCase**
- Class name must match the file name
  - E.g., File name is `HelloJava.java`, then class name is `HelloJava`

## Java Class

- Must write Java code in a **class**.
- The class name needs to always match the file name.

## `public` keyword

- `public` means the class is publicly accessible by other files in the same workspace.

## `main()` method

- Entry point
    - This is where Java starts running the code
- Java class needs a `main()` method

- `println` prints a message on a new line.
```java
public class HelloJava {

    public static void main(String[] args) {
        // println() prints a message to the console
        // In parentheses, print your message
        // Semi-colon means end of statement (important in Java)
        System.out.println("Hello Java!");
    }

}
```

## `javac` terminal compiler

1. `javac` compiles Java Code into Bytecode (`.class` file). Always compile first.
    - `javac <file name>.java`
2. `java` executes the compiled code.
    - `java <file name>`
