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

        Formatter.setDecimalSeperator('.');
    }

    @Test
    public void testFormatter() {
        Assertions.assertEquals("Hi, my name is John!", Formatter.stringf("Hi, my name is %v!", "John"));
        Assertions.assertEquals("Hi Jason, my name is John!", Formatter.stringf("Hi %v, my name is %v!", "Jason", "John"));
        Assertions.assertEquals("He is %v years old.", Formatter.stringf("%v is %v years old.", "He"));
        Assertions.assertEquals("Jason is 21 years old. %v", Formatter.stringf("%v is %v years old. %v", "Jason", 21));

        Assertions.assertEquals("True: true", Formatter.stringf("True: %v", true));
        Assertions.assertEquals("True: true", Formatter.stringf("True: %b", true));
        Assertions.assertEquals("False: false", Formatter.stringf("False: %b", false));
        Assertions.assertEquals("True: TRUE", Formatter.stringf("True: %B", 1 == 1));
        Assertions.assertEquals("False: FALSE", Formatter.stringf("False: %B", 1 != 1));
        Assertions.assertEquals("This is not a boolean: %b", Formatter.stringf("This is not a boolean: %b", "asd"));
        Assertions.assertEquals("This is a string.", Formatter.stringf("%s is a string.", "This"));
        Assertions.assertEquals("%s is not a string.", Formatter.stringf("%s is not a string.", 33));
        Assertions.assertEquals("%s is not a string.", Formatter.stringf("%s is not a string.", true));
        Assertions.assertEquals("This is a string, and this is true!", Formatter.stringf("%s is a string, and this is %b!", "This", true));
        Assertions.assertEquals("a b true", Formatter.stringf("%v %s %b", "a", "b", true));
        Assertions.assertEquals("%s %b", Formatter.stringf("%s %b", 33.1, "asd"));
        Assertions.assertEquals("This is a real number: 33.1", Formatter.stringf("This is a real number: %v", 33.1));

        Assertions.assertEquals("This is an uppercase string: THIS", Formatter.stringf("This is an uppercase string: %S", "this"));
        Assertions.assertEquals("This is not an uppercase string: This", Formatter.stringf("This is not an uppercase string: %s", "This"));

        Assertions.assertEquals("This is a number: 12", Formatter.stringf("This is a number: %d", 12));
        Assertions.assertEquals("This is not a number: %d", Formatter.stringf("This is not a number: %d", "asd"));
        Assertions.assertEquals("This is a float: 12", Formatter.stringf("This is a float: %d", 12.32));
        Assertions.assertEquals("This is a float too: 30", Formatter.stringf("This is a float too: %d", 30.3213435154));
        Assertions.assertEquals("Hi Josh! You are 17 years old.", Formatter.stringf("Hi %s! You are %d years old.", "Josh", 17));

        Assertions.assertEquals("Binary: 1100", Formatter.stringf("Binary: %o", 12));
        Assertions.assertEquals("NaN: %o", Formatter.stringf("NaN: %o", "asd"));
        Assertions.assertEquals("1100", Formatter.stringf("%o", 12.3231));
        Assertions.assertEquals("255: 11111111", Formatter.stringf("255: %o", 255));

        Assertions.assertEquals("Decimal: 12", Formatter.stringf("Decimal: %i", 1100));
        Assertions.assertEquals("NaN: %i", Formatter.stringf("NaN: %i", "asd"));
        Assertions.assertEquals("255", Formatter.stringf("%i", 11111111));

        Assertions.assertEquals("17", Formatter.stringf("%f", 17));
        Assertions.assertEquals("17.1", Formatter.stringf("%f", 17.1));
        Assertions.assertEquals("Float: 20.32431", Formatter.stringf("Float: %f", 20.32431));
        Assertions.assertEquals("NaN: %f", Formatter.stringf("NaN: %f", "fe"));
        Assertions.assertEquals("Two: 18.43131, 18.43", Formatter.stringf("Two: %f, %f", 18.43131, 18.43));

        Assertions.assertEquals("indulagorogaludni", Formatter.stringf("%r", "indulagorogaludni"));
        Assertions.assertEquals("asdasd", Formatter.stringf("%r", "dsadsa"));
        Assertions.assertEquals("ASDASD", Formatter.stringf("%R", "dsadsa"));
        Assertions.assertEquals("Reversed: nhoJ", Formatter.stringf("Reversed: %r", "John"));
        Assertions.assertEquals("Reversed num: 32", Formatter.stringf("Reversed num: %r", 23));
        Assertions.assertEquals("eurt", Formatter.stringf("%r", true));

        Assertions.assertEquals(sdf.format(new Date()), Formatter.stringf("%t", new Date()));
        Assertions.assertEquals("Date: "+sdf.format(new Date()), Formatter.stringf("Date: %t", new Date()));
        Assertions.assertEquals("Not a Date: %t", Formatter.stringf("Not a Date: %t", "asd"));

        Assertions.assertEquals("Line break: \n", Formatter.stringf("Line break: &n"));
        Assertions.assertEquals("Double: \n\n", Formatter.stringf("Double: &N"));
        Assertions.assertEquals(sdf2.format(new Date()), Formatter.stringf("&t"));
        Assertions.assertEquals(sdf.format(new Date()), Formatter.stringf("&d"));
        Assertions.assertEquals("Number: 32.123", Formatter.stringf("%s: %f", "Number", 32.123));

        Assertions.assertEquals("13.12", Formatter.stringf("%f2", 13.12113211));
        Assertions.assertEquals("13.134", Formatter.stringf("%f3", 13.1341211));
        Assertions.assertEquals("20.32334, 20.3", Formatter.stringf("%f, %f1", 20.32334, 20.32334));
        Assertions.assertEquals("NaN: %f5", Formatter.stringf("NaN: %f5", "NaN"));
        Assertions.assertEquals("12.42345a", Formatter.stringf("%fa", 12.42345));
        Assertions.assertEquals("13.12 13.134", Formatter.stringf("%f2 %f3", 13.12113211, 13.1341211));
        Assertions.assertEquals("22", Formatter.stringf("%f0", 22.1221321331));
        Assertions.assertEquals("22.1111111112", Formatter.stringf("%f92", 22.11111111111111));

        Assertions.assertEquals("\"test\"", Formatter.stringf("%q", "test"));
        Assertions.assertEquals("text: \"a\"", Formatter.stringf("text: %q", "a"));

        //Assertions.assertEquals("", Formatter.stringf("", ""));
    }
    
    @Test
    public void alignTest() {
        Assertions.assertEquals("test", Formatter.align("test", 4));
        Assertions.assertEquals("tes", Formatter.align("test", 3));
        Assertions.assertEquals("te", Formatter.align("test", 2));
        Assertions.assertEquals("test ", Formatter.align("test", 5));
        Assertions.assertEquals("test      ", Formatter.align("test", 10));

        Assertions.assertEquals("test", Formatter.align("test", 4, 'x'));
        Assertions.assertEquals("tes", Formatter.align("test", 3, 'x'));
        Assertions.assertEquals("te", Formatter.align("test", 2, 'x'));
        Assertions.assertEquals("testx", Formatter.align("test", 5, 'x'));
        Assertions.assertEquals("testxxxxxx", Formatter.align("test", 10, 'x'));

        Assertions.assertEquals("test", Formatter.align("test", 4, Formatter.Align.RIGHT));
        Assertions.assertEquals("tes", Formatter.align("test", 3, Formatter.Align.RIGHT));
        Assertions.assertEquals("te", Formatter.align("test", 2, Formatter.Align.RIGHT));
        Assertions.assertEquals(" test", Formatter.align("test", 5, Formatter.Align.RIGHT));
        Assertions.assertEquals("      test", Formatter.align("test", 10, Formatter.Align.RIGHT));

        Assertions.assertEquals("test", Formatter.align("test", 4, 'x', Formatter.Align.RIGHT));
        Assertions.assertEquals("tes", Formatter.align("test", 3, 'x', Formatter.Align.RIGHT));
        Assertions.assertEquals("te", Formatter.align("test", 2, 'x', Formatter.Align.RIGHT));
        Assertions.assertEquals("xtest", Formatter.align("test", 5, 'x', Formatter.Align.RIGHT));
        Assertions.assertEquals("xxxxxxtest", Formatter.align("test", 10, 'x', Formatter.Align.RIGHT));
    }

}
