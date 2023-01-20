package AT11_Fibonacci_recurrent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FibonacciRec {

    private BigDecimal firstNumber = BigDecimal.ZERO;
    private BigDecimal secondNumber = BigDecimal.ONE;

    public BigDecimal fibonacciNumber(int number) {

        if (number != 0) {
            BigDecimal temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = secondNumber.add(temp);
            fibonacciNumber(number - 1);
        }

        return firstNumber;
    }

}
