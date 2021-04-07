package cr.ac.itcr;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void normalSum() {
        Assert.assertEquals(666, calculator.sum(222, 444));
    }

    @Test
    public void negativeSum() {
        Assert.assertEquals(-15, calculator.sum(20, -35));
    }

    @Test
    public void normalMultiply() {
        Assert.assertEquals(63, calculator.multiply(7, 9));
    }

    @Test
    public void floatMultiply() {
        Assert.assertEquals(9.75, calculator.multiply(2.5f, 3.9f), 0);
    }

    @Test
    public void normalDivision() {
        Assert.assertEquals(2f/3f, calculator.divide(2, 3), 0);
    }

    @Test
    public void negativeDivision() {
        Assert.assertEquals(-8, calculator.divide(64, -8), 0);
    }
}

