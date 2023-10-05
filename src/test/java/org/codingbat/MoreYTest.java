package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class MoreYTest {
    Functional1 testObj = new Functional1();

    @Test
    public void testCase1 () {
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> expected = new ArrayList<>(Arrays.asList("yay", "yby", "ycy"));
        assertEquals(testObj.moreY(input),expected);
    }

    @Test
    public void testCase2 () {
        List<String> input = new ArrayList<>(Arrays.asList("", "hello", "there"));
        List<String> expected = new ArrayList<>(Arrays.asList("yy", "yhelloy", "ytherey"));
        assertEquals(testObj.moreY(input),expected);
    }

    @Test
    public void emptyCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(testObj.moreY(input),expected);
    }


}
