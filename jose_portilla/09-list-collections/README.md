# Regular Arrays (Limited)

- Size is fixed (limited usage)

```java
// This way of adding an extra element to array is cumbersome
String[] animals = new String[] {"dog", "cat", "hen"};

String[] moreAnimals = new String[4]
String[] moreAnimals = Arrays.copyOf(animals, animals.length)
moreAnimals[4] = "ant"
```

# List

- `ArrayList` and `LinkedList` do not have a fixed size
- `ArrayList` generally preferred over `LinkedList`
- Different in how they store data.
- Retrieving elements from a LinkedList is very slow.
- Both are of type `List`
  - when 2 objects share the same type, this is _polymorphism_.
- `List<String>`, `List<Double>`, ...
  - telling the list to only store values of this type.

# Methods of `ArrayList` and `LinkedList`

- `add` method to add an element to the list.
- Has the capacity to dynamically resize.
  - ArrayList starts with a **capacity of 10** and then **adds 5 to capacity** subsequently as elements get added pass the limit.
- Backed by an underlying array.
- `size()`, `get()`, `set()`, `remove()`

## `ArrayList` vs `LinkedList`

- **ArrayList**: retrieving elements.
- **LinkedList**: adding/removing elements from the middle
- Use ArrayList over LinkedList
  - Fast at retrieving elements
  - Fast at operations from the end of the list.
  - Slow at adding/removing elements from the middle.

## `equals` method for objects

- `==` compares the references of the object
- `equals`compares the references of the object
- If 2 objects are equal but have different references, it returns false, this is bad.
- Returns `true` if 2 references are equal.

## `contains` method in ArrayList

- Loops through the ArrayList and compares with the target.

```java
City paris = new City("Paris", 2161000);
ArrayList<City> cities = new ArrayList<>();
cities.add(new City("Paris", 2161000));
cities.add(new City("Florence", 382258));

System.out.println(cities.contains(paris));
```

## Overriding `equals`

- `@Override`
- When you override `equals`, you must override `hashcode`.

```java
// Overrides the default `equals` method in Java
@Override
public boolean equals(Object o) {
    if (o == this)
        return true;
    if (!(o instanceof City)) {
        return false;
    }
    City city = (City) o;
    return Objects.equals(name, city.name) && population == city.population;
}

@Override
public int hashCode() {
    return Objects.hash(name, population);
}
```
