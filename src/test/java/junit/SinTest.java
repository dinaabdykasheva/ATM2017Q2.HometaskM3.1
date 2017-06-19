package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SinTest {
    private static final double DELTA = 1e-15;
    @Test
    public void sinTest() {
        Calculator calc = new Calculator();
        double sin = calc.sin(30.0);
        Assert.assertEquals("sinus result is invalid", 0.5, sin, DELTA);
    }

}
