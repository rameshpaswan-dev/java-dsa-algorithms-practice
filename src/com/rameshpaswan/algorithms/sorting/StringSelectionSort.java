package com.rameshpaswan.algorithms.sorting;

/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Created Date: 29 March 2026
 * Description : Selection Sort for String Array
 *
 * Uses compareTo() method to compare strings lexicographically.
 *
 * Example:
 * Input  : ["rahul", "amit", "deepak"]
 * Output : ["amit", "deepak", "rahul"]
 *
 * Time Complexity:
 *   - O(n^2)
 *
 * Space Complexity:
 *   - O(1)
 * ============================================================
 */
public class StringSelectionSort {

    /**
     * Sorts a String array in ascending (lexicographical) order
     *
     * @param arr Input string array
     * @return Sorted string array
     */
    public static String[] sort(String[] arr){

        int n = arr.length;

        for(int i = 0; i < n; i++){

            int minIndex = i;

            // Compare strings using compareTo()
            for(int j = i + 1; j < n; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }

            // Swap
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}