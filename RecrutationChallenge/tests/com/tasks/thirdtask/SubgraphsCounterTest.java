package com.tasks.thirdtask;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class SubgraphsCounterTest extends TestCase {
    public SubgraphsCounterTest() {
    }

    public final int MAX_LIST_SIZE = 10000000;
    public final int MAX_VALUE = 238609294;
    public List<int[]> edges = new ArrayList<>();

    public int[] generateRandomArrayWithIntegers() {
        Random random = new Random();
        return new int[]{random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE)};
    }

    @Test
    public void testSimpleGraph() {
        edges.clear();
        edges.add(new int[]{1, 3});
        edges.add(new int[]{1, 4});
        edges.add(new int[]{5, 6});
        edges.add(new int[]{7, 8});
        edges.add(new int[]{3, 2});
        edges.add(new int[]{3, 4});
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of(1, 2, 3, 4, 5, 6, 7, 8));
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSimpleGraph2() {
        edges.clear();
        edges.add(new int[]{1, 3});
        edges.add(new int[]{1, 4});
        edges.add(new int[]{5, 6});
        edges.add(new int[]{5, 8});
        edges.add(new int[]{3, 4});
        edges.add(new int[]{8, 11});
        edges.add(new int[]{12, 13});
        edges.add(new int[]{14, 14});
        edges.add(new int[]{12, 15});
        edges.add(new int[]{15, 1});
        edges.add(new int[]{12, 5});
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of(1, 3, 4, 5, 6, 8, 11, 12, 13, 14, 15));
        Assert.assertEquals(2, result);
    }

    @Test
    public void testSimpleGraph3() {
        edges.clear();
        edges.add(new int[]{1, 2});
        edges.add(new int[]{2, 3});
        edges.add(new int[]{4, 5});
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of(1, 2, 3, 4, 5));
        Assert.assertEquals(2, result);
    }

    @Test
    public void testEmptyGraph() {
        edges.clear();
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of());
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGraphWithDuplicatedEdges() {
        edges.clear();
        edges.add(new int[]{1, 3});
        edges.add(new int[]{1, 3});
        edges.add(new int[]{5, 6});
        edges.add(new int[]{3, 1});
        edges.add(new int[]{2, 5});
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of(1, 2, 3, 5, 6));
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGraphWithDuplicatedVerticles() {
        edges.clear();
        edges.add(new int[]{1, 1});
        edges.add(new int[]{1, 1});
        edges.add(new int[]{1, 1});
        edges.add(new int[]{2, 1});
        int result = SupgraphsCounter.getSubgraphsNumber(edges, Set.of(1, 2));
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMaxGraph() {
        edges.clear();
        System.out.println("\nSubgraphsTest#testMaxGraph");
        for (int i = 0; i < MAX_LIST_SIZE; i++) {
            edges.add(generateRandomArrayWithIntegers());
        }

        Set<Integer> verticles = edges.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toSet());
        ;
        System.out.println(SupgraphsCounter.getSubgraphsNumber(edges, verticles));
    }

}