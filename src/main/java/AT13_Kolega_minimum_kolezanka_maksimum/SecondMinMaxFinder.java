package AT13_Kolega_minimum_kolezanka_maksimum;

import AT12_Minimalnie_maksymalni.MinMaxFinder;

import java.util.ArrayList;
import java.util.List;

public class SecondMinMaxFinder {

    public static int findMin(int[] numbers) {

        int min = MinMaxFinder.findMin(numbers);
        int[] tempArray = removeValue(numbers, min);
        return MinMaxFinder.findMin(tempArray);
    }

    public static int findMax(int[] numbers) {

        int max = MinMaxFinder.findMax(numbers);
        int[] tempArray = removeValue(numbers, max);
        return MinMaxFinder.findMax(tempArray);
    }

    private static int[] removeValue(int[] array, int value) {

        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                tempList.add(array[i]);
            }
        }

        return tempList.stream().mapToInt(Integer::intValue).toArray();
    }
}
