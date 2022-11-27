import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        InsertionSort insertionSort = new InsertionSort();  
        
        Integer[] ins = {1,2,19,19,3,5};
        
        Worker.executeAndMeasure(insertionSort, ins);

        for (Integer integer : ins) {
            System.out.print(integer + " ");
        }
    }
}
