package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class RightDigitTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 22, 93));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(testObj.rightDigit(input),expected);
    }
    @Test
    public void testCase2() {

        List<Integer> input = new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1));
        assertEquals(testObj.rightDigit(input),expected);
    }

    @Test
    public void emptyCase() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(testObj.rightDigit(input),expected);
    }
}
