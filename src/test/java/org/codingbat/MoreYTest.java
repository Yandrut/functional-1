package org.codingbat;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoreYTest {

    @Test
    public void basicExampleCase() {
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> expected = new ArrayList<>(Arrays.asList("yay", "yby", "ycy"));
        assertEquals(Functional1.moreY(input),expected);
    }

    @Test
    public void basicCaseWithEmptyString() {
        List<String> input = new ArrayList<>(Arrays.asList("", "hello", "there"));
        List<String> expected = new ArrayList<>(Arrays.asList("yy", "yhelloy", "ytherey"));
        assertEquals(Functional1.moreY(input),expected);
    }

    @Test
    public void emptyListCase() {
        List<String> input = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(Functional1.moreY(input),expected);
    }


}
