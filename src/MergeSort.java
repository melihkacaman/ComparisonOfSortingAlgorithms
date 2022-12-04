import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting {
    public <T extends Comparable<T>> void run(T[] list, int size) {
        var left = new Comparable<T>[list.length / 2];
        var right = new Comparable[list.length - left.length];
        

        int center;
        if (size == 1) {
            return;
        } else {
            center = size / 2;
            for (int i = 0; i < center; i++) {
                left[i] = list[i];
            }
            for (int i = center; i < size; i++) {               
                right[i] = list[i];
            }

            run(left, left.length);
            run(right, right.length);

            merge(left, right, list);
        }
    }

    private <T extends Comparable<T>> void merge(Comparable[] left, Comparable[] right, T[] list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                // list.set(originalIndex, left.get(leftIndex));
                list[originalIndex] = left.get(leftIndex);
                leftIndex++;
            } else {
                // list.set(originalIndex, right.get(rightIndex));
                list[originalIndex] = right.get(rightIndex);
                rightIndex++;
            }
            originalIndex++;
        }

        while (leftIndex < left.size()) {
            //list.set(originalIndex, left.get(leftIndex));
            list[originalIndex] = left.get(leftIndex); 
            originalIndex++;
            leftIndex++;
        }
        while (rightIndex < right.size()) {
            //list.set(originalIndex, right.get(rightIndex));
            list[originalIndex] = right.get(rightIndex); 
            originalIndex++;
            rightIndex++;
        }
    }
}
