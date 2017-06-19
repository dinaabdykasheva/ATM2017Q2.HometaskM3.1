package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class CtgTest {
    private static final double DELTA = 1e-15;
    @Test
    public void ctgTest() {
        Calculator calc = new Calculator();
        double ctg = calc.ctg(225.0);
        Assert.assertEquals("Cotangent result is invalid", 1.0, ctg, DELTA);
    }

}
