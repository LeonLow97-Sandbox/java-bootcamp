# `SimpleDateFormat` class

- Creating an object of the `SimpleDateFormat` class.
- Use the `SimpleDateFormat` object to `parse()` a `Date` String.

# `setLenient(boolean)`

- `setLenient(boolean lenient)`: specify whether or not date/time parsing it to be lenient.
- [setLenient](https://dzone.com/articles/techtip-use-setlenient-method)
- The parse method in the `SimpleDateFormat` parses the date string that is in the incorrect format and returns the date object instead of throwing a java.text.ParseException.
    - However, the date returned is not what you expect.
    - To avoid this problem, call `setLenient(false)` on `SimpleDateFormat` instance.
    - That will make the `parse` method throw `ParseException` when the given input string is not in the specified format.

```java
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    formatter.setLenient(false);
```

```java
    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime(); // age in milliseconds
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        return (int) (days/365);
    }
```




