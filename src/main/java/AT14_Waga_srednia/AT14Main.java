package AT14_Waga_srednia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AT14Main {

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(3,1,1,5,6,4);
        List<Integer> weights = Arrays.asList(4,6,8,4,4,10);

        System.out.println("Srednia wazona: " + String.format("%.2f",WeightedAverage.calculateWeightedAverage(grades,weights)));
    }

}
