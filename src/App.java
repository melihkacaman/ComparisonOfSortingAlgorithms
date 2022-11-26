public class App {
    public static void main(String[] args) throws Exception {
        Integer array[] = {10, 9, 8, 7, 6, 6, 4, 3, 2, 1}; 
        InsertionSort.insertionSort(array, array.length); 

        for(Integer i : array) 
            System.out.print(i + " ");
    }
}
