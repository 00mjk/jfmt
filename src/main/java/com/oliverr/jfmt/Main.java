package com.oliverr.jfmt;

import com.oliverr.jfmt.colorize.Colorize;
import com.oliverr.jfmt.colorize.eightbit.Background256;
import com.oliverr.jfmt.colorize.eightbit.Color256;
import com.oliverr.jfmt.colorize.eightbit.Text256;
import com.oliverr.jfmt.colorize.rgb.*;
import com.oliverr.jfmt.formatter.Formatter;

public class Main {

    private static final String github = "github.com/0l1v3rr/jfmt";
    private static final String version = "v2.3.0";

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println(RgbText.rainbow("\t--==<[{ Java Formatter }]>==--"));
            System.out.println(Colorize.colorf(Formatter.stringf("{t:bgreen}GitHub:  {reset}%v", github)));
            System.out.println(Colorize.colorf(Formatter.stringf("{t:bcyan}Version: {reset}%v", version)));
            System.out.println(Colorize.colorf("{bg:black}{t:white}Read README.md for more information."));
        } else if(args[0].equals("basic-colors")) {
            basicColors();
        } else if(args[0].equals("256")) {
            colors256();
        }
    }

    private static void basicColors() {
        System.out.println();
        String line1 = Colorize.colorf("{reset}{d:bold}bold{reset} \t {d:reversed}reversed{reset} \t {d:underline}underline{reset}");
        String line2 = Colorize.colorf("{t:black}black{reset} \t {t:red}red{reset} \t {t:green}green{reset} \t  {t:yellow}yellow{reset}    {t:blue}blue{reset}    {t:magenta}magenta{reset} \t{t:cyan}cyan{reset}     {t:white}white{reset}");
        String line3 = Colorize.colorf("{t:bblack}b-black{reset}  {t:bred}b-red{reset} \t {t:bgreen}b-green{reset}  {t:byellow}b-yellow{reset}  {t:bblue}b-blue{reset}  {t:bmagenta}b-magenta{reset} \t{t:bcyan}b-cyan{reset}   {t:bwhite}b-white{reset}");
        String line4 = Colorize.colorf("{bg:black}black  {reset}  {bg:red}red   {reset}  {bg:green}green  {reset}  {bg:yellow}yellow  {reset}  {bg:blue}blue  {reset}  {bg:magenta}magenta   {reset}  {bg:cyan}cyan   {reset}  {bg:white}white  {reset}");
        String line5 = Colorize.colorf("{bg:bblack}b-black{reset}  {bg:bred}b-red {reset}  {bg:bgreen}b-green{reset}  {bg:byellow}b-yellow{reset}  {bg:bblue}b-blue{reset}  {bg:bmagenta}b-magenta {reset}  {bg:bcyan}b-cyan {reset}  {bg:bwhite}b-white{reset}");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println();
    }

    private static void colors256() {
        System.out.println(Colorize.colorf("{reset}"));
        System.out.println(Colorize.colorf("{d:bold}Text Colors:{reset}"));

        Color256 t = new Text256(1);
        System.out.print(Colorize.colorf("{reset}  "));
        for(int i = 1; i < 256; i++) {
            if(i % 16 == 0) t.println(Formatter.align(" "+i+"", 5));
            else t.print(Formatter.align(" "+i+"", 5));
            System.out.print(Colorize.colorf("{reset}  "));
            t.setCode(i);
        }

        System.out.println(Colorize.colorf("\n\n{d:bold}Background Colors:{reset}"));
        Color256 b = new Background256(1);
        System.out.print(Colorize.colorf("{reset}  "));
        for(int i = 1; i < 256; i++) {
            if(i % 16 == 0) b.println(Formatter.align(" "+i+"", 5));
            else b.print(Formatter.align(" "+i+"", 5));
            System.out.print(Colorize.colorf("{reset}  "));
            b.setCode(i);
        }

        System.out.println();
    }

}
