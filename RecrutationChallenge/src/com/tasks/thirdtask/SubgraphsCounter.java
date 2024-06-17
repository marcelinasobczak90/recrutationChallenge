package com.tasks.thirdtask;

import java.util.*;

public class SupgraphsCounter {
    public static final Set<Integer> roots = new HashSet<>();
    public static int[] parents;
    public static int[] ranks;

    public static int findRoot(int vertex) {
        if (parents[vertex] != vertex) {
            parents[vertex] = findRoot(parents[vertex]);
        }
        return parents[vertex];
    }

    public static void joinVerticles(int v1, int v2) {
        int rootOfV1 = findRoot(v1);
        int rootOfV2 = findRoot(v2);

        if (rootOfV1 != rootOfV2) {
            if (ranks[rootOfV1] < ranks[rootOfV2]) {
                parents[rootOfV1] = rootOfV2;
                ranks[rootOfV2]++;
            } else {
                parents[rootOfV2] = rootOfV1;
                ranks[rootOfV1]++;
            }
        }
    }

    public static int getSubgraphsNumber(List<int[]> edges, Set<Integer> verticles) {
        if (edges.isEmpty() || verticles.isEmpty()) {
            return 0;
        }

        int maxVertex = verticles.stream().max(Comparator.comparing(Integer::intValue)).orElse(0);
        parents = new int[maxVertex + 1];
        ranks = new int[maxVertex + 1];
        //for test purposes
        roots.clear();

        for (int i = 0; i <= maxVertex; i++) {
            parents[i] = i;
        }

        Arrays.fill(ranks, 0);

        for (int[] edge : edges) {
            joinVerticles(edge[0], edge[1]);
        }

        for (int vertex : verticles) {
            roots.add(findRoot(vertex));
        }
        return roots.size();
    }

    public static void main(String[] args) {
        List<int[]> edges = new ArrayList<>();
        Set<Integer> verticles = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Put number of lines n and n-lines containing pairs: ");
        try {
            int numberOfLines = Integer.parseInt(sc.nextLine());
            int i = 1;
            while (i <= numberOfLines) {
                int first = sc.nextInt();
                int second = sc.nextInt();
                verticles.add(first);
                verticles.add(second);
                edges.add(new int[]{first, second});
                i++;
            }
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        sc.close();
        System.out.println(getSubgraphsNumber(edges, verticles));
    }
}