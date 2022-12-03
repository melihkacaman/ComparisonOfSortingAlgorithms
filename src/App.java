import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] data_10 = FakeData.generaIntegers(10); 
        
        Integer[] data_1000 = FakeData.generaIntegers(1000);
        Integer[] data_5000 = FakeData.generaIntegers(5000);
        Integer[] data_10000 = FakeData.generaIntegers(10000);
        Integer[] data_50000 = FakeData.generaIntegers(50000);
        Integer[] data_100000 = FakeData.generaIntegers(100000);
        Integer[] data_500000 = FakeData.generaIntegers(500000);
        Integer[] data_1000000 = FakeData.generaIntegers(1000000);
        Integer[] data_5000000 = FakeData.generaIntegers(5000000);


        InsertionSort insertionSort = new InsertionSort();
        Worker.executeAndMeasure(insertionSort, data_500000.clone());
    }
}
