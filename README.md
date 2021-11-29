# JFMT - Java Formatter
🪄 This is a simple Java library that allows you to format strings more easily.<br>
With this, you can also write colored outputs to the CLI with the ANSI Escape Codes.<br>

## Formatter Examples:
### stringf
```java
String result = Formatter.stringf("Hi %v! You are %v years old.", "Josh", 17);
// Result:
// Hi Josh! You are 17 years old.
```

### printf, printfln
```java
Formatter.printf("%v is a %v.", "John", "goat");
// Output:
// John is a goat.
```

### Replace.all
```java
String result = Replace.all("I love beer with beer.", "beer", "water");
// Result:
// I love water with water.
```

### Replace.first
```java
String result = Replace.first("I love beer with beer.", "beer", "water");
// Result:
// I love water with beer.
```