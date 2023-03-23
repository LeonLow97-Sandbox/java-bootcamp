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

```java
Map <Integer, Integer> tree = new TreeMap<>();

tree.put
tree.get
tree.containsKey
```
