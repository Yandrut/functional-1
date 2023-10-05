package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class Copies3Test {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> expected = new ArrayList<>(Arrays.asList("aaa", "bbbbbb", "ccccccccc"));
        assertEquals(testObj.copies3(input),expected);
    }

    @Test
    public void testCase2() {
        List<String> input = new ArrayList<>(Arrays.asList("24", "a", ""));
        List<String> expected = new ArrayList<>(Arrays.asList("242424", "aaa", ""));
        assertEquals(testObj.copies3(input),expected);
    }

    @Test
    public void emptyCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(testObj.copies3(input),expected);
    }
}
