# Interface

## Three Layer Design

1. Presentation Layer
- Responsible for presenting the information to the user.

2. Service Layer
- Middleman between the presentation layer and the repository.
- Contains application's business logic.

3. Repository Layer
- Only layer than can access the data store.

## Interface

- Contract of Behavior.
- Classes with similar behavior should implement an interface.

```java

public class CheckingService implements AccountService {}
public class CreditService implements AccountService {}
```