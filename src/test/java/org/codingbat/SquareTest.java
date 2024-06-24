package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExamplesCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,4,9));
        assertEquals(expected, underTest.square(input));
    }

    @Test
    public void negativeNumbersCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(36, 64, 36, 64, 1));
        assertEquals(expected, underTest.square(input));
    }

    @Test
    public void emptyListCase() {
        List <Integer> expected = new ArrayList<>();
        assertEquals(expected, underTest.doubling(new ArrayList<>()));
    }
}
