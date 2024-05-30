package com.tasks.thirdtask;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class SubgraphsCounterTest extends TestCase {
    public final int MAX_LIST_SIZE = 1000;

    public Set<Integer> generateRandomMaxSizeArrayWithIntegers() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            set.add(random.nextInt(MAX_LIST_SIZE));
        }
        return set;
    }

    @Test
    public void testSimpleGraph() {
        System.out.println("\nSubgraphsTest#testSimpleGraph");
        Map<Set<Integer>, Boolean> edges = new HashMap<>();
        edges.put(Set.of(1, 2),false);
        edges.put(Set.of(2, 3),false);
        edges.put(Set.of(4, 5),false);
        SubgraphsCounter subgraphsCounter = new SubgraphsCounter(edges);
        SubgraphsCounter.printSubgraphsNumber();
    }

    @Test
    public void testEmptyGraph() {
        System.out.println("\nSubgraphsTest#testEmptyGraph");
        Map<Set<Integer>, Boolean> edges = new HashMap<>();
        SubgraphsCounter subgraphsCounter = new SubgraphsCounter(edges);
        SubgraphsCounter.printSubgraphsNumber();
    }

    @Test
    public void testMaxGraph() {
        System.out.println("\nSubgraphsTest#testMaxGraph");
        Map<Set<Integer>, Boolean> edges = new HashMap<>();
        for(int i = 0; i < MAX_LIST_SIZE; i++) {
            edges.put(generateRandomMaxSizeArrayWithIntegers(),false);
        }
        System.out.println(edges);
        SubgraphsCounter subgraphsCounter = new SubgraphsCounter(edges);
        SubgraphsCounter.printSubgraphsNumber();
    }

}