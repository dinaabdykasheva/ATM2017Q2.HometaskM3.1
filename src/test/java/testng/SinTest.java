package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class SinTest extends AbstractCalculator{

    @Test(groups = "sinTest", dataProvider = "sinTestProvider")
    @Parameters({"a", "expected"})
    public void sinTest(double a, double expected) {
        double sin = calculator.sin(a);
        Assert.assertEquals(sin, expected, "sinus result is invalid");
    }

    @DataProvider(name = "sinTestProvider")
    public Object[][] sinTestProvider(){
        return new Object[][]{
                {30.0, 0.5},
                {44545.4, -0.99677887845624716593076266806088},
                {-175.46, -0.07915505614505839663449854776763}
        };
    }

}
