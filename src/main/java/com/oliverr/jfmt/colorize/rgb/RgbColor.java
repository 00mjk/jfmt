package com.oliverr.jfmt.colorize.rgb;

import com.oliverr.jfmt.util.NotNull;

import java.io.Serializable;
import java.util.Random;

public class RgbColor implements Serializable {

    private final String reset = "\u001b[0m";

    private int red;
    private int green;
    private int blue;
    private String result;

    public RgbColor(@NotNull int red, @NotNull int green, @NotNull int blue) {
        if(red < 0 || red > 255) throw new IllegalArgumentException("The red must be between 0 and 255.");
        if(green < 0 || green > 255) throw new IllegalArgumentException("The green must be between 0 and 255.");
        if(blue < 0 || blue > 255) throw new IllegalArgumentException("The blue must be between 0 and 255.");

        this.red = red;
        this.green = green;
        this.blue = blue;
        result = "\u001b[38;2;"+red+";"+green+";"+blue+"m";
    }

    public void print(@NotNull String text) { System.out.print(string(text)); }

    public void println(@NotNull String text) { System.out.println(string(text)); }

    public String string(@NotNull String text) { return result+text+reset; }

    public String random(@NotNull String text) {
        Random r = new Random();
        this.red = r.nextInt(255);
        this.green = r.nextInt(255);
        this.blue = r.nextInt(255);
        result = "\u001b[38;2;"+red+";"+green+";"+blue+"m";
        return string(text);
    }

}
