package kyu_6;

import java.util.*;

/**
 * Instructions:
 * There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the
 * total time required for all the customers to check out!
 * <p>
 * input
 * customers: an array of positive integers representing the queue. Each integer represents a customer, and its value
 * is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * output
 * The function should return an integer, the total time required.
 * <p>
 * Important
 * Please look at the examples and clarifications below, to ensure you understand the task correctly :)
 * <p>
 * Clarifications
 * There is only ONE queue serving many tills, and
 * The order of the queue NEVER changes, and
 * The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
 * N.B. You should assume that all the test input will be valid, as specified above.
 * <p>
 * P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool, with
 * relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool
 * <p>
 * Examples
 * queueTime([5,3,4], 1)
 * // should return 12
 * // because when there is 1 till, the total time is just the sum of the times
 * <p>
 * queueTime([10,2,3,3], 2)
 * // should return 10
 * // because here n=2 and the 2nd, 3rd, and 4th people in the
 * // queue finish before the 1st person has finished.
 * <p>
 * queueTime([2,3,10], 2)
 * // should return 12
 */

public class TheSupermarketQueue {

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[] {3,2,6,7,5,7,7,2,6,5,5,3,3,5,6,3,1,4}, 5));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (n == 1) {
            int sum = 0;
            for (int q : customers) {
                sum += q;
            }
            return sum;
        }

        if (n >= customers.length) {
            return max(customers);
        }

        int[] arrCashbox = new int[n];
        System.arraycopy(customers, 0, arrCashbox, 0, n);
        int minIdx;
        int i = n;
        while (i < customers.length) {
            minIdx = minIndex(arrCashbox);
            arrCashbox[minIdx] += customers[i];
            i++;
        }
        return max(arrCashbox);
}

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }
        return maxEl;
    }

    private static int minIndex(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int minEl = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minEl){
                minEl = arr[i];
                index = i;
            }
        }
        return index;
    }

}


//Best practice

//    public static int solveSuperMarketQueue(int[] customers, int n) {
//        int[] result = new int[n];
//        for(int i = 0; i < customers.length; i++){
//            result[0] += customers[i];
//            Arrays.sort(result);
//        }
//        return result[n-1];
//    }








