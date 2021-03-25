package cr.ac.itcr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public Calculator calculator = new Calculator();

    @Test
    public void normalSum() {
        Assertions.assertEquals(666, calculator.sum(222, 444));
    }

    @Test
    void negativeSum() {
        Assertions.assertEquals(-15, calculator.sum(20, -35));
    }

    @Test
    void normalMultiply() {
        Assertions.assertEquals(63, calculator.multiply(7, 9));
    }

    @Test
    void floatMultiply() {
        Assertions.assertEquals(9.75, calculator.multiply(2.5f, 3.9f));
    }

    @Test
    void normalDivision() {
        Assertions.assertEquals(2f/3f, calculator.divide(2, 3));
    }

    @Test
    void negativeDivision() {
        Assertions.assertEquals(-8, calculator.divide(64, -8));
    }
}
