package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class Math1Test {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -2, -1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, -10, -20, -10, 0));
        assertEquals(testObj.math1(input),expected);
    }

    @Test
    public void testCase2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(70, 90, 70, 90, 20));
        assertEquals(testObj.math1(input),expected);
    }

    @Test
    public void emptyCase() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(testObj.math1(input),expected);
    }
}
