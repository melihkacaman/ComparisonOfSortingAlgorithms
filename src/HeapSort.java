public class HeapSort implements Sorting {

    @Override
    public <T extends Comparable<T>> void run(T[] list, int size) {
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(list, size, i);
 
        for (int i = size - 1; i > 0; i--) {
            swap(list, 0, i);
 
            heapify(list, i, 0);
        }
        
    }

    private <T extends Comparable<T>> void heapify(T list[], int N, int i){
        int enBuyuk = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < N && list[left].compareTo(list[enBuyuk]) > 0)
            enBuyuk = left;
 
        if (right < N && list[right].compareTo(list[enBuyuk]) > 0)
            enBuyuk = right;
 
        if (enBuyuk != i) {
            swap(list, i, enBuyuk);

            heapify(list, N, enBuyuk);
        }
    }

    private <T extends Comparable<T>> void swap(T list[], int i, int j){
        T swap = list[i];
        list[i] = list[j];
        list[j] = swap;
    }

}