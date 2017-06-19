package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class CtgTest extends AbstractCalculator{

    public CtgTest(Calculator calculator) {
        super(calculator);
    }

    @Test(groups = "ctgTest", dataProvider = "ctgTestProvider")
    @Parameters({"a", "expected"})
    public void ctgTest(double a, double expected) {
        double ctg = calculator.ctg(a);
        Assert.assertEquals(ctg, expected, "Cotangent result is invalid");
    }

    @DataProvider(name = "ctgTestProvider")
    public Object[][] ctgTestProvider(){
        return new Object[][]{
                {45.0, 1},
        };
    }

}
