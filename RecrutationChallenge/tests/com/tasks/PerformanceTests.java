package com.tasks;

import com.tasks.firsttask.SortedListTest;
import com.tasks.secondtask.SortedPairsTest;
import com.tasks.thirdtask.SubgraphsCounterTest;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PerformanceTests {
    //via reflection, I'm checking how much take all tests (especially cases with max size lists)
    @Test
    public void checkPerformance() {
        Class<?>[] testClasses = {SortedListTest.class, SortedPairsTest.class, SubgraphsCounterTest.class};

        for (Class<?> clazz : testClasses) {
            Method[] methods = clazz.getDeclaredMethods();
            Object testInstance = null;
            try {
                testInstance = clazz.getDeclaredConstructor().newInstance();
            } catch (IllegalAccessException | NoSuchMethodException | InstantiationException |
                     InvocationTargetException e) {
                System.out.println("Exception: " + e);
            }
            for (Method m : methods) {
                long startTime = System.currentTimeMillis();
                try {
                    m.invoke(testInstance);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Performance time: " + (endTime - startTime) / 1000 + " s.");
            }
        }
    }
}
