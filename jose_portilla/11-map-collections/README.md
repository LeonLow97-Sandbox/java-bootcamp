# Map

- **HashMap**: unordered collection of key-value pairs.
- **TreeMap**: ordered collection of key-value pairs.
- They both share the same type `Map`, that is polymorphism.

## `HashMap`

```java
Map map = new HashMap();

Map<String, Integer> map = new HashMap<>();
Map<Integer, String> map = new HashMap<>();

map.put("Airpods Max", 799) // adding key-value into the map
map.put("Tesla", 140000)
map.get("Tesla") // returns 140000
map.containsKey("Tesla") // returns true
```

## `TreeMap`

- TreeMaps are sorted in ascending order when moving from left to right.
- TreeMaps are sorted in ascending order when moving from top node to bottom.
- Traverse right if node value is higher than current node value, otherwise traverse left.
- The time to retrieve data depends on the tree depth.

```java
Map <Integer, Integer> tree = new TreeMap<>();

tree.put
tree.get
tree.containsKey
```

## Final Verdict

- Use `HashMap` if you don't care about order.
  - Provides fast lookup access.
  - Hashing a key locates the index of an entry.
- Use `TreeMap` only if you need entries to be sorted.
  - Sorts entries in ascending key order.
  - Time to retrieve data depends ont he tree depth.

## `HashMap` Equality

- Custom objects rely on the default `equals` and `hashCode`.
  - compares the objects based on their references.
- Your object must provide its own implementation of each method.

```java
public boolean equals(Object o) {
    if (o == this)
        return true;
    if (!(o instanceof Contact)) {
        return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(name, contact.name) && age == contact.age;
}

public int hashCode() {
    return Objects.hash(name, age);
}
```
