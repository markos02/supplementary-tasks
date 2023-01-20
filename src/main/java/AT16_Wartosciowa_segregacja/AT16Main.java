package AT16_Wartosciowa_segregacja;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AT16Main {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(3,1,1,5,6,4));
        System.out.println(list);
        System.out.println("sorted list:");
        System.out.println(ListSorter.sortList(list));
    }
}
