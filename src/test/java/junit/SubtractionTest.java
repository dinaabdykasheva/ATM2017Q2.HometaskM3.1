package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SubtractionTest {
    private static final double DELTA = 1e-15;
    @Test
    public void subtractionTestDoubleNumber() {
        Calculator calc = new Calculator();
        double sub = calc.sub(2.5, 2.3);
        Assert.assertEquals("Subtraction result is invalid", 0.2, sub, DELTA);
    }

    @Test
    public void subtractionTestLongNumber(){
        Calculator calc = new Calculator();
        long sub = calc.sub(6, 3);
        Assert.assertEquals("Subtraction result is invalid", 3, sub, DELTA);
    }
}
