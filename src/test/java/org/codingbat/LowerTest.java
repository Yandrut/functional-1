package org.codingbat;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerTest {

    @Test
    public void basicExampleCase() {
        List<String> input = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        List<String> expected = new ArrayList<>(Arrays.asList("hello", "hi"));
        assertEquals(Functional1.lower(input),expected);
    }

    @Test
    public void upperCaseStringAtTheEnd() {
        List<String> input = new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"));
        List<String> expected = new ArrayList<>(Arrays.asList("kitten", "chocolate"));
        assertEquals(Functional1.lower(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(Functional1.lower(input),expected);
    }
}