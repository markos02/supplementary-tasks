package AT8_Jestesmy_potega;

import java.math.BigDecimal;

public class Power {

    public static BigDecimal calculatePower(int exponent, int power) {

        if (power == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal result = BigDecimal.valueOf(exponent);

        for (int i = 1; i < power; i++) {
            result = result.multiply(BigDecimal.valueOf(exponent));
        }

        return result;
    }
}
