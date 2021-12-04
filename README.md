# JFMT - Java Formatter
🪄 This is a simple Java library that allows you to format strings more easily.<br>
With this, you can also write colored outputs to the CLI with the ANSI Escape Codes.<br>

## Entities and symbols
`&n`: Line break<br>
`&N`: Double line break<br>
`&t`: Current time in a default format<br>
`&d`: Current date in a default format<br>
<br>
`$c`: Copyright (©)<br>
`$r`: Registered trademark (®)<br>
`$e`: Element of (∈)<br>
`$p`: N-ary product (∏)<br>
`$s`: N-ary summation (∑)<br>
`$tm`: Trademark (™)<br>
`$Ua`: Upwards Arrow (↑)<br>
`$Da`: Downwards Arrow (↓)<br>
`$La`: Leftwards Arrow (←)<br>
`$Ra`: Rightwards Arrow (→)<br>

## Format Characters:
`%v`: Value in the default (`.toString()`) format<br>
`%s`: String in a default format<br>
`%S`: String in uppercase<br>
`%b`: Boolean (**true**/**false**)<br>
`%d`: A round number (if you provide a float or a double, it'll split off everything after the '.')<br>
`%o`: Number in binary<br>
`%f`: A float or a double number<br>
`%f<n>:` A float or a double number rounded to **n** decimal places. (E.g.: `%f3`)<br>
`%r`: String in a reversed format<br>
`%t`: **java.util.Date** format - default is "_yyyy-MM-dd_"

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

### You can modify the default date and time format:
```java
Formatter.setDateFormat("dd-MM-yyyy");
Formatter.setTimeFormat("hh:mm:ss");
Formatter.stringf("Hi %s! Date: &d, Time: &t", "John");
// Result: "Hi John! Date: 03-12-2021, Time: 10:04:43" (ofc with the current date and time)
```

## Examples:
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