package AT5_Funkcja_dzielaca;

import java.util.List;

public class AT5Main {

    public static void main(String[] args) {

        List<Integer> result = DivisibleFinder.findDivisible(3450857, 0, 100000000);

        System.out.println(result);
    }
}
