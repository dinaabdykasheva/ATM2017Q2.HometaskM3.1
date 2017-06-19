package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class IsNegativeTest extends AbstractCalculator{

    public IsNegativeTest(Calculator calculator) {
        super(calculator);
    }

    @Test(dataProvider = "isNegativeTestProvider")
    @Parameters({"a", "expected"})
    public void isNegativeTest(long a, boolean expected) {
        boolean isNegative = calculator.isNegative(a);
        Assert.assertEquals(isNegative, expected, "Number isn't negative/positive");
    }

    @DataProvider(name = "isNegativeTestProvider")
    public Object[][] isNegativeTestProvider(){
        return new Object[][]{
                {-2, false}
        };
    }

}
