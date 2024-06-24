package org.codingbat;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class MoreYTest {
    Functional1 underTest = new Functional1();

    @Test
    public void basicExampleCase() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> expected = new ArrayList<>(Arrays.asList("yay", "yby", "ycy"));
        assertEquals(underTest.moreY(input),expected);
    }

    @Test
    public void basicCaseWithEmptyString() {
        List<String> input = new ArrayList<>(Arrays.asList("", "hello", "there"));
        List<String> expected = new ArrayList<>(Arrays.asList("yy", "yhelloy", "ytherey"));
        assertEquals(underTest.moreY(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(underTest.moreY(input),expected);
    }


}
