package com.oliverr.jfmt.colorize;

public class Colors {

    // RESET
    private final String reset = "\u001b[0m";
    public String getReset() { return reset; }

    // TEXT COLORS
    private final String textBlack = "\u001b[30m";
    private final String textRed = "\u001b[31m";
    private final String textGreen = "\u001b[32m";
    private final String textYellow = "\u001b[33m";
    private final String textBlue = "\u001b[34m";
    private final String textMagenta = "\u001b[35m";
    private final String textCyan = "\u001b[36m";
    private final String textWhite = "\u001b[37m";
    private final String textBrightBlack = "\u001b[30;1m";
    private final String textBrightRed = "\u001b[31;1m";
    private final String textBrightGreen = "\u001b[32;1m";
    private final String textBrightYellow = "\u001b[33;1m";
    private final String textBrightBlue = "\u001b[34;1m";
    private final String textBrightMagenta = "\u001b[35;1m";
    private final String textBrightCyan = "\u001b[36;1m";
    private final String textBrightWhite = "\u001b[37;1m";

    // BACKGROUND COLORS
    private final String backgroundBlack = "\u001b[40m";
    private final String backgroundRed = "\u001b[41m";
    private final String backgroundGreen = "\u001b[42m";
    private final String backgroundYellow = "\u001b[43m";
    private final String backgroundBlue = "\u001b[44m";
    private final String backgroundMagenta = "\u001b[45m";
    private final String backgroundCyan = "\u001b[46m";
    private final String backgroundWhite = "\u001b[47m";
    private final String backgroundBrightBlack = "\u001b[40;1m";
    private final String backgroundBrightRed = "\u001b[41;1m";
    private final String backgroundBrightGreen = "\u001b[42;1m";
    private final String backgroundBrightYellow = "\u001b[43;1m";
    private final String backgroundBrightBlue = "\u001b[44;1m";
    private final String backgroundBrightMagenta = "\u001b[45;1m";
    private final String backgroundBrightCyan = "\u001b[46;1m";
    private final String backgroundBrightWhite = "\u001b[47;1m";

    // DECORATIONS
    private final String bold = "\u001b[1m";
    private final String underline = "\u001b[4m";
    private final String reversed = "\u001b[7m";

    public String convertEnumTextColor(CustomColorFormat.TextColor color) {
        if(color == CustomColorFormat.TextColor.BLACK) return textBlack;
        if(color == CustomColorFormat.TextColor.RED) return textRed;
        if(color == CustomColorFormat.TextColor.GREEN) return textGreen;
        if(color == CustomColorFormat.TextColor.YELLOW) return textYellow;
        if(color == CustomColorFormat.TextColor.BLUE) return textBlack;
        if(color == CustomColorFormat.TextColor.MAGENTA) return textMagenta;
        if(color == CustomColorFormat.TextColor.CYAN) return textCyan;
        if(color == CustomColorFormat.TextColor.WHITE) return textWhite;
        if(color == CustomColorFormat.TextColor.BRIGHT_BLACK) return textBrightBlack;
        if(color == CustomColorFormat.TextColor.BRIGHT_RED) return textBrightRed;
        if(color == CustomColorFormat.TextColor.BRIGHT_GREEN) return textBrightGreen;
        if(color == CustomColorFormat.TextColor.BRIGHT_YELLOW) return textBrightYellow;
        if(color == CustomColorFormat.TextColor.BRIGHT_BLUE) return textBrightBlue;
        if(color == CustomColorFormat.TextColor.BRIGHT_MAGENTA) return textBrightMagenta;
        if(color == CustomColorFormat.TextColor.BRIGHT_CYAN) return textBrightCyan;
        if(color == CustomColorFormat.TextColor.BRIGHT_WHITE) return textBrightWhite;
        return "";
    }
    
    public String convertEnumBgColor(CustomColorFormat.BackgroundColor color) {
        if(color == CustomColorFormat.BackgroundColor.BLACK) return backgroundBlack;
        if(color == CustomColorFormat.BackgroundColor.RED) return backgroundRed;
        if(color == CustomColorFormat.BackgroundColor.GREEN) return backgroundGreen;
        if(color == CustomColorFormat.BackgroundColor.YELLOW) return backgroundYellow;
        if(color == CustomColorFormat.BackgroundColor.BLUE) return backgroundBlack;
        if(color == CustomColorFormat.BackgroundColor.MAGENTA) return backgroundMagenta;
        if(color == CustomColorFormat.BackgroundColor.CYAN) return backgroundCyan;
        if(color == CustomColorFormat.BackgroundColor.WHITE) return backgroundWhite;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_BLACK) return backgroundBrightBlack;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_RED) return backgroundBrightRed;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_GREEN) return backgroundBrightGreen;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_YELLOW) return backgroundBrightYellow;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_BLUE) return backgroundBrightBlue;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_MAGENTA) return backgroundBrightMagenta;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_CYAN) return backgroundBrightCyan;
        if(color == CustomColorFormat.BackgroundColor.BRIGHT_WHITE) return backgroundBrightWhite;
        return "";
    }

    public String convertEnumDecoration(CustomColorFormat.Decoration dec) {
        if(dec == CustomColorFormat.Decoration.BOLD) return bold;
        if(dec == CustomColorFormat.Decoration.REVERSED) return reversed;
        if(dec == CustomColorFormat.Decoration.UNDERLINE) return underline;
        return "";
    }

}
