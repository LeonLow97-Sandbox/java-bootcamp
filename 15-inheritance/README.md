# Inheritance

- Understand how inheritance favors code reuse.
- Define a parent class that serves a foundation for child classes.
- Every child class inherits field/methods from a parent class.

```java
// Parent class
public class Parent {}

// Child class
public class Chid1 extends Parent {}
public class Child2 extends Parent {}
```

# Polymorphism

- Ability of an object to take on multiple forms.
- A child can take the form of its parent.
- Polymorphism purpose: Flexible and reusable code.

```java
// Both Child1 and Child2 from before inherits the Parent class.
public static void printPoly1(Child1 child1) {
  System.out.println(child1.getItem + "Child1")
}
public static void printPoly2(Child2 child1) {
  System.out.println(child2.getItem + "Child2")
}

// Instead of having repetitive code like this, we pass in the parent class
// where both child inherit from
public static void printPoly(Parent parent) {
  System.out.println(parent.getItem + parent.getClass().getSimpleName());
}
```

# Constructor


