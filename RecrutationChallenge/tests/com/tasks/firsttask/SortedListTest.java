package com.tasks.firsttask;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortedListTest extends TestCase {
    public SortedListTest() {
    }

    public final int MAX_LIST_SIZE = 10000000;
    public final int INT_MAX_VALUE = Integer.MAX_VALUE - 1;

    public List<Integer> generateRandomMaxSizeListWithIntegers() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < MAX_LIST_SIZE; i++) {
            //integers should be positive & negative
            list.add((random.nextInt(2) * 2 - 1) * random.nextInt(INT_MAX_VALUE));
        }
        return list;
    }

    @Test
    public void testEmptyList() {
        System.out.println("\nSortedListTest#testEmptyList");
        List<Integer> list = new ArrayList<>();
        SortedList sortedList = new SortedList(list);
        System.out.println(sortedList);
    }

    @Test
    public void testSimpleList() {
        System.out.println("\nSortedListTest#testSimpleList");
        List<Integer> list = Arrays.asList(1, 2, 7, -4, 9, -3, 4, -8);
        SortedList sortedList = new SortedList(list);
        System.out.println(sortedList);
    }

    @Test
    public void testMaxSizeList() {
        System.out.println("\nSortedListTest#testMaxSizeList");
        List<Integer> list = generateRandomMaxSizeListWithIntegers();
        SortedList sortedList = new SortedList(list);
        System.out.println(sortedList);
    }

    @Test
    public void testListWithDuplicates() {
        System.out.println("\nSortedListTest#testListWithOnlyDuplicates");
        List<Integer> list = Arrays.asList(-4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4);
        SortedList sortedList = new SortedList(list);
        System.out.println(sortedList);
    }
}