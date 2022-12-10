import java.util.ArrayList;
import java.util.Collections;

public class FakeData {
    public static Integer[] generateIntegers(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            numbers.add(i);

        Collections.shuffle(numbers);

        return numbers.toArray(new Integer[0]);
    }

    public static Integer[] generateSortedIntegers(int n, boolean reverseSorted) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            numbers.add(i);
        
        if(reverseSorted == true)
            Collections.reverse(numbers);

        return numbers.toArray(new Integer[0]);  
    }

    public static void showIntegers(Integer[] list){
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
