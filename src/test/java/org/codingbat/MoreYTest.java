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
public class MoreYTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMoreY(List<String> input, List<String> expected) {
        assertEquals(expected, Functional1.moreY(input));
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("a", "b", "c"),
                        Arrays.asList("yay", "yby", "ycy")
                ),
                Arguments.of(
                        Arrays.asList("", "hello", "there"),
                        Arrays.asList("yy", "yhelloy", "ytherey")
                ),
                Arguments.of(
                        new ArrayList<>(),
                        new ArrayList<>()
                ),
                Arguments.of(
                        Arrays.asList("x", "y", "z"),
                        Arrays.asList("yxy", "yyy", "yzy")
                ),
                Arguments.of(
                        Arrays.asList("123", "abc", "!@#"),
                        Arrays.asList("y123y", "yabcy", "y!@#y")
                ),
                Arguments.of(
                        List.of("single"),
                        List.of("ysingley")
                )
        );
    }
}