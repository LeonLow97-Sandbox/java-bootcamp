# Stream Pipeline

---

## Lambda Expression

1. receives each element
2. returns a boolean for each element

```java
filter(element -> {
  return boolean;
})
```

## Stream Pipeline

- Loops can get messy
- Looping an ArrayList is tedious
- Stream Pipeline is a serious of functions.

```java
prices.stream()
  .filter(price -> {
    return price < 5;>
  })
  .map(price -> {  // ends the terminal
    return price * 1.13
  })

// Cleaner syntax
// remove "return" if only one line of code
prices.stream()
    .filter((price) -> price < 5)
    .forEach((price) -> System.out.println(price));
```

1. Sequence of elements that can run through a pipeline.
2. Filters elements less than 5.

- Filters an element based on a boolean
- uses a lambda expression

3. Map updates every price.

## Functions that ends terminal of stream pipeline

- Terminal operations signifies the end of a stream pipeline.

```java
forEach(element -> {
  // add code
})

// From a ArrayList
// Returns the updated sequence as a List
collect(Collectors.toList())
```

## Chaining intermediate operations

```java
// receives each element
// returns updated element
// intermediate operation
map(element -> {
    return updated element;
})
```

```java
// Chaining 2 intermediate operations
updatePrices.addAll(prices.stream()
    .filter((price) -> price < 5)
    .map((price) -> price * 1.13)
    .collect(Collectors.toList()));
```
