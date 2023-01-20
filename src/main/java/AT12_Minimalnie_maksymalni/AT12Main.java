package AT12_Minimalnie_maksymalni;

public class AT12Main {
    public static void main(String[] args) {
        int[] numbers = {3,1,5,6,7,9,15,3,4,7,10};
        System.out.println("Min: " + MinMaxFinder.findMin(numbers));
        System.out.println("Max: " + MinMaxFinder.findMax(numbers));
    }
}
