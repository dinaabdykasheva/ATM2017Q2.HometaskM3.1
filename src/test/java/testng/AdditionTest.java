package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class AdditionTest extends AbstractCalculator{

    @BeforeClass
    public void printCurrentThreadIdBeforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }

    @Test(dataProvider = "additionTestProviderDoubleNumber")
    @Parameters({"a", "b", "expected"})
    public void additionTestDoubleNumber(double a, double b, double expected) {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "Addition result is invalid");
    }

    @DataProvider(name = "additionTestProviderDoubleNumber")
    public Object[][] additionTestProviderDoubleNumber() {
        return new Object[][] {
                {1.0, 1.1, 2.1},
                {-556541.55, 6556522.444, 5999980.894}
        };
    }

    @Test(dataProvider = "additionTestProviderLongNumber")
    @Parameters({"a", "b", "expected"})
    public void additionTestLongNumber(long a, long b, long expected) {
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "Addition result is invalid");
    }

    @DataProvider(name = "additionTestProviderLongNumber")
    public Object[][] additionTestProviderLongNumber() {
        return new Object[][] {
                {5, 5, 10},
                {544545135, 454121454, 998666589}
        };
    }

    @AfterClass
    public void printCurrentThreadIdAfterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
}
