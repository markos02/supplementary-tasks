package AT9_Silnia;

import java.math.BigDecimal;

public class Factorial {

    public static BigDecimal calculateFactorial(int number) {

        BigDecimal result = BigDecimal.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }

        return result;
    }
}
