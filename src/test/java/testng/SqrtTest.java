package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SqrtTest extends AbstractCalculator{

    public SqrtTest(Calculator calculator) {
        super(calculator);
    }

    @Test(dataProvider = "sqrtTestProvider")
    @Parameters({"a", "expected"})
    public void sqrtTest(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected, "Square root result is invalid");
    }

    @DataProvider(name = "sqrtTestProvider")
    public Object[][] sqrtTestProvider(){
        return new Object[][]{
                {25.0, 5.0},
                {5511145.44, 2347.5828931051615},
                {-1211545554.0, 34807.262948988103393791496973455}
        };
    }

}
