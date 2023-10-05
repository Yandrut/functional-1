package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class NoXTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1() {
        List<String> input = new ArrayList<>(Arrays.asList("the", "xxtxaxixxx"));
        List<String> expected = new ArrayList<>(Arrays.asList("the", "tai"));
        assertEquals(testObj.noX(input),expected);
    }

    @Test
    public void testCase2() {
        List<String> input = new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"));
        List<String> expected = new ArrayList<>(Arrays.asList("a", "bb", "c"));
        assertEquals(testObj.noX(input),expected);
    }

    @Test
    public void emptyCase() {

        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(testObj.noX(input),expected);
    }
}
