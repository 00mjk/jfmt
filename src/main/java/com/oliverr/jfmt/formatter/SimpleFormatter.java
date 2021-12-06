package com.oliverr.jfmt.formatter;

import com.oliverr.jfmt.util.NotNull;
import com.oliverr.jfmt.util.Replace;

public class SimpleFormatter {

    public static String stringf(@NotNull String text, Object... args) {
        if(args == null) return text;
        if(args.length == 0) return text;

        for(int i = 0; i < args.length; i++) text = Replace.all(text, "{"+i+"}", args[i].toString());

        return text;
    }

    public static void printf(@NotNull String text, Object... args) { System.out.print(stringf(text, args)); }

    public static void printfln(@NotNull String text, Object... args) { System.out.println(stringf(text, args)); }

}
