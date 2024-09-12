package kyu_6;

/**
 * Instructions:
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * For example:
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 * */


public class PersistentBugger {

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        String str = Long.toString(n);
        int q;
        int k = 0;
        while(str.length() > 1){
            q=1;
            for (int i = 0; i < str.length(); i++) {
             q *= Character.getNumericValue(str.charAt(i));
            }
            k++;
            str = Integer.toString(q);
        }
        return k;
    }
}

//Best practice

//    public static int persistence(long n) {
//        long m = 1, r = n;
//        if (r / 10 == 0)
//            return 0;
//        for (r = n; r != 0; r /= 10)
//            m *= r % 10;
//        return persistence(m) + 1;
//    }

//    public static int persistence(long n) {
//        int times = 0;
//        while (n >= 10) {
//            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
//            times++;
//        }
//        return times;
//    }
