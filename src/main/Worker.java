package main;

import sorting.Sorting;

public class Worker {
    public static <T extends Comparable<T>> void executeAndMeasure(Sorting<T> algorithm, T[] sequence) {
        long startTime = System.nanoTime();
        algorithm.run(sequence, sequence.length);
        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Total execution time for " + algorithm.getClass().getName() + " " + sequence.length +" objects in Java in millis: " + elapsedTime / 1000000);
    }
}
