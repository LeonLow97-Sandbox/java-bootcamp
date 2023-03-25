# Higher Order Functions and Lambda (Streams)

1. Higher order functions need to know your intent.
2. You can express your intent in the form of a Lambda Expression.

## Types of Lambda Expressions

| Functional Interface |                      Lambda Expression                       |          Example           |
| :------------------: | :----------------------------------------------------------: | :------------------------: |
|       Consumer       |       Receives a parameter and produces a side-effect        |       `x -> {code}`        |
|      Predicate       |        Receives one parameter and produces a boolean         |  `x -> {return boolean}`   |
|       Function       |         Receives one parameter and returns any value         |   `x -> {return value}`    |
|      BiConsumer      |     Receives two parameters and produces a side-effect.      |     `(x,y) -> {code}`      |
|      Comparator      |        Receives two parameters and returns an integer        |  `(x,y) -> {return int}`   |
|    BinaryOperator    | Receives two parameters and returns a value of the same type | `(x, y) -> {return value}` |

## `Consumer`

```java
List<String> facts = Arrays.asList("Marie Curie was the first woman to win a Nobel Prize.",
        "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
        "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.");

// Higher level order function that relies on a Consumer
facts.forEach(fact -> System.out.println("Fact: " + fact));
```

## `Comparator`

```java
List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

// Sorts in ascending order
integers.sort((right, left) -> right.compareTo(left));
```

## `BiConsumer`

```java
Map<String, Integer> coffeeRatings = new HashMap<>();
coffeeRatings.put("Starbucks House Blend", 7);
coffeeRatings.put("Peet's French Roast", 8);
coffeeRatings.put("Intelligentsia Black Cat", 9);

coffeeRatings.forEach((key, value) -> System.out.println(key + " " + value));
```

## Stream Pipeline

```java
List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

prices.stream()
    .filter(price -> price > 100)
    .map(price -> price - 20)
    .sorted((right, left) -> right.compareTo(left))
    .map(price -> "$" + price)
    .forEach(price -> System.out.println(price));
```

## Terminal Operations

- Terminal Operations terminate the pipeline.

```java
List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
Double totalEarnings = earnings.stream().reduce(20.00, ((x, y) -> x + y));

List<String> aisles =
Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
String result =
        aisles.stream().filter(aisle -> aisle.equals("coffee")).findFirst().orElse(null);

List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
long count = numbers.stream().filter(number -> number == 1).count();
```

## Creating Streams

```java
// Creating Stream from Datasource: Array
String[] greetings = new String[] {"Hello!", "Hola!", "Bonjour!", "Hallo!"};
Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));

System.out.println("\n");

// Creating Stream from Datasource: File
try {
    Path path = Paths.get("chorus.txt");
    Files.lines(path).forEach(line -> System.out.println(line));
} catch (IOException ex) {
    System.out.println(ex);
}
```
