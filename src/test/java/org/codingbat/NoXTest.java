package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class NoXTest {
    Functional1 underTest = new Functional1();

    @Test
    public void onlyOneStringWithX() {
        List<String> input = new ArrayList<>(Arrays.asList("the", "xxtxaxixxx"));
        List<String> expected = new ArrayList<>(Arrays.asList("the", "tai"));
        assertEquals(underTest.noX(input),expected);
    }

    @Test
    public void allStringsWithX() {
        List<String> input = new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"));
        List<String> expected = new ArrayList<>(Arrays.asList("a", "bb", "c"));
        assertEquals(underTest.noX(input),expected);
    }

    @Test
    public void emptyListCase() {

        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(underTest.noX(input),expected);
    }
}
