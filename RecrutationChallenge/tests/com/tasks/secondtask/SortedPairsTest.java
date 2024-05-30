package com.tasks.secondtask;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Random;

public class SortedPairsTest extends TestCase {
    public SortedPairsTest() {
    }

    public final int MAX_LIST_SIZE = 10000000;
    public final int INT_MAX_VALUE = Integer.MAX_VALUE - 1;

    public int[] generateRandomMaxSizeArrayWithIntegers() {
        int[] arr = new int[MAX_LIST_SIZE];
        Random random = new Random();

        for (int i = 0; i < MAX_LIST_SIZE; i++) {
            arr[i] = (random.nextInt(2) * 2 - 1) * random.nextInt(INT_MAX_VALUE);
        }
        return arr;
    }

    @Test
    public void testEmptyList() {
        System.out.println("\nSortedPairsTest#testEmptyList");
        int[] arr = {};
        SortedPairs.printAllPairs(arr);
    }

    @Test
    public void testSimpleList() {
        System.out.println("\nSortedPairsTest#testSimpleList");
        int[] arr = {1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        SortedPairs.printAllPairs(arr);
    }

    @Test
    public void testMaxSizeList() {
        System.out.println("\nSortedPairsTest#testMaxSizeList");
        int[] arr = generateRandomMaxSizeArrayWithIntegers();
        SortedPairs.printAllPairs(arr);
    }

    @Test
    public void testListWithDuplicatedValues() {
        System.out.println("\nSortedPairsTest#testListWithDuplicatedValues");
        int[] arr = {46,  46,  46, -33, 46, 46, 46, 46, 46,  46, 46, 46, -33, -33, -33, -33, 46};
        SortedPairs.printAllPairs(arr);
    }

    @Test
    public void testListWithDuplicatedValues2() {
        System.out.println("\nSortedPairsTest#testListWithDuplicatedValues2");
        int[] arr = {46,  46,  46, -33, -33,   -33,   -33, -33, -33, -33, -33, -33, 46};
        SortedPairs.printAllPairs(arr);
    }

    @Test
    public void testListWithNoMatchingValues() {
        System.out.println("\nSortedPairsTest#testListWithDuplicatedValues");
        int[] arr = {1, 2, 3, 4, -1, -456, 88, 99, -23};
        SortedPairs.printAllPairs(arr);
    }
}