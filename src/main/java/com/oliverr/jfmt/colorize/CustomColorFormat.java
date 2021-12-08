package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.formatter.Formatter;
import com.oliverr.jfmt.util.NotNull;

import java.io.Serializable;

public class CustomColorFormat implements Serializable {

    private String color = "";
    private String bgColor = "";
    private String decoration = "";

    private final Colors colors = new Colors();

    public CustomColorFormat() {
        color = "";
        bgColor = "";
        decoration = "";
    }

    public CustomColorFormat(TColor tColor) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = "";
        decoration = "";
    }

    public CustomColorFormat(TColor tColor, BgColor bgc) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = colors.convertEnumBgColor(bgc);
        decoration = "";
    }

    public CustomColorFormat(TColor tColor, BgColor bgc, TDecoration dec) {
        color = colors.convertEnumTextColor(tColor);
        bgColor = colors.convertEnumBgColor(bgc);
        decoration = colors.convertEnumDecoration(dec);
    }

    public String stringf(@NotNull String text, Object... args) {
        text = Formatter.stringf(text, args);
        return getColor()+getBgColor()+getDecoration()+text+colors.getReset();
    }
    public String string(@NotNull String text) { return getColor()+getBgColor()+getDecoration()+text+colors.getReset(); }
    public void print(@NotNull String text) { System.out.print(string(text)); }
    public void println(@NotNull String text) { System.out.println(string(text)); }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) return true;
        if(!(obj instanceof CustomColorFormat)) return false;
        CustomColorFormat ccf = (CustomColorFormat)obj;
        return this.getColor().equals(ccf.getColor()) && this.getBgColor().equals(ccf.getBgColor()) && this.getDecoration().equals(ccf.getDecoration());
    }

    @Override
    public String toString() {
        return colors.getReset()+getColor()+getBgColor()+getDecoration()+"Test text"+colors.getReset();
    }

    public enum TColor {
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE,
        BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW, BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, BRIGHT_WHITE;
    }

    public enum BgColor {
        BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE,
        BRIGHT_BLACK, BRIGHT_RED, BRIGHT_GREEN, BRIGHT_YELLOW, BRIGHT_BLUE, BRIGHT_MAGENTA, BRIGHT_CYAN, BRIGHT_WHITE;
    }

    public enum TDecoration {
        BOLD, UNDERLINE, REVERSED
    }

    public String getColor() { return color; }
    public void setColor(TColor color) { this.color = colors.convertEnumTextColor(color); }

    public String getBgColor() { return bgColor; }
    public void setBgColor(BgColor bgColor) { this.bgColor = colors.convertEnumBgColor(bgColor); }

    public String getDecoration() { return decoration; }
    public void setDecoration(TDecoration decoration) { this.decoration = colors.convertEnumDecoration(decoration); }

}
