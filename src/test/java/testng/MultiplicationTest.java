package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class MultiplicationTest extends AbstractCalculator{

    @Test(dataProvider = "multiplicationTestProviderDoubleNumber")
    @Parameters({"a", "b", "expected"})
    public void multiplicationTestDoubleNumber(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "Multiplication result is invalid");
    }

    @DataProvider(name = "multiplicationTestProviderDoubleNumber")
    public Object[][] multiplicationTestProviderDoubleNumber(){
        return new Object[][]{
                {2.0, 2.0, 4.0},
                {4561274.455, 55474.45, 253034191690.0},
                {-44564.44, 555, -24733265.0}
        };
    }

    @Test(dataProvider = "multiplicationTestProviderLongNumber")
    @Parameters({"a", "b", "expected"})
    public void multiplicationTestLongNumber(long a, long b, long expected) {
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "Multiplication result is invalid");
    }

    @DataProvider(name = "multiplicationTestProviderLongNumber")
    public Object[][] multiplicationTestProviderLongNumber(){
        return new Object[][]{
                {3, 5, 15},
                {56000004, 5, 280000020},
                {-455, -445455, 202682025}
        };
    }
}
