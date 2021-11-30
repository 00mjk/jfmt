package com.oliverr.jfmt;

public class Replace {

    public static String all(String text, String oldText, String newText) {
        if(oldText == null || oldText.equals("")) return text;
        if(newText == null) newText = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int k = 0;
            if (text.charAt(i) == oldText.charAt(k) && i + oldText.length() <= text.length()) {
                int j;

                for (j = i; j < i + oldText.length(); j++) {
                    if (text.charAt(j) != oldText.charAt(k)) break;
                    else k++;
                }
                if (j == i + oldText.length()) {
                    sb.append(newText);
                    i = j - 1;
                } else {
                    sb.append(text.charAt(i));
                }
            } else {
                sb.append(text.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String first(String text, String oldText, String newText) {
        if(oldText == null || oldText.equals("")) return text;
        if(newText == null) newText = "";

        StringBuilder sb = new StringBuilder();
        int i = 0;

        for (i = 0; i < text.length(); i++) {
            int k = 0;
            if (text.charAt(i) == oldText.charAt(k) && i + oldText.length() <= text.length()) {
                int j;

                for (j = i; j < i + oldText.length(); j++) {
                    if (text.charAt(j) != oldText.charAt(k)) break;
                    else k++;
                }
                if (j == i + oldText.length()) {
                    sb.append(newText);
                    i = j - 1;
                } else {
                    sb.append(text.charAt(i));
                }
                break;
            } else {
                sb.append(text.charAt(i));
            }
        }

        if(i < text.length() - 1) sb.append(text.substring(i + 1));

        return sb.toString();
    }

}
