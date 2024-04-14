# Static and Final

## Instance vs `static` field

- An instance field belongs to objects of the class.
- A `static` field belongs to the class itself and it is the same across all objects.
- `static` fields should be private and use a getter method.

## `static final`

- A constant is `static` because it belongs to the class.
- A constant is `final` because it cannot be assigned a new value.
- A constant is declared with UPPERCASE_AND_UNDERSCORES.
- A constant is `public` because it can never be changed.

```java
public static final int RETIREMENT_AGE = 65;
public static final int MIN_AGE = 18;
```

## `static` imports

```java
// Import all static methods in Math class.
import static java.lang.Math.*;
```
