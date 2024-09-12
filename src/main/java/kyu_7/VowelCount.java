package kyu_7;

/**
 * Instruction:
 * Return the number (count) of vowels in the given string.
 * <p>
 * We will consider a, e, i, o, and u as vowels for this Kata.
 * <p>
 * The input string will only consist of lower case letters and/or spaces.
 */

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str.charAt(i) == arr[j]) {
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }
}


//Best practice:

//    public static int getCount(String str) {
//        return str.replaceAll("(?i)[^aeiou]", "").length();
//    }
//
//    int vowelsCount = 0;
//    for(char c:str.toCharArray())
//        vowelsCount+=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?1:0;
//        return vowelsCount;
//
//    public static int getCount(String str){
//    return(int)str.chars().filter(c->"aeiou".indexOf(c)>=0).count();
//    }
//
//    int vowelsCount = 0;
//    for(int i = 0; i < str.length(); i++) {
//        switch(str.charAt(i)) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                vowelsCount++;
//        }
//    }
//    return vowelsCount;