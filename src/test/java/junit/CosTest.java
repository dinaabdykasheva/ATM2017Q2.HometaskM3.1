package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class CosTest {
    private static final double DELTA = 1e-15;
    @Test
    public void cosTest() {
        Calculator calc = new Calculator();
        double cos = calc.cos(60.0);
        Assert.assertEquals("Cosinus result is invalid", 0.5, cos, DELTA);
    }
}
