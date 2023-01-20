package AT11_Fibonacci_recurrent;

public class AT11Main {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            FibonacciRec fibonacciRec = new FibonacciRec();
            System.out.println(i + ": " + fibonacciRec.fibonacciNumber(i));
        }
    }
}
