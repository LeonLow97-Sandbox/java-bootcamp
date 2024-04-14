# Data Types

|Primitive|Immutable Object|Mutable Object|
|:-:|:-:|:-:|
|`int`|`Integer`|Any object that can be updated.|
|`long`|`Long`|-|
|`double`|`Double`|-|
|`char`|`Character`|-|
|`boolean`|`Boolean`|-|
||`String`|-|

# Primitive Types

- Most basic data type in Java.
- The variable stores a single value.

# Immutable Object

- Immutable objects take up more size in memory.
- Immutable objects can be null; primitive types cannot.
- Immutable objects can call methods; primitive types cannot.

# Primitive vs Immutable Objects

- Favor Primitive over immutable objects (take up more space in memory).
- Use immutable objects when you have no other choice
    - ArrayList and LinkedList can only store objects.

# `null`

- reference that points to nothing.

# Immutable objects vs Mutable Objects

- Immutable object is safer because the state cannot be modified.
- References can be shared safely across your application.
    - Things cannot be changed when it shouldn't.
- Mutable objects are less safe because it can be modified after creation.
    - For mutable objects, avoid setting 2 variables equal to each other.
        - Use a copy constructor, create a new object.
    - For mutable objects, sharing references can lead to unintended side effects.

# `String` is an immutable object

























