# Objectives

- Booleans
- `if` statements
- `switch` statements
- Dealership Application

---

# Boolean

---

## Define a `boolean` type

1. The value type: `boolean`
2. The variable name
3. The variable value

```java
boolean bool1 = true;
```

## Boolean Comparisons

| Comparison |        Description        |
| :--------: | :-----------------------: |
|    `==`    |         equal to          |
|    `!=`    |       not equal to        |
|  `equals`  |   equal to (for String)   |
| `!equals`  | not equal to (for String) |

- Never use `==` or `!=` to compare String values (get weird results).
  - Use `equals` or `!equals` instead.
- use `equalsIgnoreCase` to ignore case.

# `if` statement

---

## Logical Operators

- OR operator
  - `||`
- AND operator
  - `&&`

# `switch` statement

---

## How to use `switch`?

- `switch` compares one value against a list of values.

## Define a `switch` statement

```java
switch(value) {
    case value1: // some code

    case value2: // some code

    case value3: // some code

    default: // some code
}
```

1. The argument
2. If the argument matches the value, the case runs.
3. If the argument matches none of the values, the default case runs.

## `break` keyword

- Use `break` to get out of the switch statement, otherwise it runs all.

## `if else` vs `switch`

- 95% of the time, use `if-else`
- use `switch` to compare **one value** against a list of values.
  - runs a tiny bit faster than `if-else`.

## Delimiters

- white space that separates input data.
- For example,

```java
int num1 = scan.nextInt();
int num2 = scan.nextInt();

// picks up both num1 and num2 by ignoring the white space in between them.
// If user enters, "111              222" for the 2 numbers,
// num1 = 111 and num2 = 222.
```

- `scan.nextLine()`
  - reads the entire line.
  - nextLine captures every value on the next line including all the whitespace between each value.

## `scan.nextLine()` trap

- Happens if `scan.nextLine()` follows any method with delimiter pattern like `scan.nextInt`, `scan.nextLong`, ...
- `nextLine()` is wasted by reading an empty line.
- use a 'throw away' `scan.nextLine()` before the actual `scan.nextLine()`
