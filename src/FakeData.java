import java.util.ArrayList;
import java.util.Collections;

public class FakeData {
    public static ArrayList<Integer> generaIntegers(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            numbers.add(i);

        Collections.shuffle(numbers);

        return numbers;
    }
}
