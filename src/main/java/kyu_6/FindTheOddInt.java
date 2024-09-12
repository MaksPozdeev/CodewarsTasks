package kyu_6;

import java.util.HashMap;
import java.util.Map;

/**
 * Instructions:
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */

public class FindTheOddInt {

    public static int findIt(int[] a) {
        Map<Integer, Integer> mapInt = new HashMap<>();
        for (int q : a) {
            if (mapInt.containsKey(q)) {
                mapInt.put(q, mapInt.get(q) + 1);
            } else {
                mapInt.put(q, 1);
            }
        }

        int key = 0;
        for (Map.Entry<Integer, Integer> entry : mapInt.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                key = entry.getKey();
                break;
            }
        }
        return key;
    }

}

//Best practice:

//    public static int findIt(int[] A) {
//        int xor = 0;
//        for (int i = 0; i < A.length; i++) {
//            xor ^= A[i];
//        }
//        return xor;
//    }
//---------------------------------------------------------------------------------------
//    public static int findIt(int[] arr) {
//        return stream(arr).reduce(0, (x, y) -> x ^ y);
//    }
//---------------------------------------------------------------------------------------
//    public static int findIt(int[] A) {
//        int odd=0;
//        for (int item: A)
//        {
//            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
//        }
//
//        return odd;
//    }
//---------------------------------------------------------------------------------------
//    public static int findIt(int[] a) {
//        return Arrays.stream(a)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue().size() % 2 == 1)
//                .mapToInt(e -> e.getKey())
//                .findFirst()
//                .getAsInt();
//    }