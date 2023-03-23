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

- Passing `super` class parent constructor inside the constructor of the child class.
- `super()` calls the parent constructor to update inherited fields.
- The child constructor updates the remaining fields.

## `@Override`

- The child class provides its own implementation from an inherited method from the parent class.
- `@Override`: ensures you are actually override a parent method in the child class.
  - without the `@Override` annotation, it still works but if you misspell the method name in the child class, it takes the method from the parent class instead.
  - witht the `@Override` annotation, it produces a compile error telling you that you misspelled the method name.

## `super`

- `super` refers to the parent class.
- `super()`: invokes the constructor of a parent class.
- `super.member`: access a member of the parent class.

## `abstract`

- `abstract class`: a class you cannot create objects from.
  - usually for providing inheritance to the child classes, when you don't want to create objects out of a parent class.
- `abstract method`: exposes behavior that a child must override.
  - `public abstract void wear();`