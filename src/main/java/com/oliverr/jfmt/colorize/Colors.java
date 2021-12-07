package com.oliverr.jfmt.colorize;

public class Colors {

    // RESET
    protected final String reset = "\u001b[0m";
    public String getReset() { return reset; }

    // TEXT COLORS
    protected final String textBlack = "\u001b[30m";
    protected final String textRed = "\u001b[31m";
    protected final String textGreen = "\u001b[32m";
    protected final String textYellow = "\u001b[33m";
    protected final String textBlue = "\u001b[34m";
    protected final String textMagenta = "\u001b[35m";
    protected final String textCyan = "\u001b[36m";
    protected final String textWhite = "\u001b[37m";
    protected final String textBrightBlack = "\u001b[30;1m";
    protected final String textBrightRed = "\u001b[31;1m";
    protected final String textBrightGreen = "\u001b[32;1m";
    protected final String textBrightYellow = "\u001b[33;1m";
    protected final String textBrightBlue = "\u001b[34;1m";
    protected final String textBrightMagenta = "\u001b[35;1m";
    protected final String textBrightCyan = "\u001b[36;1m";
    protected final String textBrightWhite = "\u001b[37;1m";

    // BACKGROUND COLORS
    protected final String backgroundBlack = "\u001b[40m";
    protected final String backgroundRed = "\u001b[41m";
    protected final String backgroundGreen = "\u001b[42m";
    protected final String backgroundYellow = "\u001b[43m";
    protected final String backgroundBlue = "\u001b[44m";
    protected final String backgroundMagenta = "\u001b[45m";
    protected final String backgroundCyan = "\u001b[46m";
    protected final String backgroundWhite = "\u001b[47m";
    protected final String backgroundBrightBlack = "\u001b[40;1m";
    protected final String backgroundBrightRed = "\u001b[41;1m";
    protected final String backgroundBrightGreen = "\u001b[42;1m";
    protected final String backgroundBrightYellow = "\u001b[43;1m";
    protected final String backgroundBrightBlue = "\u001b[44;1m";
    protected final String backgroundBrightMagenta = "\u001b[45;1m";
    protected final String backgroundBrightCyan = "\u001b[46;1m";
    protected final String backgroundBrightWhite = "\u001b[47;1m";

    // DECORATIONS
    protected final String bold = "\u001b[1m";
    protected final String underline = "\u001b[4m";
    protected final String reversed = "\u001b[7m";

    public String convertEnumTextColor(CustomColorFormat.TColor color) {
        if(color == CustomColorFormat.TColor.BLACK) return textBlack;
        if(color == CustomColorFormat.TColor.RED) return textRed;
        if(color == CustomColorFormat.TColor.GREEN) return textGreen;
        if(color == CustomColorFormat.TColor.YELLOW) return textYellow;
        if(color == CustomColorFormat.TColor.BLUE) return textBlue;
        if(color == CustomColorFormat.TColor.MAGENTA) return textMagenta;
        if(color == CustomColorFormat.TColor.CYAN) return textCyan;
        if(color == CustomColorFormat.TColor.WHITE) return textWhite;
        if(color == CustomColorFormat.TColor.BRIGHT_BLACK) return textBrightBlack;
        if(color == CustomColorFormat.TColor.BRIGHT_RED) return textBrightRed;
        if(color == CustomColorFormat.TColor.BRIGHT_GREEN) return textBrightGreen;
        if(color == CustomColorFormat.TColor.BRIGHT_YELLOW) return textBrightYellow;
        if(color == CustomColorFormat.TColor.BRIGHT_BLUE) return textBrightBlue;
        if(color == CustomColorFormat.TColor.BRIGHT_MAGENTA) return textBrightMagenta;
        if(color == CustomColorFormat.TColor.BRIGHT_CYAN) return textBrightCyan;
        if(color == CustomColorFormat.TColor.BRIGHT_WHITE) return textBrightWhite;
        return "";
    }
    
    public String convertEnumBgColor(CustomColorFormat.BgColor color) {
        if(color == CustomColorFormat.BgColor.BLACK) return backgroundBlack;
        if(color == CustomColorFormat.BgColor.RED) return backgroundRed;
        if(color == CustomColorFormat.BgColor.GREEN) return backgroundGreen;
        if(color == CustomColorFormat.BgColor.YELLOW) return backgroundYellow;
        if(color == CustomColorFormat.BgColor.BLUE) return backgroundBlue;
        if(color == CustomColorFormat.BgColor.MAGENTA) return backgroundMagenta;
        if(color == CustomColorFormat.BgColor.CYAN) return backgroundCyan;
        if(color == CustomColorFormat.BgColor.WHITE) return backgroundWhite;
        if(color == CustomColorFormat.BgColor.BRIGHT_BLACK) return backgroundBrightBlack;
        if(color == CustomColorFormat.BgColor.BRIGHT_RED) return backgroundBrightRed;
        if(color == CustomColorFormat.BgColor.BRIGHT_GREEN) return backgroundBrightGreen;
        if(color == CustomColorFormat.BgColor.BRIGHT_YELLOW) return backgroundBrightYellow;
        if(color == CustomColorFormat.BgColor.BRIGHT_BLUE) return backgroundBrightBlue;
        if(color == CustomColorFormat.BgColor.BRIGHT_MAGENTA) return backgroundBrightMagenta;
        if(color == CustomColorFormat.BgColor.BRIGHT_CYAN) return backgroundBrightCyan;
        if(color == CustomColorFormat.BgColor.BRIGHT_WHITE) return backgroundBrightWhite;
        return "";
    }

    public String convertEnumDecoration(CustomColorFormat.TDecoration dec) {
        if(dec == CustomColorFormat.TDecoration.BOLD) return bold;
        if(dec == CustomColorFormat.TDecoration.REVERSED) return reversed;
        if(dec == CustomColorFormat.TDecoration.UNDERLINE) return underline;
        return "";
    }

}
