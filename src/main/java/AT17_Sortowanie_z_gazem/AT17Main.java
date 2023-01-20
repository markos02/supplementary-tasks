package AT17_Sortowanie_z_gazem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AT17Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(8,7,6,5,4,3,2,1));
        System.out.println(list);
        System.out.println("sorted list:");
        System.out.println(BubbleSorter.bubbleSort(list));
    }

}
