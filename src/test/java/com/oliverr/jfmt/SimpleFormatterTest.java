package com.oliverr.jfmt;

import com.oliverr.jfmt.formatter.SimpleFormatter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleFormatterTest {

    @Test
    public void testSimpleFormatter() {
        Assertions.assertEquals("John is 17 years old.", SimpleFormatter.stringf("{0} is {1} years old.", "John", 17));
        Assertions.assertEquals("John's name is John", SimpleFormatter.stringf("{0}'s name is {0}", "John"));
        Assertions.assertEquals("John is 17 years old.", SimpleFormatter.stringf("{1} is {0} years old.", 17, "John"));
        Assertions.assertEquals("12120", SimpleFormatter.stringf("{1}{1}{0}", 0, 12));
        Assertions.assertEquals("10", SimpleFormatter.stringf("{9}", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Assertions.assertEquals("true", SimpleFormatter.stringf("{0}", true));
        Assertions.assertEquals("No Args: {0}", SimpleFormatter.stringf("No Args: {0}"));
        Assertions.assertEquals("John is {1} years old.", SimpleFormatter.stringf("{0} is {1} years old.", "John"));

        //Assertions.assertEquals("", SimpleFormatter.stringf(""));
    }

}
