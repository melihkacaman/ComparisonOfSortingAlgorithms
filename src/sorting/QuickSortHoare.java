package sorting;

public class QuickSortHoare<T extends Comparable<T>> implements Sorting<T> {

    @Override
    public void run(T[] list, int size) {
        quickSort(list, 0, size - 1);
    } 

    private void quickSort(T[] list, int low, int high){
        if(low < high) {
            int part = partition(list, low, high); 
            
            quickSort(list, low, part);
            quickSort(list, part + 1, high);
        }
    }

    private int partition(T[] list, int low, int high){
        T pivot = list[low]; 
        int i = low - 1, j = high + 1;

        while (true) {
            do {
                i++;
            } while (list[i].compareTo(pivot) < 0);
            
            do {
                j--;
            } while (list[j].compareTo(pivot) > 0);

            if (i >= j) {
                return j;
            }

            swap(list, i, j);
        }

    }

    private void swap(T[] list, int i, int j){
        T temp = list[i]; 
        list[i] = list[j]; 
        list[j] = temp; 
    }
}
