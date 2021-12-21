package com.oliverr.jfmt.formatter;

import com.oliverr.jfmt.util.NotNull;
import com.oliverr.jfmt.util.Nullable;
import com.oliverr.jfmt.util.Replace;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReplaceEntities {

    protected String entitiesAndSymbols(@NotNull String text, @Nullable String dateFormat, @Nullable String timeFormat) {
        if(text == null) return "";
        if(dateFormat == null) dateFormat = "yyyy-MM-dd";
        if(timeFormat == null) timeFormat = "hh:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        SimpleDateFormat sdf2 = new SimpleDateFormat(timeFormat);

        text = Replace.all(text, "&n", "\n");
        text = Replace.all(text, "&N", "\n\n");
        text = Replace.all(text, "&t", sdf2.format(new Date()));
        text = Replace.all(text, "&d", sdf.format(new Date()));

        text = Replace.all(text, "$c", "©");
        text = Replace.all(text, "$r", "®");
        text = Replace.all(text, "$e", "∈");
        text = Replace.all(text, "$p", "∏");
        text = Replace.all(text, "$s", "∑");
        text = Replace.all(text, "$x", "±");
        text = Replace.all(text, "$2", "²");
        text = Replace.all(text, "$3", "³");
        text = Replace.all(text, "$tm", "™");
        text = Replace.all(text, "$Ua", "↑");
        text = Replace.all(text, "$Da", "↓");
        text = Replace.all(text, "$La", "←");
        text = Replace.all(text, "$Ra", "→");

        return text;
    }

}
