package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class IsPositiveTest extends AbstractCalculator{

    public IsPositiveTest(Calculator calculator) {
        super(calculator);
    }

    @Test(dataProvider = "isPositiveTestProvider")
    @Parameters({"a", "expected"})
    public void isPositiveTest(long a, boolean expected) {
        boolean isPositive = calculator.isPositive(a);
        Assert.assertEquals(isPositive, expected, "Number isn't negative/positive");
    }

    @DataProvider(name = "isPositiveTestProvider")
    public Object[][] isPositiveTestProvider(){
        return new Object[][]{
                {2, true}
        };
    }


}
