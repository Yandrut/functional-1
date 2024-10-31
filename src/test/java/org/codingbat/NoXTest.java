package org.codingbat;
import java.util.*;
import java.util.stream.Stream;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


@Execution(ExecutionMode.SAME_THREAD)
public class NoXTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testNoX(List<String> input, List<String> expected) {
        assertEquals(expected, Functional1.noX(input));
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("the", "xxtxaxixxx"),
                        Arrays.asList("the", "tai")
                ),
                Arguments.of(
                        Arrays.asList("xxax", "xbxbx", "xxcx"),
                        Arrays.asList("a", "bb", "c")
                ),
                Arguments.of(
                        new ArrayList<>(),
                        new ArrayList<>()
                ),
                Arguments.of(
                        Arrays.asList("x", "xx", "xxx"),
                        Arrays.asList("", "", "")
                ),
                Arguments.of(
                        Arrays.asList("example", "text", "without", "x"),
                        Arrays.asList("eample", "tet", "without", "")
                ),
                Arguments.of(
                        Arrays.asList("mixedXcase", "X", "lowerx"),
                        Arrays.asList("miedcase", "", "lower")
                )
        );
    }
}