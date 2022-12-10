import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] data_10 = FakeData.generateIntegers(10); 
        
        Integer[] data_1000 = FakeData.generateIntegers(1000);
        Integer[] data_1000_sorted = FakeData.generateSortedIntegers(1000, false);
        Integer[] data_1000_reverse_sorted = FakeData.generateSortedIntegers(1000, true);

        Integer[] data_5000 = FakeData.generateIntegers(5000);
        Integer[] data_5000_sorted = FakeData.generateSortedIntegers(5000, false);
        Integer[] data_5000_reverse_sorted = FakeData.generateSortedIntegers(5000, true);

        Integer[] data_10000 = FakeData.generateIntegers(10000);
        Integer[] data_10000_sorted = FakeData.generateSortedIntegers(10000, false);
        Integer[] data_10000_reverse_sorted = FakeData.generateSortedIntegers(10000, true);

        Integer[] data_50000 = FakeData.generateIntegers(50000);
        Integer[] data_50000_sorted = FakeData.generateSortedIntegers(50000, false);
        Integer[] data_50000_reverse_sorted = FakeData.generateSortedIntegers(50000, true);

        Integer[] data_100000 = FakeData.generateIntegers(100000);
        Integer[] data_100000_sorted = FakeData.generateSortedIntegers(100000, false);
        Integer[] data_100000_reverse_sorted = FakeData.generateSortedIntegers(100000, true);

        Integer[] data_500000 = FakeData.generateIntegers(500000);
        Integer[] data_500000_sorted = FakeData.generateSortedIntegers(500000, false);
        Integer[] data_500000_reverse_sorted = FakeData.generateSortedIntegers(500000, true);
        
        
        //Integer[] data_1000000 = FakeData.generateIntegers(1000000);
        //Integer[] data_5000000 = FakeData.generateIntegers(5000000);

        
        HeapSort<Integer> heapSort = new HeapSort<>(); 
        InsertionSort<Integer> insertionSort = new InsertionSort<>(); 
        MergeSort<Integer> mergeSort = new MergeSort<>(); 
        SelectionSort<Integer> selectionSort = new SelectionSort<>(); 

        QuickSortLumuto<Integer> quickSortLumuto = new QuickSortLumuto<>();
        QuickSortHoare<Integer> quickSortHoare = new QuickSortHoare<>();

        FakeData.showIntegers(data_1000);
        Worker.executeAndMeasure(quickSortLumuto, data_1000); 
        FakeData.showIntegers(data_1000);
    }
}
