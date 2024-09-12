package kyu_8;

/**
 * Instructions:
 * Complete the solution so that it reverses the string value passed into it.
 *
 * Example Kata.solution("world") //returns "dlrow"
 */

public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
