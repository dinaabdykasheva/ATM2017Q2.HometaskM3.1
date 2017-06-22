package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SubtractionTest extends AbstractCalculator{

    @BeforeClass
    public void printCurrentThreadIdBeforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }

    @Test(dataProvider = "subtractionTestProviderDoubleNumber")
    @Parameters({"a", "b", "expected"})
    public void subtractionTestDoubleNumber(double a, double b, double expected) {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "Subtraction result is invalid");
    }

    @DataProvider(name = "subtractionTestProviderDoubleNumber")
    public Object[][] subtractionTestProviderDoubleNumber(){
        return new Object[][]{
                {5.0, 2.0, 3.0},
                {-84544.44, -55555.55, -28988.89}
        };
    }

    @Test(dataProvider = "subtractionTestProviderLongNumber")
    @Parameters({"a", "b", "expected"})
    public void subtractionTestLongNumber(long a, long b, long expected) {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "Subtraction result is invalid");
    }

    @DataProvider(name = "subtractionTestProviderLongNumber")
    public Object[][] subtractionTestProviderLongNumber() {
        return new Object[][] {
                {2, 1, 1},
                {4552115, 556771355, -552219240}
        };
    }

    @AfterClass
    public void printCurrentThreadIdAfterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
}
