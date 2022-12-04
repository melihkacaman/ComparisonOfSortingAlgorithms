public class SelectionSort implements Sorting {

    @Override
    public <T extends Comparable<T>> void run(T[] list, int size) {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++)
                if (list[j].compareTo(list[min]) < 0)
                    min = j;

            if (min != i) {
                T temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }

}
