package kyu_7;

/**
 * Instruction:
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 *
 * #Examples:
 * Kata.getMiddle("test") should return "es"
 * Kata.getMiddle("testing") should return "t"
 * Kata.getMiddle("middle") should return "dd"
 * Kata.getMiddle("A") should return "A"
 *
 *  #Input
 * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
 *
 * #Output
 * The middle character(s) of the word represented as a string.
 * */

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        int wl = word.length();
        if (wl == 1 || wl == 2){
            return word;
        }
        if(wl%2 == 0){
            return word.substring(wl/2-1,wl/2+1);
        }else{
            return word.substring(wl/2,wl/2+1);
        }
    }
}

//Best practice

//    int length = word.length();
//    return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);

//    String s = "";
//    int length = word.length();
//    int half = length/2;
//    if (length % 2 == 0) {
//        s = word.substring(half - 1, half + 1);
//        } else {
//            s = word.substring(half, half + 1);
//        }
//        return s;