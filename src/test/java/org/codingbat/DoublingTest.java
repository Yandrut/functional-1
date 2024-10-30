package org.codingbat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublingTest {

    @Test
    @DisplayName("TC-1D, Doubling exercise")
    void basicExamplesCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,4,6));
        assertEquals(expected, Functional1.doubling(input));
    }

    @Test
    @DisplayName("TC-2D, Doubling exercise")
    void negativeNumberCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(12, 16, 12, 16, -2));
        assertEquals(expected, Functional1.doubling(input));
    }

    @Test
    @DisplayName("TC-3D, Doubling exercise")
    void biggerArrayCase() {
        List<Integer> input = new ArrayList<>(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4));
        assertEquals(expected, Functional1.doubling(input));
    }

    @Test
    @DisplayName("TC-4D, Doubling exercise")
    void emptyListCase() {
        List <Integer> expected = new ArrayList<>();
        assertEquals(expected, Functional1.doubling(new ArrayList<>()));
    }
}