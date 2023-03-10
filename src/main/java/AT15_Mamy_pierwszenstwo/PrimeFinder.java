package AT15_Mamy_pierwszenstwo;

public class PrimeFinder {

    public static boolean isPrime(int number) {

        if (number <= 3) return (number > 1);
        if (number % 2 == 0 || number % 3 == 0) return false;


        for (int i = 5; i <= Math.sqrt(number); i+=6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }
}
