package AT13_Kolega_minimum_kolezanka_maksimum;

public class AT13Main {
    public static void main(String[] args) {
        int[] numbers = {3,1,5,6,7,9,15,3,4,7,10};
        System.out.println("Second Min: " + SecondMinMaxFinder.findMin(numbers));
        System.out.println("Second Max: " + SecondMinMaxFinder.findMax(numbers));
    }
}
