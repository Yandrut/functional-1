package org.codingbat;
import java.util.List;

public class Functional1 {

    public List<Integer> doubling(List<Integer> numbers) {
        // Given a list of integers, return a list where each integer is multiplied by 2.
        numbers.replaceAll(n -> n*2);
        return numbers;
    }

    public List<Integer> square(List<Integer> numbers) {
        // Given a list of integers, return a list where each integer is multiplied with itself.
        numbers.replaceAll(n -> n * n);
        return numbers;
    }

    public List<String> addStar(List<String> strings) {
        // Given a list of strings, return a list where each string has "*" added at its end.
        strings.replaceAll(str -> str.concat("*"));
        return strings;
    }

    public List<String> copies3(List<String> strings) {
        /* Given a list of strings, return a list where each string is replaced by
         3 copies of the string concatenated together.
         */
        strings.replaceAll(str -> str + str + str);
        return strings;
    }

    public List<String> moreY(List<String> strings) {
        /*
            Given a list of strings, return a list where
            each string has "y" added at its start and end.
        */
        strings.replaceAll(str -> "y" + str + "y");
        return strings;
    }

    public List<Integer> math1(List<Integer> numbers) {
        /* Given a list of integers, return a list where each integer is
           added to 1 and the result is multiplied by 10.
        */
        numbers.replaceAll(n -> (n + 1) * 10);
        return numbers;
    }

    public List<Integer> rightDigit(List<Integer> numbers) {
        // Given a list of non-negative integers, return an integer list of the rightmost digits.

        numbers.replaceAll(n -> n % 10);
        return numbers;
    }

    public List<String> lower(List<String> strings) {
        // Given a list of strings, return a list where each string is converted to lower case
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    public List<String> noX(List<String> strings) {
        // Given a list of strings, return a list where each string has all its "x" removed.
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}
