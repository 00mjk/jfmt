package com.oliverr.jfmt;

import com.oliverr.jfmt.colorize.Colorize;
import com.oliverr.jfmt.formatter.Formatter;

public class Main {

    private static final String github = "github.com/0l1v3rr/jfmt";
    private static final String version = "v1.1";

    public static void main(String[] args) {
        System.out.println(Colorize.colorf("{t:yellow}\t--==<[{ Java Formatter }]>==--"));
        System.out.println(Colorize.colorf(Formatter.stringf("{t:bgreen}GitHub:  {reset}%v", github)));
        System.out.println(Colorize.colorf(Formatter.stringf("{t:bcyan}Version: {reset}%v", version)));
        System.out.println(Colorize.colorf("{bg:black}{t:white}Read README.md for more information."));
    }

}
