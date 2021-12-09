package com.oliverr.jfmt.colorize.rgb;

import com.oliverr.jfmt.util.NotNull;

public abstract class Color256 {

    public abstract void print(@NotNull String text);
    public abstract void println(@NotNull String text);
    public abstract String string(@NotNull String text);
    public abstract String random(@NotNull String text);
    public abstract void setCode(int code);

}
