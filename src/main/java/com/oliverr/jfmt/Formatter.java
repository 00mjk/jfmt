package com.oliverr.jfmt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Formatter {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static String format = "yyyy-MM-dd";
    private static String time = "hh:mm:ss";

    public static String getTimeFormat() { return time; }
    public static void setTimeFormat(String time) { Formatter.time = time; }

    public static String getDateFormat() { return format; }
    public static void setDateFormat(String format) { Formatter.format = format; }

    private static SimpleDateFormat sdf = new SimpleDateFormat(getDateFormat());
    private static SimpleDateFormat sdf2 = new SimpleDateFormat(getTimeFormat());

    public static String stringf(String text, Object... args) {
        if(args == null) return  text;

        text = Replace.all(text, "&n", "\n");
        text = Replace.all(text, "&N", "\n\n");
        text = Replace.all(text, "&t", sdf2.format(new Date()));
        text = Replace.all(text, "&d", sdf.format(new Date()));

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
                else if(text.charAt(i + 1) == 't') fmtChars.add("%t");
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
                    continue;
                }

                if(fmtChars.get(i).equals("%t")) {
                    if(args[i] instanceof Date) {
                        res = Replace.first(res, "%t", sdf.format((Date)args[i]));
                    }
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
