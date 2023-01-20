package AT5_Funkcja_dzielaca;

import java.util.ArrayList;
import java.util.List;

public class DivisibleFinder {

    public static List<Integer> findDivisible(int divider, int min, int max) {

        List<Integer> result = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (i % divider == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
