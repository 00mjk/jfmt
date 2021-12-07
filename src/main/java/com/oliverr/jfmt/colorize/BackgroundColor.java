package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.util.NotNull;

public class BackgroundColor {

    private static final Colors c = new Colors();

    public static String black(@NotNull String background) { return c.backgroundBlack+background+c.getReset(); }
    public static String red(@NotNull String background) { return c.backgroundRed+background+c.getReset(); }
    public static String green(@NotNull String background) { return c.backgroundGreen+background+c.getReset(); }
    public static String yellow(@NotNull String background) { return c.backgroundYellow+background+c.getReset(); }
    public static String blue(@NotNull String background) { return c.backgroundBlue+background+c.getReset(); }
    public static String magenta(@NotNull String background) { return c.backgroundMagenta+background+c.getReset(); }
    public static String cyan(@NotNull String background) { return c.backgroundCyan+background+c.getReset(); }
    public static String white(@NotNull String background) { return c.backgroundWhite+background+c.getReset(); }
    public static String brightBlack(@NotNull String background) { return c.backgroundBrightBlack+background+c.getReset(); }
    public static String brightRed(@NotNull String background) { return c.backgroundBrightRed+background+c.getReset(); }
    public static String brightGreen(@NotNull String background) { return c.backgroundBrightGreen+background+c.getReset(); }
    public static String brightYellow(@NotNull String background) { return c.backgroundBrightYellow+background+c.getReset(); }
    public static String brightBlue(@NotNull String background) { return c.backgroundBrightBlue+background+c.getReset(); }
    public static String brightMagenta(@NotNull String background) { return c.backgroundBrightMagenta+background+c.getReset(); }
    public static String brightCyan(@NotNull String background) { return c.backgroundBrightCyan+background+c.getReset(); }
    public static String brightWhite(@NotNull String background) { return c.backgroundBrightWhite+background+c.getReset(); }
    public static String reset(@NotNull String background) { return c.getReset()+background+c.getReset(); }

}
