package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.util.NotNull;

public class TextColor {

    private static final Colors c = new Colors();

    public static String black(@NotNull String text) { return c.textBlack+text+c.getReset(); }
    public static String red(@NotNull String text) { return c.textRed+text+c.getReset(); }
    public static String green(@NotNull String text) { return c.textGreen+text+c.getReset(); }
    public static String yellow(@NotNull String text) { return c.textYellow+text+c.getReset(); }
    public static String blue(@NotNull String text) { return c.textBlue+text+c.getReset(); }
    public static String magenta(@NotNull String text) { return c.textMagenta+text+c.getReset(); }
    public static String cyan(@NotNull String text) { return c.textCyan+text+c.getReset(); }
    public static String white(@NotNull String text) { return c.textWhite+text+c.getReset(); }
    public static String brightBlack(@NotNull String text) { return c.textBrightBlack+text+c.getReset(); }
    public static String brightRed(@NotNull String text) { return c.textBrightRed+text+c.getReset(); }
    public static String brightGreen(@NotNull String text) { return c.textBrightGreen+text+c.getReset(); }
    public static String brightYellow(@NotNull String text) { return c.textBrightYellow+text+c.getReset(); }
    public static String brightBlue(@NotNull String text) { return c.textBrightBlue+text+c.getReset(); }
    public static String brightMagenta(@NotNull String text) { return c.textBrightMagenta+text+c.getReset(); }
    public static String brightCyan(@NotNull String text) { return c.textBrightCyan+text+c.getReset(); }
    public static String brightWhite(@NotNull String text) { return c.textBrightWhite+text+c.getReset(); }
    public static String reset(@NotNull String text) { return c.getReset()+text+c.getReset(); }

}
