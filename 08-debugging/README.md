# Exception Handling and Debugging

- [Exception Handling and Debugging Cheat Sheet](https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/3a5da401-2fbc-46ab-b582-e5b47e3c9ecb)

# Debugging

- Code never works from the first try, might get bugs

## Breakpoints

- use breakpoints to debug
- Pause the runtime line by line.
  - track the application
- Visualize the runtime and fix bugs.

## Add to VSCODE Settings.json

`"java.debug.settings.forceBuildBeforeLaunch": false,`

## Ternary Operator in Java

```java
variable = (comparison) ? (value1) : (value2)
```

## Debugging Functions

- Using breakpoints, you can `step into` a function.

## Debugging Nested Loops

## Debugging 2D Arrays

- A variable:
  - Does not store an array.
  - Stores a reference that points to an array.
- 2D arrays require nested loops.
- Hard to keep track of the counters _i_ and _j_.

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


