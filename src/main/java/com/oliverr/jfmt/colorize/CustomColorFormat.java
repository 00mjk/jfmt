package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.formatter.Formatter;

public class CustomColorFormat {

    private String color = "";
    private String bgColor = "";
    private String decoration = "";

    private final Colors colors = new Colors();

    public CustomColorFormat() {
        color = "";
        bgColor = "";
        decoration = "";
    }

    public CustomColorFormat(TextColor tColor) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = "";
        decoration = "";
    }

    public CustomColorFormat(TextColor tColor, BackgroundColor bgc) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = colors.convertEnumBgColor(bgc);
        decoration = "";
    }

    public CustomColorFormat(TextColor tColor, BackgroundColor bgc, Decoration dec) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = colors.convertEnumBgColor(bgc);
        decoration = colors.convertEnumDecoration(dec);
    }

    public String stringf(String text, Object... args) {
        text = Formatter.stringf(text, args);
        return getColor()+getBgColor()+getDecoration()+text+colors.getReset();
    }
    public String string(String text) { return getColor()+getBgColor()+getDecoration()+text+colors.getReset(); }
    public void print(String text) { System.out.print(string(text)); }
    public void println(String text) { System.out.println(string(text)); }

    public enum TextColor {
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE,
        BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW, BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, BRIGHT_WHITE;
    }

    public enum BackgroundColor {
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE,
        BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW, BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, BRIGHT_WHITE;
    }

    public enum Decoration {
        BOLD, UNDERLINE, REVERSED
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getBgColor() { return bgColor; }
    public void setBgColor(String bgColor) { this.bgColor = bgColor; }

    public String getDecoration() { return decoration; }
    public void setDecoration(String decoration) { this.decoration = decoration; }

}
