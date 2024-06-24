package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class Copies3Test {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExamplesCase() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> expected = new ArrayList<>(Arrays.asList("aaa", "bbbbbb", "ccccccccc"));
        assertEquals(underTest.copies3(input),expected);
    }

    @Test
    public void basicCaseWithEmptyString() {
        List<String> input = new ArrayList<>(Arrays.asList("24", "a", ""));
        List<String> expected = new ArrayList<>(Arrays.asList("242424", "aaa", ""));
        assertEquals(underTest.copies3(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(underTest.copies3(input),expected);
    }
}
