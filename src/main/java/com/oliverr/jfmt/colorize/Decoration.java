package com.oliverr.jfmt.colorize;

import com.oliverr.jfmt.util.NotNull;

public class Decoration {

    private static final Colors c = new Colors();

    public static String bold(@NotNull String background) { return c.bold+background+c.getReset(); }
    public static String underline(@NotNull String background) { return c.underline+background+c.getReset(); }
    public static String reversed(@NotNull String background) { return c.reversed+background+c.getReset(); }

}
