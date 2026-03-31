package com.rameshpaswan.algorithms.searching;

/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Created Date: 31 March 2026
 * Description : Implementation of Two Pointer Approach 
 *               to find two elements whose sum equals target.
 *
 * The Two Pointer technique is used on a sorted array.
 * It uses two indices:
 *   - One starting from the beginning (left)
 *   - One starting from the end (right)
 *
 * Logic:
 *   - If sum == target → return indices
 *   - If sum > target  → move right pointer to left
 *   - If sum < target  → move left pointer to right
 *
 * Example:
 * Input  : [1, 2, 3, 4, 6], target = 6
 * Output : [1, 3]  (2 + 4 = 6)
 *
 * Time Complexity:
 *   - O(n) (Single traversal)
 *
 * Space Complexity:
 *   - O(1) (No extra space used)
 *
 * Note:
 *   - Array must be sorted for correct working
 * ============================================================
 */
public class TwoPointerSumApproach {

    /**
     * Finds two indices such that their values sum to target
     *
     * @param arr    Sorted input array
     * @param target Target sum value
     * @return Array containing indices of two elements
     *         OR [-1, -1] if no such pair exists
     */
    public static int[] findTwoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        // Traverse until both pointers meet
        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } 
            else if (sum > target) {
                right--; // decrease sum
            } 
            else {
                left++;  // increase sum
            }
        }

        // No valid pair found
        return new int[]{-1, -1};
    }
}