package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class MultiplicationTest {
    private static final double DELTA = 1e-15;
    @Test
    public void multiplicationTestDoubleNumber() {
        Calculator calc = new Calculator();
        double mult = calc.mult(2.0, 2.0);
        Assert.assertEquals("Multiplication result is invalid", 4.0, mult, DELTA);
    }

    @Test
    public void multiplicationTestLongNumber(){
        Calculator calc = new Calculator();
        long mult = calc.mult(3, 6);
        Assert.assertEquals("Multiplication result is invalid", 18, mult, DELTA);
    }
}
