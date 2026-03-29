package com.rameshpaswan.algorithms;

import com.rameshpaswan.algorithms.sorting.InsertionSort;
import com.rameshpaswan.algorithms.sorting.StringSelectionSort;
import com.rameshpaswan.algorithms.searching.BinarySearch;


/**
 * ============================================================
 * Author      : Ramesh Paswan
 * Description : Entry point to test all algorithms
 * ============================================================
 */
public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 90, 100};

        // Insertion Sort
        arr = InsertionSort.sort(arr);
        printArray(arr);

        // String Sorting
        String[] strs = {"rahul","amit","deepak","bhuppi","deepesh","ravi"};
        strs = StringSelectionSort.sort(strs);
        printArray(strs);

        

        // Binary Search
        int index = BinarySearch.search(arr, 90);
        System.out.println("Index of 90: " + index);
    }

    private static void printArray(int[] arr){
        for(int a : arr) System.out.print(a + " ");
        System.out.println();
    }

    private static void printArray(String[] arr){
        for(String s : arr) System.out.print(s + " ");
        System.out.println();
    }
}