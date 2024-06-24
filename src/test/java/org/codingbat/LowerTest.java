package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class LowerTest {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExampleCase() {
        List<String> input = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        List<String> expected = new ArrayList<>(Arrays.asList("hello", "hi"));
        assertEquals(underTest.lower(input),expected);
    }

    @Test
    public void upperCaseStringAtTheEnd() {
        List<String> input = new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"));
        List<String> expected = new ArrayList<>(Arrays.asList("kitten", "chocolate"));
        assertEquals(underTest.lower(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(underTest.lower(input),expected);
    }
}