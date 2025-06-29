# HashMap

## ArrayList vs HashMap

- ArrayList and HashMap are collection types.
- ArrayList: every element is a **single** value.
- HashMap: every entry is a **pair** of data.

## HashMap

- stores key-value pairs
- useful when there is **parity** between data.
- HashMaps are not orders

  - Can't index a HashMap
  - Can only get the value using a key

- To create a hashmap:
  1. class type
  2. define key, value types
  3. create a new object of the `HashMap` class

```java
{Shirt: 4.99, Pants: 12.99}

HashMap<Object, Object> hashMap = new HashMap<Object, Object>()
```

## HashMap Methods

- Put
  - adds an entry to the HashMap
  - adds an entry if the key doesn't exist
  - updates a key if the key already exists
- Get
  - gets a value based on its key

# `hashCode()`

- When you add an `equals()` method, you must also add a `hashCode()` method.
- `hashCode()` assigns every object an integer.
- equal objects must have the **same hashCode**.
  - Otherwise, you will get bugs with hash-based collections.
- HashMap sorts keys into buckets
  - hashCode finds which bucket the key is in
  - Then, `equals()` checks for equality.
  - When you add an `equals()` method, you must always add a `hashCode()` method.
  - The `hashCode()` method must assign equal objects the same hashCode.

```java
// Assigns equal objects same hash code
public int hashCode() {
    return Objects.hash(make, year);
}
```
