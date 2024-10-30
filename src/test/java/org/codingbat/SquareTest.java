package org.codingbat;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void basicExamplesCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,4,9));
        assertEquals(expected, Functional1.square(input));
    }

    @Test
    public void negativeNumbersCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(36, 64, 36, 64, 1));
        assertEquals(expected, Functional1.square(input));
    }

    @Test
    public void emptyListCase() {
        List <Integer> expected = new ArrayList<>();
        assertEquals(expected, Functional1.doubling(new ArrayList<>()));
    }
}
