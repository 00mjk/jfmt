package com.oliverr.jfmt.util;

public class Print {

    public static void array(@NotNull int[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull double[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull float[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull byte[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull long[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull short[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull char[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull boolean[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    public static void array(@NotNull String[] array, @Nullable String separator) {
        if(array == null) return;
        if(separator == null) separator = " ";
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++) res[i] = array[i]+"";
        printArray(res, separator);
    }

    private static void printArray(@NotNull String[] array, @NotNull String character) {
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) System.out.print(array[i]);
            else System.out.print(array[i] + character);
        }
        System.out.println();
    }

}
