package org.codingbat;
import java.util.List;

/**
 * Source of the exercises:
 * <a href="https://codingbat.com/java/Functional-1">Functional1</a>
 */
public class Functional1 {
    /**
     *
     * Given a list of integers, return a list where each integer is multiplied by 2.
     * @param numbers input list
     * @return modified list
     */
    public static List<Integer> doubling(List<Integer> numbers) {
        numbers.replaceAll(n -> n * 2);
        return numbers;
    }

    /**
     *  Given a list of integers, return a list where each integer is multiplied with itself.
     * @param numbers input list
     * @return modified list
     */
    public static List<Integer> square(List<Integer> numbers) {
        numbers.replaceAll(n -> n * n);
        return numbers;
    }

    /**
     *  Given a list of strings, return a list where each string has "*" added at its end.
     * @param strings input list
     * @return modified list
     */
    public static List<String> addStar(List<String> strings) {
        if (strings.isEmpty()) {
            return strings;
        }

        strings.replaceAll(str -> str.concat("*"));
        return strings;
    }

    /**
     *  Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
     * @param strings input list
     * @return modified list
     */
    public static List<String> copies3(List<String> strings) {
        if (strings.isEmpty()) {
            return strings;
        }

        strings.replaceAll(str -> str + str + str);
        return strings;
    }

    /**
     * Given a list of strings, return a list where each string has "y" added at its start and end.
     * @param strings input list
     * @return modified list
     */
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(str -> "y" + str + "y");
        return strings;
    }

    /**
     * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
     * @param numbers input list
     * @return modified list
     */
    public static List<Integer> math1(List<Integer> numbers) {
        numbers.replaceAll(n -> (n + 1) * 10);
        return numbers;
    }

    /**
     * Given a list of non-negative integers, return an integer list of the rightmost digits.
     * @param numbers input list
     * @return modified list
     */
    public static List<Integer> rightDigit(List<Integer> numbers) {
        numbers.replaceAll(n -> n % 10);
        return numbers;
    }

    /**
     * Given a list of strings, return a list where each string is converted to lower case
     * @param strings input list
     * @return modified list
     */
    public static List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    /**
     * Given a list of strings, return a list where each string has all its "x" removed.
     * @param strings input list
     * @return modified list
     */
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}