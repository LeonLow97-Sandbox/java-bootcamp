# BigDecimal

- Favor BigDecimal immutable object over double type.
- For double, not all decimals can be represented accurately, could lose precision. In the world of finance or data analysis, precision is important.
- Able to represent all decimals exactly.

```java
BigDecimal x = new BigDecimal("0.1");

BigDecimal y = new BigDecimal("0.2");

System.out.println(x.add(y));
System.out.println(y.subtract(x));
```
