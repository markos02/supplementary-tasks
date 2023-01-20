package AT16_Wartosciowa_segregacja;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSorter {

    public static List<Integer> sortList(List<Integer> list) {

        List<Integer> tempList = new ArrayList<>(list);
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int index = MinMaxFinder.findMin(tempList);
            sortedList.add(tempList.get(index));
            tempList.remove(index);
        }

        return sortedList;
    }
}
