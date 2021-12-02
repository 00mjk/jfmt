package com.oliverr.jfmt;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formatter {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static String stringf(String text, Object... args) {
        if(args == null) return  text;
        if(args.length == 0) return  text;

        ArrayList<String> fmtChars = new ArrayList<>();

        for(int i = 0; i < text.length() - 1; i++) {
            if(text.charAt(i) == '%') {
                if(text.charAt(i + 1) == 'v') fmtChars.add("%v");
                else if(text.charAt(i + 1) == 's') fmtChars.add("%s");
                else if(text.charAt(i + 1) == 'S') fmtChars.add("%S");
                else if(text.charAt(i + 1) == 'b') fmtChars.add("%b");
                else if(text.charAt(i + 1) == 'd') fmtChars.add("%d");
                else if(text.charAt(i + 1) == 'o') fmtChars.add("%o");
                else if(text.charAt(i + 1) == 'f') fmtChars.add("%f");
                else if(text.charAt(i + 1) == 'F') fmtChars.add("%F");
                else if(text.charAt(i + 1) == 'r') fmtChars.add("%r");
            }
        }

        String res = text;
        for(int i = 0; i < fmtChars.size(); i++) {
            if(i < args.length) {
                if(fmtChars.get(i).equals("%v")) {
                    res = Replace.first(res, "%v", args[i].toString());
                    continue;
                }

                if(fmtChars.get(i).equals("%s")) {
                    if(args[i] instanceof String) {
                        res = Replace.first(res, "%s", (String)args[i]);
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%S")) {
                    if(args[i] instanceof String) {
                        res = Replace.first(res, "%S", ((String)args[i]).toUpperCase());
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%b")) {
                    if(args[i] instanceof Boolean) {
                        if(((Boolean) args[i])) res = Replace.first(res, "%b", "true");
                        else res = Replace.first(res, "%b", "false");
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%d")) {
                    if(args[i] instanceof Number) {
                        if(args[i].toString().contains(".")) res = Replace.first(res, "%d", args[i].toString().split("\\.")[0]);
                        else res = Replace.first(res, "%d", args[i].toString());
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%o")) {
                    if(args[i] instanceof Number) {
                        int num;
                        if(args[i].toString().contains(".")) num = Integer.parseInt(args[i].toString().split("\\.")[0]);
                        else num = Integer.parseInt(args[i].toString());
                        res = Replace.first(res, "%o", Integer.toBinaryString(num));
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%f")) {
                    if(args[i] instanceof Number) {
                        res = Replace.first(res, "%f", args[i].toString());
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%F")) {
                    if(args[i] instanceof Number) {
                        res = Replace.first(res, "%F", df.format(Double.parseDouble(args[i].toString())));
                    }
                    continue;
                }

                if(fmtChars.get(i).equals("%r")) {
                    res = Replace.first(res, "%r", reverse(args[i].toString()));
                    //continue;
                }
            }
        }

        return res;
    }

    public static void printf(String text, Object... args) { System.out.print(stringf(text, args)); }

    public static void printfln(String text, Object... args) { System.out.println(stringf(text, args)); }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) sb.append(s.charAt(i));
        return sb.toString();
    }

}
