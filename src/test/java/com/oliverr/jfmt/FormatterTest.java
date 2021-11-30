package com.oliverr.jfmt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterTest {

    @Test
    public void testFormatter() {
        Assertions.assertEquals("Hi, my name is John!", Formatter.stringf("Hi, my name is %v!", "John"));
        Assertions.assertEquals("Hi Jason, my name is John!", Formatter.stringf("Hi %v, my name is %v!", "Jason", "John"));
        Assertions.assertEquals("He is %v years old.", Formatter.stringf("%v is %v years old.", "He"));
        Assertions.assertEquals("Jason is 21 years old. %v", Formatter.stringf("%v is %v years old. %v", "Jason", 21));
        Assertions.assertEquals("True: true", Formatter.stringf("True: %v", true));
        Assertions.assertEquals("True: true", Formatter.stringf("True: %b", true));
        Assertions.assertEquals("False: false", Formatter.stringf("False: %b", false));
        Assertions.assertEquals("This is not a boolean: %b", Formatter.stringf("This is not a boolean: %b", "asd"));
        Assertions.assertEquals("This is a string.", Formatter.stringf("%s is a string.", "This"));
        Assertions.assertEquals("%s is not a string.", Formatter.stringf("%s is not a string.", 33));
        Assertions.assertEquals("%s is not a string.", Formatter.stringf("%s is not a string.", true));
        Assertions.assertEquals("This is a string, and this is true!", Formatter.stringf("%s is a string, and this is %b!", "This", true));
        Assertions.assertEquals("a b true", Formatter.stringf("%v %s %b", "a", "b", true));
        Assertions.assertEquals("%s %b", Formatter.stringf("%s %b", 33.1, "asd"));
        Assertions.assertEquals("This is a real number: 33.1", Formatter.stringf("This is a real number: %v", 33.1));
    }

}
