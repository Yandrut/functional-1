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
public class RightDigitTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testRightDigit(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, Functional1.rightDigit(input));
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(1, 22, 93),
                        Arrays.asList(1, 2, 3)
                ),
                Arguments.of(
                        Arrays.asList(16, 8, 886, 8, 1),
                        Arrays.asList(6, 8, 6, 8, 1)
                ),
                Arguments.of(
                        new ArrayList<>(),
                        new ArrayList<>()
                ),
                Arguments.of(
                        Arrays.asList(101, 202, 303),
                        Arrays.asList(1, 2, 3)
                ),
                Arguments.of(
                        Arrays.asList(1234, 5678, 90),
                        Arrays.asList(4, 8, 0)
                ),
                Arguments.of(
                        Arrays.asList(0, 5, 10),
                        Arrays.asList(0, 5, 0)
                )
        );
    }
}