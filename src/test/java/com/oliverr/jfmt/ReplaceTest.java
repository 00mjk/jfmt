package com.oliverr.jfmt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceTest {

    @Test
    public void testAll() {
        Assertions.assertEquals("Hi, I am a cat!", Replace.all("Hi, I am a dog!", "dog", "cat"));
        Assertions.assertEquals("water", Replace.all("beer", "beer", "water"));
        Assertions.assertEquals("I'm John, and he's John too!", Replace.all("I'm Jason, and he's Jason too!", "Jason", "John"));
        Assertions.assertEquals("bbb", Replace.all("aaa", "a", "b"));
        Assertions.assertEquals("Hello", Replace.all("Hi", "Hi", "Hello"));
        Assertions.assertEquals("Hi", Replace.all("Hello", "Hello", "Hi"));
    }

    @Test
    public void testFirst() {
        Assertions.assertEquals("I love beer with water!", Replace.first("I love water with water!", "water", "beer"));
        Assertions.assertEquals("baa", Replace.first("aaa", "a", "b"));
        Assertions.assertEquals("I'm John and I'm %v years old.", Replace.first("I'm %v and I'm %v years old.", "%v", "John"));
    }

}
