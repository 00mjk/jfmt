# JFMT - Java Formatter
🪄 This is a simple Java library that allows you to format strings more easily.<br>
With this, you can also write colored outputs to the CLI with the ANSI Escape Codes.<br>

## Format Characters:
`%v`: Value in the default (`.toString()`) format<br>
`%s`: String in a default format<br>
`%S`: String in uppercase<br>
`%b`: Boolean (**true**/**false**)<br>
`%d`: A round number (if you provide a float or a double, it'll split off everything after the '.')<br>
`%o`: Number in binary

Note: Assign the appropriate type of variable to the characters, otherwise, it will not be formatted.<br>
**For example:**
```java
String result = Formatter.stringf("This is a boolean: %b", "true");
//Result:
//This is a boolean: %b
//Because the passed value is not a boolean but a string.
//To make it work, you want to use it like this:
String result = Formatter.stringf("This is a boolean: %b", true);
```

## Formatter Examples:
### stringf
```java
String result = Formatter.stringf("Hi %s! You are %d years old.", "Josh", 17);
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