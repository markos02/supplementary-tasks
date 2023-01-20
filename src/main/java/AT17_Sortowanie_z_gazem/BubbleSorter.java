package AT17_Sortowanie_z_gazem;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorter {

    public static List<Integer> bubbleSort(List<Integer> list) {

        List<Integer> sortedList = new ArrayList<>(list);
        int range = sortedList.size() - 1;
        int temp;

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = 0; j < range; j++) {
                if (sortedList.get(j) > sortedList.get(j + 1)) {
                    temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
            range--;
        }
        return sortedList;
    }
}
