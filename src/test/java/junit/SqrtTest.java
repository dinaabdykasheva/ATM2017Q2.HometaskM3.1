package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SqrtTest {
    private static final double DELTA = 1e-15;
    @Test
    public void sqrtTest() {
        Calculator calc = new Calculator();
        double sqrt = calc.sqrt(4.0);
        Assert.assertEquals("Square root result is invalid", 2.0, sqrt, DELTA);
    }

}
