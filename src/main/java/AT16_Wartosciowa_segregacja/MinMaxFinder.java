package AT16_Wartosciowa_segregacja;

import java.util.List;

public class MinMaxFinder {

    public static int findMin(List<Integer> numbers) {

        int min = numbers.get(0);
        int index = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    public static int findMax(List<Integer> numbers) {

        int max = numbers.get(0);
        int index = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                index = i;
            }
        }
        return index;
    }
}
