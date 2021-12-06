# JFMT - Java Formatter
<img width="200px" src="./.github/images/logo.png" alt="Logo" title="Logo">
<hr>

🔬 This is a simple Java library that allows you to format strings more easily.<br>
With this, you can also write colored outputs to the CLI with the ANSI Escape Codes.<br>

## Table of Contents
- [Formatter](#formatter)<br>
  - [Entities and symbols](#entities-and-symbols)
  - [Format Characters](#format-characters)
    - [Modifying the default date and time format](#you-can-modify-the-default-date-and-time-format)
- [Simple Formatter](#simple-formatter)
- [Examples](docs/FORMAT-EXAMPLES.md)
- [License](#license)

<hr>

## Formatter
The `Formatter.stringf()` method is a function, which provides you the ability to format strings more easily.<br>
It supports [Entities](#entities-and-symbols), [Symbols](#entities-and-symbols), and [Format Characters](#format-characters).
### Entities and symbols
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

### Format Characters
`%v`: Value in the default (`.toString()`) format<br>
`%s`: String in a default format<br>
`%S`: String in uppercase<br>
`%b`: Boolean (**true**/**false**)<br>
`%d`: A round number (if you provide a float or a double, it'll split off everything after the '.')<br>
`%o`: Number in binary<br>
`%f`: A float or a double number<br>
`%f<n>:` A float or a double number rounded to **n** decimal places. (E.g.: `%f3`)<br>
`%r`: String in a reversed format<br>
`%t`: **java.util.Date** format - default is "_yyyy-MM-dd_"<br>
`%a`: List, ArrayList, Set, HashSet in a format like this: [ "element1" "element2" ]

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

#### You can modify the default date and time format:
```java
Formatter.setDateFormat("dd-MM-yyyy");
Formatter.setTimeFormat("hh:mm:ss");
Formatter.stringf("Hi %s! Date: &d, Time: &t", "John");
// Result: "Hi John! Date: 03-12-2021, Time: 10:04:43" (ofc with the current date and time)
```

<hr>

## Simple Formatter
The `SimpleFormatter`'s `stringf()` method is easier to use, and it's faster than the `Formatter.stringf()`, but it knows less.<br>
It does not support entities and characters.<br>
If you want to use this method, you pass the arguments like this: "{0}, {1}"<br>
The 0th argument is the first argument, you pass.<br>
You can use it multiple times.<br>
**Example:**
```java
String result = SimpleFormatter.stringf("{0} is {1} years old.", "John", 17);
// Result:
// John is 17 years old.
```
See more examples [here](docs/FORMAT-EXAMPLES.md)

<hr>

## License
This library is licensed under the terms of the [MIT License](LICENSE)