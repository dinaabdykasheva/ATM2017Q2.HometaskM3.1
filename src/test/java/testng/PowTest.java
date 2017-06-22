package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class PowTest extends AbstractCalculator{

    @Test(dataProvider = "powTestProvider")
    @Parameters({"a", "b", "expected"})
    public void powTest(double a, double b, double expected) {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected, "Exponentiation result is invalid");
    }

    @DataProvider(name = "powTestProvider")
    public Object[][] powTestProvider(){
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {45454544.0, 2.0, 2066115570247936.0},
                {55554.55, -2, 3.2401172911844457E-10}
        };
    }

}
