package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class Math1Test {
    Functional1 underTest = new Functional1();

    @Test
    public void negativeNumbersCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -2, -1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, -10, -20, -10, 0));
        assertEquals(underTest.math1(input),expected);
    }

    @Test
    public void positiveNumbersCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(70, 90, 70, 90, 20));
        assertEquals(underTest.math1(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(underTest.math1(input),expected);
    }
}
