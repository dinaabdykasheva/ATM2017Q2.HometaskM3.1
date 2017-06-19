package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class DivisionTest extends AbstractCalculator{

    public DivisionTest(Calculator calculator) {
        super(calculator);
    }

    @Test(dataProvider = "divisionTestProviderDoubleNumber")
    @Parameters({"a", "b", "expected"})
    public void divisionTestDoubleNumber(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected, "Division result is invalid");
    }

    @DataProvider(name = "divisionTestProviderDoubleNumber")
    public Object[][] divisionTestProviderDoubleNumber(){
        return new Object[][]{
                {10.0, 2.0, 5.0},
                {45451123.2, 25451.2, 1785.814547054755767900924121456},
                {-25.0, -5.0, 5.0}
        };
    }

    @Test(dataProvider = "divTestProviderLongNumber")
    @Parameters({"a", "b", "expected"})
    public void divisionTestLongNumber(long a, long b, long expected) {
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected,"Division result is invalid");
    }

    @DataProvider(name = "divTestProviderLongNumber")
    public Object[][] divTestProviderLongNumber(){
        return new Object[][]{
                {10, 2, 5},
                {1000000000, 2000000, 500},
                {-94545, 5, -18909}
        };
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divisionTestDivideByZero() {
        double div = calculator.div(10, 0);
    }

}
