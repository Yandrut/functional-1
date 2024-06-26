package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class RightDigitTest {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExampleCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 22, 93));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(underTest.rightDigit(input),expected);
    }

    @Test
    public void threeDigitNumberCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1));
        assertEquals(underTest.rightDigit(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(underTest.rightDigit(input),expected);
    }
}
