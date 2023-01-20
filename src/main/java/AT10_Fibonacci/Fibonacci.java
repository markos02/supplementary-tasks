package AT10_Fibonacci;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


    public static BigDecimal fibonacciNumber(int number) {

        if (number == 0) return BigDecimal.ZERO;

        List<BigDecimal> twoLastNumbers = new ArrayList<>();

        BigDecimal value = BigDecimal.ONE;

        twoLastNumbers.add(BigDecimal.ZERO);
        twoLastNumbers.add(BigDecimal.ONE);

        for (int i = 0; i < number - 1; i++) {
            value = twoLastNumbers.get(0).add(twoLastNumbers.get(1));
            twoLastNumbers.set(0, twoLastNumbers.get(1));
            twoLastNumbers.set(1, value);
        }

        return value;
    }
}
