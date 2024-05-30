package com.tasks.firsttask;

import java.util.*;

public class SortedList {
    private final TreeSet<Integer> resultSet;
    private String elements;
    private final long count;

    @Override
    public String toString() {
        return elements.isEmpty() ? "Empty list, put some values... " :
                elements +
                        "\ncount: " + count +
                        "\ndistinct: " + resultSet.size() +
                        "\nmin: " + resultSet.first() +
                        "\nmax: " + resultSet.last();
    }

    private void setElements(Set<Integer> set) {
        StringBuffer sb = new StringBuffer();
        set.forEach(el -> sb.append(el).append(" "));
        this.elements = sb.toString();
    }

    public SortedList(List<Integer> list) {
        this.resultSet = new TreeSet<>(list);
        setElements(resultSet);
        this.count = list.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Put numbers separated by space: ");
            String input = sc.nextLine();
            List<Integer> list = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).boxed().toList();
            SortedList sortedList = new SortedList(list);
            System.out.println(sortedList);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}