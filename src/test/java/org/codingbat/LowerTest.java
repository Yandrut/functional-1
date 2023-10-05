package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class LowerTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<String> input = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        List<String> expected = new ArrayList<>(Arrays.asList("hello", "hi"));
        assertEquals(testObj.lower(input),expected);
    }

    @Test
    public void testCase2() {
        List<String> input = new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"));
        List<String> expected = new ArrayList<>(Arrays.asList("kitten", "chocolate"));
        assertEquals(testObj.lower(input),expected);
    }

    @Test
    public void emptyCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(testObj.lower(input),expected);
    }
}