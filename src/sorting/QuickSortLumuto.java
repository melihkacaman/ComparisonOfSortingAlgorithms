package sorting;

public class QuickSortLumuto<T extends Comparable<T>> implements Sorting<T> {

    @Override
    public void run(T[] list, int size) {
        quickSort(list, 0, size-1);
    } 

    private void quickSort(T[] list, int low, int high){
        if(low < high) {
            int part = partition(list, low, high); 
            
            quickSort(list, low, part - 1);
            quickSort(list, part + 1, high);
        }
    }

    private int partition(T[] list, int low, int high){
        T pivot = list[high]; 

        int i = low - 1; 
        for (int j = low; j <= high - 1; j++) {
            if(list[j].compareTo(pivot) <= 0){
                i++; 
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1; 
    }

    private void swap(T[] list, int i, int j){
        T temp = list[i]; 
        list[i] = list[j]; 
        list[j] = temp; 
    }
}
