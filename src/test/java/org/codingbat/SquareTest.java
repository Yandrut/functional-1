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
public class SquareTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void testMoreY(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, Functional1.square(input));
    }

   static Stream<Arguments> provideTestData() {
       return Stream.of(
               Arguments.of(
                       Arrays.asList(1, 2, 3),
                       Arrays.asList(1, 4, 9)
               ),
               Arguments.of(
                       Arrays.asList(6, 8, -6, -8, 1),
                       Arrays.asList(36, 64, 36, 64, 1)
               ),
               Arguments.of(
                       new ArrayList<>(),
                       new ArrayList<>()
               ),
               Arguments.of(
                       Arrays.asList(-1, -2, -3, 0, 5),
                       Arrays.asList(1, 4, 9, 0, 25)
               ),
               Arguments.of(
                       Arrays.asList(10, 15, 20),
                       Arrays.asList(100, 225, 400)
               ),
               Arguments.of(
                       Arrays.asList(0, 1, 4, 9),
                       Arrays.asList(0, 1, 16, 81)
               )
       );
   }
}