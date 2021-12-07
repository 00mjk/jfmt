# Colorize Examples

## CustomColorFormat
```java
// This class provides 4 constructors.
// Examples:

// 1. The text color is default, the background color is default, no decoration
CustomColorFormat ccf1 = new CustomColorFormat();

// 2. The text color is given, the background color is default, no decoration
CustomColorFormat ccf2 = new CustomColorFormat(CustomColorFormat.TColor.BLACK);

// 3. The text color is given, the background color is given, no decoration
CustomColorFormat ccf3 = new CustomColorFormat(CustomColorFormat.TColor.BLACK, CustomColorFormat.BgColor.BRIGHT_RED);

// 4. all values are given
CustomColorFormat ccf4 = new CustomColorFormat(CustomColorFormat.TColor.BLACK, CustomColorFormat.BgColor.BRIGHT_RED, CustomColorFormat.TDecoration.UNDERLINE);

// Methods:
CustomColorFormat ccf = new CustomColorFormat(); -> // Empty constructor
ccf.stringf(); -> // Returns a string with the ccf's format. It's like Formatter.stringf() function, you can use it like that.
ccf.string(); -> // Returns a string with the ccf's format.
ccf.print();
ccf.println();
```

<hr>

## TextColor, BackgroundColor, Decoration
```java
// The TextColor supports 16 text colors.
// Example: 
TextColor.red("This is a red text."); // Returns a red string.

// The BackgroundColor supports 16 text colors as well.
// Example:
BackgroundColor.red("This is a text with red background.");

// Decoration has 3 methods:
Decoration.bold("Bold text");
Decoration.underline("Underline text");
Decoration.reversed("Reversed text");

// You can combine the methods:
TextColor.red(BackgroundColor.black("Red text with black background."));
```