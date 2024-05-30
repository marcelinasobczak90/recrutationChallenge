package com.tasks.secondtask;

import java.util.*;

public class SortedPairs {
    private static final int sum = 13;

    private static Map<Integer, Integer> getMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }

    public static void printAllPairs(int[] arr) {
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        Map<Integer, Integer> map = getMap(arr);

        for (int j : sortedArray) {
            boolean isDiffPresent = map.get(sum - j) != null && map.get(sum - j) >= 1;
            if (map.get(j) >= 1 && isDiffPresent) {
                System.out.println(j + "\t" + (sum - j));
                map.put(sum - j, map.get(sum - j) - 1);
                map.put(j, map.get(j) - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Put numbers separated by space: ");
            String input = sc.nextLine();
            int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            printAllPairs(arr);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}