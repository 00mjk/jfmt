# Table of Contents
- [Table of Contents](#table-of-contents)
  - [Formatter](#formatter)
    - [Formatter.stringf](#formatterstringf)
    - [Formatter.printf, Formatter.printfln](#formatterprintf-formatterprintfln)
    - [Formatter.align](#formatteralign)
  - [Simple Formatter](#simple-formatter)
    - [SimpleFormatter.stringf](#simpleformatterstringf)
    - [SimpleFormatter.printf](#simpleformatterprintf)
  - [Replace](#replace)
    - [Replace.all](#replaceall)
    - [Replace.first](#replacefirst)
  - [Print](#print)
    - [Print.array](#printarray)

<hr>

## Formatter
### Formatter.stringf
```java
String result = Formatter.stringf("Hi %s! You are %d years old.", "Josh", 17);
// Result:
// Hi Josh! You are 17 years old.
```

### Formatter.printf, Formatter.printfln
```java
Formatter.printf("%v is a %v.", "John", "goat");
// Output:
// John is a goat.
```

### Formatter.align
This method will left align the string, using a specified character as the fill character.
```java
String res1 = Formatter.align("test", 10)
// res1: 'test      '

String res2 = Formatter.align("test", 10, 'x')
// res2: 'testxxxxxx'

String res3 = Formatter.align("test", 10, Align.RIGHT);
// res3: '      test'
```

<hr>

## Simple Formatter
### SimpleFormatter.stringf
```java
String result = SimpleFormatter.stringf("{0} is {1} years old.", "John", 17);
// Result:
// John is 17 years old.

String result2 = SimpleFormatter.stringf("{0}'s name is {0}", "John");
// Result #2:
// John's name is John
```

### SimpleFormatter.printf
```java
SimpleFormatter.printf("{1} is {0} years old.", 17, "John");
// Output:
// John is 17 years old.
```

<hr>

## Replace
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

<hr>

## Print
### Print.array
```java
int[] array1 = { 1, 4, 6, 0, 12 };
String[] array2 = { "a", "asd", "foo", "bar" };

Print.array(array1, ", ");
Print.array(array2, " --- ");

// Output:
// 1, 4, 6, 0, 12
// a --- asd --- foo --- bar
```