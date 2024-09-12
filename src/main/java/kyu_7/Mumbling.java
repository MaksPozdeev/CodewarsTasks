package kyu_7;

/**
 * Instructions:
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * <p>
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.substring(i, i + 1).toUpperCase());
            for (int j = 0; j < i; j++) {
                sb.append(s.substring(i, i + 1).toLowerCase());
            }
            if (i < s.length() - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ZpglnRxqenU";
        System.out.println(accum(str));
    }
}


//for(char c:s.toCharArray()){
//    if(i>0)bldr.append('-');
//    bldr.append(Character.toUpperCase(c));
//    for(int j=0;j<i; j++)bldr.append(Character.toLowerCase(c));
//    i++;
//    }
//    return bldr.toString();