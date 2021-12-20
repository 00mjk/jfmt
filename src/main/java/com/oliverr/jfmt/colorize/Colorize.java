package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.util.NotNull;
import com.oliverr.jfmt.util.Replace;

public class Colorize {

    private static final Colors colors = new Colors();

    public static String string(@NotNull String text, TColor textColor) {
        if(text == null) return "";
        return colors.convertEnumTextColor(textColor)+text+colors.getReset();
    }

    public static String string(@NotNull String text, TColor textColor, BgColor bgColor) {
        if(text == null) return "";
        return colors.convertEnumTextColor(textColor)+colors.convertEnumBgColor(bgColor)+text+colors.getReset();
    }

    public static String string(@NotNull String text, TColor textColor, BgColor bgColor, CustomColorFormat.TDecoration dec) {
        if(text == null) return "";
        return colors.convertEnumTextColor(textColor)+colors.convertEnumBgColor(bgColor)+colors.convertEnumDecoration(dec)+text+colors.getReset();
    }

    public static String colorf(@NotNull String text) {
        if(text == null) return "";

        text = Replace.all(text, "{reset}", colors.getReset());
        
        text = Replace.all(text, "{t:black}", colors.textBlack);
        text = Replace.all(text, "{t:red}", colors.textRed);
        text = Replace.all(text, "{t:green}", colors.textGreen);
        text = Replace.all(text, "{t:yellow}", colors.textYellow);
        text = Replace.all(text, "{t:blue}", colors.textBlue);
        text = Replace.all(text, "{t:magenta}", colors.textMagenta);
        text = Replace.all(text, "{t:cyan}", colors.textCyan);
        text = Replace.all(text, "{t:white}", colors.textWhite);
        text = Replace.all(text, "{t:bblack}", colors.textBrightBlack);
        text = Replace.all(text, "{t:bred}", colors.textBrightRed);
        text = Replace.all(text, "{t:bgreen}", colors.textBrightGreen);
        text = Replace.all(text, "{t:byellow}", colors.textBrightYellow);
        text = Replace.all(text, "{t:bblue}", colors.textBrightBlue);
        text = Replace.all(text, "{t:bmagenta}", colors.textBrightMagenta);
        text = Replace.all(text, "{t:bcyan}", colors.textBrightCyan);
        text = Replace.all(text, "{t:bwhite}", colors.textBrightWhite);
        
        text = Replace.all(text, "{bg:black}", colors.backgroundBlack);
        text = Replace.all(text, "{bg:red}", colors.backgroundRed);
        text = Replace.all(text, "{bg:green}", colors.backgroundGreen);
        text = Replace.all(text, "{bg:yellow}", colors.backgroundYellow);
        text = Replace.all(text, "{bg:blue}", colors.backgroundBlue);
        text = Replace.all(text, "{bg:magenta}", colors.backgroundMagenta);
        text = Replace.all(text, "{bg:cyan}", colors.backgroundCyan);
        text = Replace.all(text, "{bg:white}", colors.backgroundWhite);
        text = Replace.all(text, "{bg:bblack}", colors.backgroundBrightBlack);
        text = Replace.all(text, "{bg:bred}", colors.backgroundBrightRed);
        text = Replace.all(text, "{bg:bgreen}", colors.backgroundBrightGreen);
        text = Replace.all(text, "{bg:byellow}", colors.backgroundBrightYellow);
        text = Replace.all(text, "{bg:bblue}", colors.backgroundBrightBlue);
        text = Replace.all(text, "{bg:bmagenta}", colors.backgroundBrightMagenta);
        text = Replace.all(text, "{bg:bcyan}", colors.backgroundBrightCyan);
        text = Replace.all(text, "{bg:bwhite}", colors.backgroundBrightWhite);

        text = Replace.all(text, "{d:bold}", colors.bold);
        text = Replace.all(text, "{d:reversed}", colors.reversed);
        text = Replace.all(text, "{d:underline}", colors.underline);

        return text+ colors.getReset();
    }

}
