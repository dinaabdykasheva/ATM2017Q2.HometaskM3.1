package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class TgTest extends AbstractCalculator{

    @Test(groups = "tgTest", dataProvider = "tgTestProvider")
    @Parameters({"a", "expected"})
    public void tgTest(double a, double expected) {
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, expected, "Tangent result is invalid");
    }

    @DataProvider(name = "tgTestProvider")
    public Object[][] tgTestProvider(){
        return new Object[][]{
                {45.0, 1},
                {565656.45, -8.8455102710645460958916450124203},
                {-45.66, -1.0233078643762423307952864358002}
        };
    }
}
