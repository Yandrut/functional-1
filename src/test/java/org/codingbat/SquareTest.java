package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,4,9));
        assertEquals(expected, testObj.square(input));
    }

    @Test
    public void testCase2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(36, 64, 36, 64, 1));
        assertEquals(expected, testObj.square(input));
    }

    @Test
    public void emptyCase() {
        List <Integer> expected = new ArrayList<>();
        assertEquals(expected, testObj.doubling(new ArrayList<>()));
    }
}
