package org.codingbat;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoXTest {

    @Test
    public void onlyOneStringWithX() {
        List<String> input = new ArrayList<>(Arrays.asList("the", "xxtxaxixxx"));
        List<String> expected = new ArrayList<>(Arrays.asList("the", "tai"));
        assertEquals(Functional1.noX(input),expected);
    }

    @Test
    public void allStringsWithX() {
        List<String> input = new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"));
        List<String> expected = new ArrayList<>(Arrays.asList("a", "bb", "c"));
        assertEquals(Functional1.noX(input),expected);
    }

    @Test
    public void emptyListCase() {

        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(Functional1.noX(input),expected);
    }
}
