package kyu_7;

import java.util.ArrayList;
import java.util.List;

/**
 * Instructions:
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 *
 * Example:
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 *
 *  Notes:
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 * */

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        // Code here or
        List<Integer> listNumbers = new ArrayList<>();
        String[] arr = numbers.split("\\s");
        for (String str: arr){
            listNumbers.add(Integer.parseInt(str));
        }
        int max;
        int min;
        max = min = listNumbers.get(0);
        for (int q: listNumbers){
            if(q>max) max = q;
            if(q<min) min = q;
            }

        return max + " " + min;
    }

}


//Best practice

//    int min = Arrays.stream(numbers.split(" "))
//            .mapToInt(i -> Integer.parseInt(i))
//            .min()
//            .getAsInt();
//
//    int max = Arrays.stream(numbers.split(" "))
//            .mapToInt(i -> Integer.parseInt(i))
//            .max()
//            .getAsInt();
//
//        return String.format("%d %d", max, min);

//    public static String HighAndLow(String numbers) {
//        IntSummaryStatistics summary = Arrays
//                .stream(numbers.split(" "))
//                .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
//        return String.format("%d %d", summary.getMax(), summary.getMin());
//    }

//    public static String HighAndLow(String numbers) {
//        IntSummaryStatistics stats = Arrays.stream(numbers.split("\\s")).
//                mapToInt(Integer::parseInt).summaryStatistics();
//
//        return String.format("%d %d", stats.getMax(), stats.getMin());
//    }