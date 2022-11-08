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