# Unit Testing, Stream API and Lambda Expressions

---

# Unit Testing

## Manual Testing

- Running your code
- The output determines you have a bug.
- The output doesn't tell you where the bug is.

## Unit Testing

- Every small unit of your application has a test.
- One of your tests if going to fail if there is a mistake.
- `test passes`, `test fails`.
- Rarely get bugs, won't be afraid to add code.

## Setting up JUnit

- Download the JUnit Jar file.
- Add JUnit to VSCode.

```java
// Insert path of .jar file on your localhost machine
// Add to settings.json
"java.project.referencedLibraries": [
    "lib/**/*.jar",
        "INSERT PATH HERE"
]
```

## Test Driven Development

- TDD helps achieve a modular design.
- Writing tests before writing code.
  - Identify meaningful test cases
  - Write a unit test for each case
    - Write a test that fails
    - Make the test pass
    - Refactor if necessary
- Good code is easy to test.

```java
public class checkoutTest {
    @Test
    public void subtotalIsValid() {
        assertEquals(19.2, Main.getSubtotal());
    }
}
```