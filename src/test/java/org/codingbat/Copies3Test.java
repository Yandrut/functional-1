package org.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Copies3Test {

    @ParameterizedTest
    @MethodSource("testCopies3Cases")
    public void testCopies(List<String> input, List<String> expected) {
        assertEquals(expected, Functional1.copies3(input));
    }

    private static Stream<Arguments> testCopies3Cases() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("a", "bb", "ccc"),
                        Arrays.asList("aaa", "bbbbbb", "ccccccccc")
                ),
                Arguments.of(
                        Arrays.asList("24", "a", ""),
                        Arrays.asList("242424", "aaa", "")
                ),
                Arguments.of(
                        List.of(),
                        List.of()
                ),
                Arguments.of(
                        Arrays.asList("x", "y", "z"),
                        Arrays.asList("xxx", "yyy", "zzz")
                ),
                Arguments.of(
                        Arrays.asList("abc", "123", "a1b2"),
                        Arrays.asList("abcabcabc", "123123123", "a1b2a1b2a1b2")
                ),
                Arguments.of(
                        Arrays.asList("!", "#@", "$$"),
                        Arrays.asList("!!!", "#@#@#@", "$$$$$$")
                ),
                Arguments.of(
                        Arrays.asList("", "", ""),
                        Arrays.asList("", "", "")
                ),
                Arguments.of(
                        Arrays.asList("null", null),
                        Arrays.asList("nullnullnull", "nullnullnull")

                )
        );
    }
}