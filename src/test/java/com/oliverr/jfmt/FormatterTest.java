package com.oliverr.jfmt;

import com.oliverr.jfmt.formatter.Formatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class FormatterTest {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");

    List<String> list = new ArrayList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    Set<Double> set = new HashSet<>();
    HashSet<Boolean> hashSet = new HashSet<>();

    @BeforeEach
    public void init() {
        com.oliverr.jfmt.formatter.Formatter.setDateFormat("yyyy-MM-dd");
        com.oliverr.jfmt.formatter.Formatter.setTimeFormat("hh:mm:ss");

        list.add("asd");
        list.add("dsa");
        arrayList.add(12);
        arrayList.add(344);
        set.add(44.43);
        set.add(12.43);
        hashSet.add(true);
        hashSet.add(false);
    }

    @Test
    public void testFormatter() {
        Assertions.assertEquals("Hi, my name is John!", com.oliverr.jfmt.formatter.Formatter.stringf("Hi, my name is %v!", "John"));
        Assertions.assertEquals("Hi Jason, my name is John!", com.oliverr.jfmt.formatter.Formatter.stringf("Hi %v, my name is %v!", "Jason", "John"));
        Assertions.assertEquals("He is %v years old.", com.oliverr.jfmt.formatter.Formatter.stringf("%v is %v years old.", "He"));
        Assertions.assertEquals("Jason is 21 years old. %v", com.oliverr.jfmt.formatter.Formatter.stringf("%v is %v years old. %v", "Jason", 21));

        Assertions.assertEquals("True: true", com.oliverr.jfmt.formatter.Formatter.stringf("True: %v", true));
        Assertions.assertEquals("True: true", com.oliverr.jfmt.formatter.Formatter.stringf("True: %b", true));
        Assertions.assertEquals("False: false", com.oliverr.jfmt.formatter.Formatter.stringf("False: %b", false));
        Assertions.assertEquals("This is not a boolean: %b", com.oliverr.jfmt.formatter.Formatter.stringf("This is not a boolean: %b", "asd"));
        Assertions.assertEquals("This is a string.", com.oliverr.jfmt.formatter.Formatter.stringf("%s is a string.", "This"));
        Assertions.assertEquals("%s is not a string.", com.oliverr.jfmt.formatter.Formatter.stringf("%s is not a string.", 33));
        Assertions.assertEquals("%s is not a string.", com.oliverr.jfmt.formatter.Formatter.stringf("%s is not a string.", true));
        Assertions.assertEquals("This is a string, and this is true!", com.oliverr.jfmt.formatter.Formatter.stringf("%s is a string, and this is %b!", "This", true));
        Assertions.assertEquals("a b true", com.oliverr.jfmt.formatter.Formatter.stringf("%v %s %b", "a", "b", true));
        Assertions.assertEquals("%s %b", com.oliverr.jfmt.formatter.Formatter.stringf("%s %b", 33.1, "asd"));
        Assertions.assertEquals("This is a real number: 33.1", com.oliverr.jfmt.formatter.Formatter.stringf("This is a real number: %v", 33.1));

        Assertions.assertEquals("This is an uppercase string: THIS", com.oliverr.jfmt.formatter.Formatter.stringf("This is an uppercase string: %S", "this"));
        Assertions.assertEquals("This is not an uppercase string: This", com.oliverr.jfmt.formatter.Formatter.stringf("This is not an uppercase string: %s", "This"));

        Assertions.assertEquals("This is a number: 12", com.oliverr.jfmt.formatter.Formatter.stringf("This is a number: %d", 12));
        Assertions.assertEquals("This is not a number: %d", com.oliverr.jfmt.formatter.Formatter.stringf("This is not a number: %d", "asd"));
        Assertions.assertEquals("This is a float: 12", com.oliverr.jfmt.formatter.Formatter.stringf("This is a float: %d", 12.32));
        Assertions.assertEquals("This is a float too: 30", com.oliverr.jfmt.formatter.Formatter.stringf("This is a float too: %d", 30.3213435154));
        Assertions.assertEquals("Hi Josh! You are 17 years old.", com.oliverr.jfmt.formatter.Formatter.stringf("Hi %s! You are %d years old.", "Josh", 17));

        Assertions.assertEquals("Binary: 1100", com.oliverr.jfmt.formatter.Formatter.stringf("Binary: %o", 12));
        Assertions.assertEquals("NaN: %o", com.oliverr.jfmt.formatter.Formatter.stringf("NaN: %o", "asd"));
        Assertions.assertEquals("1100", com.oliverr.jfmt.formatter.Formatter.stringf("%o", 12.3231));
        Assertions.assertEquals("255: 11111111", com.oliverr.jfmt.formatter.Formatter.stringf("255: %o", 255));

        Assertions.assertEquals("17", com.oliverr.jfmt.formatter.Formatter.stringf("%f", 17));
        Assertions.assertEquals("17.1", com.oliverr.jfmt.formatter.Formatter.stringf("%f", 17.1));
        Assertions.assertEquals("Float: 20.32431", com.oliverr.jfmt.formatter.Formatter.stringf("Float: %f", 20.32431));
        Assertions.assertEquals("NaN: %f", com.oliverr.jfmt.formatter.Formatter.stringf("NaN: %f", "fe"));
        Assertions.assertEquals("Two: 18.43131, 18.43", com.oliverr.jfmt.formatter.Formatter.stringf("Two: %f, %f", 18.43131, 18.43));

        Assertions.assertEquals("indulagorogaludni", com.oliverr.jfmt.formatter.Formatter.stringf("%r", "indulagorogaludni"));
        Assertions.assertEquals("asdasd", com.oliverr.jfmt.formatter.Formatter.stringf("%r", "dsadsa"));
        Assertions.assertEquals("Reversed: nhoJ", com.oliverr.jfmt.formatter.Formatter.stringf("Reversed: %r", "John"));
        Assertions.assertEquals("Reversed num: 32", com.oliverr.jfmt.formatter.Formatter.stringf("Reversed num: %r", 23));
        Assertions.assertEquals("eurt", com.oliverr.jfmt.formatter.Formatter.stringf("%r", true));

        Assertions.assertEquals(sdf.format(new Date()), com.oliverr.jfmt.formatter.Formatter.stringf("%t", new Date()));
        Assertions.assertEquals("Date: "+sdf.format(new Date()), com.oliverr.jfmt.formatter.Formatter.stringf("Date: %t", new Date()));
        Assertions.assertEquals("Not a Date: %t", com.oliverr.jfmt.formatter.Formatter.stringf("Not a Date: %t", "asd"));

        Assertions.assertEquals("Line break: \n", com.oliverr.jfmt.formatter.Formatter.stringf("Line break: &n"));
        Assertions.assertEquals("Double: \n\n", com.oliverr.jfmt.formatter.Formatter.stringf("Double: &N"));
        Assertions.assertEquals(sdf2.format(new Date()), com.oliverr.jfmt.formatter.Formatter.stringf("&t"));
        Assertions.assertEquals(sdf.format(new Date()), com.oliverr.jfmt.formatter.Formatter.stringf("&d"));
        Assertions.assertEquals("Number: 32.123", com.oliverr.jfmt.formatter.Formatter.stringf("%s: %f", "Number", 32.123));

        Assertions.assertEquals("13.12", com.oliverr.jfmt.formatter.Formatter.stringf("%f2", 13.12113211));
        Assertions.assertEquals("13.134", com.oliverr.jfmt.formatter.Formatter.stringf("%f3", 13.1341211));
        Assertions.assertEquals("20.32334, 20.3", com.oliverr.jfmt.formatter.Formatter.stringf("%f, %f1", 20.32334, 20.32334));
        Assertions.assertEquals("NaN: %f5", com.oliverr.jfmt.formatter.Formatter.stringf("NaN: %f5", "NaN"));
        Assertions.assertEquals("12.42345a", com.oliverr.jfmt.formatter.Formatter.stringf("%fa", 12.42345));
        Assertions.assertEquals("13.12 13.134", com.oliverr.jfmt.formatter.Formatter.stringf("%f2 %f3", 13.12113211, 13.1341211));
        Assertions.assertEquals("22", com.oliverr.jfmt.formatter.Formatter.stringf("%f0", 22.1221321331));
        Assertions.assertEquals("22.1111111112", com.oliverr.jfmt.formatter.Formatter.stringf("%f92", 22.11111111111111));

        Assertions.assertEquals("ArrayList: [ \"12\" \"344\" ]", com.oliverr.jfmt.formatter.Formatter.stringf("ArrayList: %a", arrayList));
        Assertions.assertEquals("[ \"asd\" \"dsa\" ]", com.oliverr.jfmt.formatter.Formatter.stringf("%a", list));
        Assertions.assertEquals("[ \"44.43\" \"12.43\" ]", com.oliverr.jfmt.formatter.Formatter.stringf("%a", set));
        Assertions.assertEquals("[ \"false\" \"true\" ]", com.oliverr.jfmt.formatter.Formatter.stringf("%a", hashSet));
        Assertions.assertEquals("[ \"12\" \"344\" ], [ \"false\" \"true\" ]", com.oliverr.jfmt.formatter.Formatter.stringf("%a, %a", arrayList, hashSet));
        Assertions.assertEquals("Not Array: %a", Formatter.stringf("Not Array: %a", "afe"));

        //Assertions.assertEquals("", Formatter.stringf("", ""));
    }

}
