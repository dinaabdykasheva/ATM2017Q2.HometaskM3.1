package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class AdditionTest {
    private static final double DELTA = 1e-15;
    @Test
    public void additionTestDoubleNumber(){
        Calculator calc = new Calculator();
        double sum = calc.sum(2.3, 2.5);
        Assert.assertEquals("Addition result is invalid", 4.8, sum, DELTA);
    }

    @Test
    public void additionTestLongNumber(){
        Calculator calc = new Calculator();
        long sum = calc.sum(3, 3);
        Assert.assertEquals("Addition result is invalid", 6, sum, DELTA);
    }
}
