package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class DivisionTest {
    private static final double DELTA = 1e-15;
    @Test
    public void divisionTestDoubleNumber() {
        Calculator calc = new Calculator();
        double div = calc.div(4.0, 2.0);
        Assert.assertEquals("Division result is invalid", 2.0, div, DELTA);
    }

    @Test
    public void divisionTestLongNumber() {
        Calculator calc = new Calculator();
        long div = calc.div(4, 2);
        Assert.assertEquals("Division result is invalid", 2, div, DELTA);
    }

}
