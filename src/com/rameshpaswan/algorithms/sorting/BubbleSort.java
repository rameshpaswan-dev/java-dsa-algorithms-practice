package com.rameshpaswan.algorithms.sorting;
/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Description : Bubble Sort Algorithm
 *
 * Repeatedly swaps adjacent elements if they are in wrong order.
 *
 * Optimization:
 * Stops early if array is already sorted.
 *
 * Time Complexity:
 *   - Best Case    : O(n)
 *   - Worst Case   : O(n^2)
 *
 * Space Complexity:
 *   - O(1)
 * ============================================================
 */
public class BubbleSort {

    public static int[] sort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            boolean swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j + 1]){

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps → already sorted
            if(!swapped) break;
        }

        return arr;
    }
}