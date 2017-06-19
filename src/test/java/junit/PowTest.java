package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class PowTest {
    private static final double DELTA = 1e-15;
    @Test
    public void powTest() {
        Calculator calc = new Calculator();
        double pow = calc.pow(2.0, 3.0);
        Assert.assertEquals("Exponentiation result is invalid", 8.0, pow, DELTA);
    }

}
