package com.oliverr.jfmt.colorize.rgb;

import com.oliverr.jfmt.util.NotNull;

public class Text256 extends Color256 {

    private final String reset = "\u001b[0m";
    private int code;
    private String result;

    public Text256(@NotNull int code) {
        if(code < 0 || code > 255) {
            throw new IllegalArgumentException("The code must be between 0 and 255.");
        } else {
            this.code = code;
            result = "\u001b[38;5;" + code + "m";
        }
    }

    @Override
    public void print(@NotNull String text) { System.out.print(string(text)); }

    @Override
    public void println(@NotNull String text) { System.out.println(string(text)); }

    @Override
    public String string(@NotNull String text) { return result+text+reset; }

    public void setCode(int code) {
        this.code = code;
        result = "\u001b[38;5;" + code + "m";
    }

}
