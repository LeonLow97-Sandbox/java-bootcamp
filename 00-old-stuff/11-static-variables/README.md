# Static Variables

---

## `static` Variables

- `static` fields belong to a class.
- Fields belong to an object.

## `static` Methods

- Methods belong to an object
- `static` methods belong to a class.

```java

public class Main {

    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {}
}
```

## `static final` constant

- a value that can never change
- belong to the class
- value is the same across every object

```java
static final String COMPANY_NAME: "GOOGLE";
```

- `final` means you can never update the variable.
- constants naming convention
    - uppercase
    - separated by underscore ('_')

- Making a `static final` constant `public` is not a big deal but by default, you should make it `private`.
- It's safer to expost a method instead of the variable.

















