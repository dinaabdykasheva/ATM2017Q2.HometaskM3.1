package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class TgTest {
    private static final double DELTA = 1e-15;
    @Test
    public void tgTest() {
        Calculator calc = new Calculator();
        double tg = calc.tg(45.0);
        Assert.assertEquals("Tangent result is invalid", 1.0, tg, DELTA);
    }

}
