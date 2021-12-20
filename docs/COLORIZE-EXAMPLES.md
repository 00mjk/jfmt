# Colorize Examples

## CustomColorFormat
```java
// This class provides 4 constructors.
// Examples:

// 1. The text color is default, the background color is default, no decoration
CustomColorFormat ccf1 = new CustomColorFormat();

// 2. The text color is given, the background color is default, no decoration
CustomColorFormat ccf2 = new CustomColorFormat(TColor.BLACK);

// 3. The text color is given, the background color is given, no decoration
CustomColorFormat ccf3 = new CustomColorFormat(TColor.BLACK, BgColor.BRIGHT_RED);

// 4. all values are given
CustomColorFormat ccf4 = new CustomColorFormat(TColor.BLACK, BgColor.BRIGHT_RED, TDecoration.UNDERLINE);

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

<hr>

## Colorize.colorf()
```java
System.out.println(Colorize.colorf("{t:yellow}This is a yellow text."));
System.out.println(Colorize.colorf("{t:bgreen}This is a green text. {reset}This is a text in default format."));
System.out.println(Colorize.colorf("{bg:bred}This is a text with Bright Red background."));
System.out.println(Colorize.colorf("{d:bold}This is a bold text."));
System.out.println(Colorize.colorf("{t:black}{bg:white}This is a black text with white background."));
```
### Colors:
| Name text | Description text |
| ------------- | -------------- |
| {reset}       | Default  format |
| {t:black}     | Black  text |
| {t:red}       | Red  text |
| {t:green}     | Green  text |
| {t:yellow}    | Yellow  text |
| {t:blue}      | Blue  text |
| {t:magenta}   | Magenta  text |
| {t:cyan}      | Cyan  text |
| {t:white}     | White  text |
| {t:bblack}    | Bright Black text |
| {t:bred}      | Bright Red text |
| {t:bgreen}    | Bright Green text |
| {t:byellow}   | Bright Yellow text |
| {t:bblue}     | Bright Blue text |
| {t:bmagenta}  | Bright Magenta text |
| {t:bcyan}     | Bright Cyan text |
| {t:bwhite}    | Bright White text |
| {bg:black}    | Black text |
| {bg:red}      | Red text |
| {bg:green}    | Green text |
| {bg:yellow}   | Yellow text |
| {bg:blue}     | Blue text |
| {bg:magenta}  | Magenta text |
| {bg:cyan}     | Cyan text |
| {bg:white}    | White text |
| {bg:bblack}   | Bright Black text |
| {bg:bred}     | Bright Red text |
| {bg:bgreen}   | Bright Green text |
| {bg:byellow}  | Bright Yellow text |
| {bg:bblue}    | Bright Blue text |
| {bg:bmagenta} | Bright Magenta text |
| {bg:bcyan}    | Bright Cyan text |
| {bg:bwhite}   | Bright White text |
| {d:bold}      | Bold text |
| {d:reversed}  | Reversed text |
| {d:underline} | Underline text |