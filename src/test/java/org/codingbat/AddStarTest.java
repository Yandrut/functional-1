package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class AddStarTest {
    private final Functional1 underTest = new Functional1();

    @Test
    public void basicStringsCase() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        List<String> expected = new ArrayList<>(Arrays.asList("a*", "bb*", "ccc*"));
        assertEquals(underTest.addStar(input),expected);
    }

    @Test
    public void stringAsWordsCase() {
        List<String> input = new ArrayList<>(Arrays.asList("hello", "there"));
        List<String> expected = new ArrayList<>(Arrays.asList("hello*", "there*"));
        assertEquals(underTest.addStar(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(underTest.addStar(input),expected);
    }
}
