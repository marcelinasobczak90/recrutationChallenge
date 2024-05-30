package com.tasks.thirdtask;

import java.util.*;
import java.util.stream.Collectors;

public class SubgraphsCounter {
    private static Map<Set<Integer>, Boolean> edges = new HashMap<>();
    private static final List<Set<Integer>> subgraphList = new ArrayList<>();

    public SubgraphsCounter(Map<Set<Integer>, Boolean> edges) {
        SubgraphsCounter.edges =  edges;
    }

    public static void printSubgraphsNumber() {
        setSubgraphsList();
        System.out.println(subgraphList.size());
        subgraphList.forEach(System.out::println);
    }

    private static Set<Integer> getFullSubgraph(Set<Integer> keys, Set<Set<Integer>> keySet) {
        Set<Integer> set = new HashSet<>(keys);

        for (Set<Integer> nums : keySet) {
            if (isCommonPartInSets(nums, keys) && !edges.get(nums)) {
                set.addAll(nums);
                edges.put(nums, true);
            }
        }

        if (set.size() == keys.size()) {
            return set;
        } else {
            return getFullSubgraph(set, keySet);
        }
    }

    private static void setSubgraphsList() {
        for (Set<Integer> key : edges.keySet()) {
            if (!edges.get(key)) {
                Set<Integer> newSubgraph = getFullSubgraph(key, edges.keySet());
                subgraphList.add(newSubgraph);
            }
        }
    }

    private static void setEdges(String inputLine) {
        Set<Integer> inputSet = Arrays.stream(inputLine.split(" ")).map(Integer::parseInt).collect(Collectors.toSet());
        edges.put(inputSet, false);

    }

    private static boolean isCommonPartInSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> shorterArr = set1.size() <= set2.size() ? set1 : set2;
        Set<Integer> longerArr = set1.size() > set2.size() ? set1 : set2;

        for (int num : longerArr) {
            if (shorterArr.contains(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put number of lines n and n-lines containing pairs: ");

        try {
            int numberOfLines = Integer.parseInt(sc.nextLine());
            int i = 1;
            while (i <= numberOfLines) {
                String input = sc.nextLine();
                setEdges(input);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
        }

        sc.close();
        printSubgraphsNumber();
    }
}
