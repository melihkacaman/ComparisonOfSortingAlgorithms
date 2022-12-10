public class MergeSort implements Sorting {

    @Override
    public <T extends Comparable<T>> void run(T[] list, int size) {
        mergeSort(list, 0, size - 1);
    }
    
    private <T extends Comparable<T>> void mergeSort(T[] array, int start, int end)
    {
        if (start < end)
        {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid); 
            mergeSort(array, mid + 1, end); 
            merge(array, start, mid, end);
        }
    }

    private <T extends Comparable<T>> void merge(T[] list, int start, int mid, int end)
    {
        T[] left  = (T[]) new Comparable[mid - start + 1];
        T[] right = (T[]) new Comparable[end - mid];

        for (int i = 0; i < left.length; ++i)
            left[i] = list[start + i];
        for (int j = 0; j < right.length; ++j)
            right[j] = list[mid + 1 + j];

        int leftIdx = 0, rightIdx = 0, currentIdx = start;
        while (leftIdx < left.length && rightIdx < right.length)
        {
            if (left[leftIdx].compareTo(right[rightIdx]) <= 0){
                list[currentIdx] = left[leftIdx];
                leftIdx++;
            }
            else{
                list[currentIdx] = right[rightIdx];
                rightIdx++;
            }
            currentIdx++;
        }

        while (leftIdx < left.length) 
            list[currentIdx++] = left[leftIdx++];
        while (rightIdx < right.length) 
            list[currentIdx++] = right[rightIdx++];
    }
}
