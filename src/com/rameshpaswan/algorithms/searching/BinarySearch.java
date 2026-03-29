package com.rameshpaswan.algorithms.searching;
/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Description : Binary Search Algorithm (Iterative)
 *
 * Binary Search works only on SORTED arrays.
 * It divides the array into halves and searches efficiently.
 *
 * Example:
 * Input  : [10,20,30,40], target = 30
 * Output : 2
 *
 * Time Complexity:
 *   - O(log n)
 *
 * Space Complexity:
 *   - O(1)
 * ============================================================
 */
public class BinarySearch {

    /**
     * Searches for a target element in sorted array
     *
     * @param arr Sorted input array
     * @param target Element to search
     * @return Index of target, -1 if not found
     */
    public static int search(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        // Continue until search space is valid
        while(left <= right){

            // Avoid overflow
            int mid = left + (right - left) / 2;

            // Check if target found
            if(arr[mid] == target){
                return mid;
            }
            // Search left half
            else if(arr[mid] > target){
                right = mid - 1;
            }
            // Search right half
            else{
                left = mid + 1;
            }
        }

        // Target not found
        return -1;
    }
}