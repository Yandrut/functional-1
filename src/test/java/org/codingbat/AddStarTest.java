package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class AddStarTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> expected = new ArrayList<>(Arrays.asList("a*", "bb*", "ccc*"));
        assertEquals(testObj.addStar(input),expected);
    }

    @Test
    public void testCase2() {
        List<String> input = new ArrayList<>(Arrays.asList("hello", "there"));
        List<String> expected = new ArrayList<>(Arrays.asList("hello*", "there*"));
        assertEquals(testObj.addStar(input),expected);
    }

    @Test
    public void emptyCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(testObj.addStar(input),expected);
    }
}
