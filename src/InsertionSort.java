public class InsertionSort<T> {
    public static <T extends Comparable<T>> void insertionSort(T[] list, int size) {
        int outCounter = 1, inCounter;
        T temp;
        for (; outCounter < size; outCounter++) {
            temp = list[outCounter];
            for (inCounter = outCounter; inCounter > 0 && list[inCounter - 1].compareTo(temp) > 0; inCounter--)
                list[inCounter] = list[inCounter - 1];
            list[inCounter] = temp;
        }
    }
}
