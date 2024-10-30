package org.codingbat;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightDigitTest {

    @Test
    public void basicExampleCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 22, 93));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(Functional1.rightDigit(input),expected);
    }

    @Test
    public void threeDigitNumberCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1));
        assertEquals(Functional1.rightDigit(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(Functional1.rightDigit(input),expected);
    }
}
