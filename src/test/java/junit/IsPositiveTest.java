package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class IsPositiveTest {
    @Test
    public void isPositiveTest1() {
        Calculator calc = new Calculator();
        boolean isPositive = calc.isPositive(2);
        Assert.assertEquals("Number isn't negative/positive", true, isPositive);
    }

}
