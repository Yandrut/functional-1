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
public class Math1Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMathOne(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, Functional1.math1(input));
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(-1, -2, -3, -2, -1),
                        Arrays.asList(0, -10, -20, -10, 0)
                ),
                Arguments.of(
                        Arrays.asList(6, 8, 6, 8, 1),
                        Arrays.asList(70, 90, 70, 90, 20)
                ),
                Arguments.of(
                        new ArrayList<>(),
                        new ArrayList<>()
                ),
                Arguments.of(
                        Arrays.asList(0, 1, 2, 3, 4),
                        Arrays.asList(10, 20, 30, 40, 50)
                ),
                Arguments.of(
                        Arrays.asList(10, -10, 20, -20),
                        Arrays.asList(110, -90, 210, -190)
                ),
                Arguments.of(
                        List.of(5),
                        List.of(60)
                )
        );
    }
}