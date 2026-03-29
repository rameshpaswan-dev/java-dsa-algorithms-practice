package com.rameshpaswan.algorithms.sorting;

/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Created Date: 29 March 2026
 * Description : Implementation of Selection Sort Algorithm
 *
 * Selection Sort repeatedly finds the minimum element
 * from the unsorted part and places it at the beginning.
 *
 * Example:
 * Input  : [30, 10, 20]
 * Output : [10, 20, 30]
 *
 * Time Complexity:
 *   - Best Case    : O(n^2)
 *   - Average Case : O(n^2)
 *   - Worst Case   : O(n^2)
 *
 * Space Complexity:
 *   - O(1) (In-place sorting)
 *
 * Stable Sort:
 *   - No (does not preserve order of equal elements)
 * ============================================================
 */
public class SelectionSort {

    /**
     * Sorts an integer array using Selection Sort
     *
     * @param arr Input array
     * @return Sorted array
     */
    public static int[] sort(int[] arr){

        int n = arr.length;

        // Traverse entire array
        for(int i = 0; i < n; i++){

            // Assume current index is minimum
            int minIndex = i;

            // Find actual minimum in remaining array
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swap minimum element with current position
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}