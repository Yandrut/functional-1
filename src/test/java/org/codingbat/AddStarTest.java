package org.codingbat;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.*;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.SAME_THREAD)
public class AddStarTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testAddStar(List<String> input, List<String> expected) {
        assertEquals(expected, Functional1.addStar(input));
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("a", "bb", "ccc"),
                        Arrays.asList("a*", "bb*", "ccc*")
                ),
                Arguments.of(
                        Arrays.asList("hello", "there"),
                        Arrays.asList("hello*", "there*")
                ),
                Arguments.of(
                        List.of(),
                        List.of()
                ),
                Arguments.of(
                        Arrays.asList("", "a", "", "bb"),
                        Arrays.asList("*", "a*", "*", "bb*")
                ),
                Arguments.of(
                        Arrays.asList("x", "mediumlength", "averyverylongstring"),
                        Arrays.asList("x*", "mediumlength*", "averyverylongstring*")
                ),
                Arguments.of(
                        Arrays.asList("with space", " leading", "trailing "),
                        Arrays.asList("with space*", " leading*", "trailing *")
                ),
                Arguments.of(
                        Arrays.asList("123", "hello123", "@special!", "#tag"),
                        Arrays.asList("123*", "hello123*", "@special!*", "#tag*")
                ),
                Arguments.of(
                        Arrays.asList("Hello", "WORLD", "Test"),
                        Arrays.asList("Hello*", "WORLD*", "Test*")
                ),
                Arguments.of(
                        Arrays.asList(" ", "   ", "\t"),
                        Arrays.asList(" *", "   *", "\t*")
                )
        );
    }
}