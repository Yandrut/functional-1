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
public class LowerTest {

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void lowerExerciseTest(List<String> input, List<String> expected) {
        assertEquals(expected, Functional1.lower(input));
    }

    static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("Hello", "Hi"),
                        Arrays.asList("hello", "hi")
                ),
                Arguments.of(
                        Arrays.asList("KitteN", "ChocolaTE"),
                        Arrays.asList("kitten", "chocolate")
                ),
                Arguments.of(
                        new ArrayList<>(),
                        new ArrayList<>()
                ),
                Arguments.of(
                        Arrays.asList("JAVA", "PYTHON", "C++"),
                        Arrays.asList("java", "python", "c++")
                ),
                Arguments.of(
                        Arrays.asList("MiXeD", "CaSe", "StrInGs"),
                        Arrays.asList("mixed", "case", "strings")
                ),
                Arguments.of(
                        Arrays.asList("   Spacey", " STRI NGS  "),
                        Arrays.asList("   spacey", " stri ngs  ")
                ),
                Arguments.of(
                        Arrays.asList("123NUMBERS", "Mixed123"),
                        Arrays.asList("123numbers", "mixed123")
                ),
                Arguments.of(
                        Arrays.asList("special@#Chars", "!TEST"),
                        Arrays.asList("special@#chars", "!test")
                )
        );
    }
}