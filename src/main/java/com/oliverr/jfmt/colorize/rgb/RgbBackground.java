package com.oliverr.jfmt.colorize.rgb;

import com.oliverr.jfmt.util.NotNull;

import java.util.Random;

public class RgbBackground extends RgbColor {

    private final String reset = "\u001b[0m";

    private int red;
    private int green;
    private int blue;
    private String result;

    public RgbBackground(@NotNull int red, @NotNull int green, @NotNull int blue) {
        if(red < 0 || red > 255) throw new IllegalArgumentException("The red must be between 0 and 255.");
        if(green < 0 || green > 255) throw new IllegalArgumentException("The green must be between 0 and 255.");
        if(blue < 0 || blue > 255) throw new IllegalArgumentException("The blue must be between 0 and 255.");

        this.red = red;
        this.green = green;
        this.blue = blue;
        result = "\u001b[48;2;"+red+";"+green+";"+blue+"m";
    }

    public void print(@NotNull String text) { System.out.print(string(text)); }

    public void println(@NotNull String text) { System.out.println(string(text)); }

    public String string(@NotNull String text) { return result+text+reset; }

    public static String random(@NotNull String text) {
        if(text == null) return "";
        Random r = new Random();
        RgbBackground rgb = new RgbBackground(255, 255, 255);
        rgb.red = r.nextInt(255);
        rgb.green = r.nextInt(255);
        rgb.blue = r.nextInt(255);
        rgb.result = "\u001b[48;2;"+rgb.red+";"+rgb.green+";"+rgb.blue+"m";
        return rgb.string(text);
    }

    public static String rainbow(@NotNull String text) {
        if(text == null) return "";
        StringBuilder sb = new StringBuilder();
        RgbBackground rgb = new RgbBackground(255, 255, 255);
        Random r = new Random();
        for(int i = 0; i < text.length(); i++) {
            rgb.red = r.nextInt(255);
            rgb.green = r.nextInt(255);
            rgb.blue = r.nextInt(255);
            sb.append("\u001b[48;2;").append(rgb.red).append(";").append(rgb.green).append(";").append(rgb.blue).append("m").append(text.charAt(i));
        }

        return sb.toString();
    }
    
}
