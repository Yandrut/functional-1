package org.codingbat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.*;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.SAME_THREAD)
public class DoublingTest {

        @ParameterizedTest
        @MethodSource("doublingTestCases")
        @DisplayName("Doubling Exercise - Parameterized")
        void testDoubling(List<Integer> input, List<Integer> expected) {
            assertEquals(expected, Functional1.doubling(input));
        }

        static Stream<Arguments> doublingTestCases() {
            return Stream.of(
                    Arguments.of(
                            Arrays.asList(1, 2, 3),
                            Arrays.asList(2, 4, 6)
                    ),
                    Arguments.of(
                            Arrays.asList(6, 8, 6, 8, -1),
                            Arrays.asList(12, 16, 12, 16, -2)
                    ),
                    Arguments.of(
                            Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
                            Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4)
                    ),
                    Arguments.of(
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    Arguments.of(
                            Arrays.asList(0, 2, -4, 5, 0),
                            Arrays.asList(0, 4, -8, 10, 0)
                    ),
                    Arguments.of(
                            List.of(9),
                            List.of(18)
                    )
            );
        }
    }