package com.oliverr.jfmt;

public class Main {

    private static final String github = "github.com/0l1v3rr/jfmt";
    private static final String version = "v1.0.0";

    public static void main(String[] args) {
        System.out.println("\t--==<[{ Java Formatter }]>==--");
        Formatter.printfln("GitHub: %v", github);
        Formatter.printfln("Version: %v", version);
        System.out.println("Read README.md for more information.");
    }

}
