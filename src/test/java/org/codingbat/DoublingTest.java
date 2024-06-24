package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class DoublingTest {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExamplesCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,4,6));
        assertEquals(expected, underTest.doubling(input));
    }

    @Test
    public void negativeNumberCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(12, 16, 12, 16, -2));
        assertEquals(expected, underTest.doubling(input));
    }

    @Test
    public void biggerArrayCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4));
        assertEquals(expected, underTest.doubling(input));
    }

    @Test
    public void emptyListCase() {
        List <Integer> expected = new ArrayList<>();
        assertEquals(expected, underTest.doubling(new ArrayList<>()));
    }
}