package com.rameshpaswan.algorithms.sorting;

/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Created Date: 29 March 2026
 * Description : Implementation of Insertion Sort Algorithm
 *
 * Insertion Sort works like sorting playing cards in hand.
 * It picks one element at a time and places it in correct position.
 *
 * Example:
 * Input  : [10, 30, 20]
 * Output : [10, 20, 30]
 *
 * Time Complexity:
 *   - Best Case    : O(n)   (Already sorted)
 *   - Average Case : O(n^2)
 *   - Worst Case   : O(n^2)
 *
 * Space Complexity:
 *   - O(1) (In-place sorting, no extra memory used)
 *
 * Stable Sort:
 *   - Yes (maintains relative order of equal elements)
 * ============================================================
 */
public class InsertionSort {

    /**
     * Sorts an integer array using Insertion Sort algorithm
     *
     * @param arr Input array to be sorted
     * @return Sorted array
     */
    public static int[] sort(int[] arr){

        // Traverse from second element (index 1)
        for(int i = 1; i < arr.length; i++){

            // Current element to be placed at correct position
            int current = arr[i];

            // Compare with previous elements
            int j = i - 1;

            // Shift elements greater than current to right
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current element at correct position
            arr[j + 1] = current;
        }

        return arr;
    }
}