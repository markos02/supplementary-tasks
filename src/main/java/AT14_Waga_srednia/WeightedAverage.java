package AT14_Waga_srednia;

import java.util.List;

public class WeightedAverage {

    public static double calculateWeightedAverage(List<Integer> grades, List<Integer> weights) {

        try {
            checkLists(grades, weights);
        } catch (IllegalListException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        double numerator = 0;
        double denominator = 0;


        for (int i = 0; i < grades.size(); i++) {
            try {
                checkValues(grades.get(i), weights.get(i));
            } catch (IllegalValueException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
            numerator = numerator + grades.get(i) * weights.get(i);
            denominator = denominator + weights.get(i);
        }

        return numerator / denominator;
    }

    private static void checkValues(int grade, int weight) throws IllegalValueException {
        if (grade < 1 || grade > 6) throw new IllegalValueException("Illegal grade value");
        if (weight < 1 || weight > 10) throw new IllegalValueException("Illegal weight value");
    }

    private static void checkLists(List<Integer> list1, List<Integer> list2) throws IllegalListException {
        if (list1.size() == 0 || list2.size() == 0) throw new IllegalListException("list size cannot be 0");
        if (list1.size() != list2.size()) throw new IllegalListException("Different number of grades and weights");
    }
}
