package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class IsNegativeTest {
    @Test
    public void isNegativeTest1() {
        Calculator calc = new Calculator();
        boolean isNegative = calc.isNegative(2);
        Assert.assertEquals("Number isn't negative/positive", false, isNegative);
    }

}
