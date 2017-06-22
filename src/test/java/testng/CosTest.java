package testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Dina_Abdykasheva on 5/31/2017.
 */
public class CosTest extends AbstractCalculator{

    @Test(groups = "cosTest", dataProvider = "cosTestProvider")
    @Parameters({"a", "expected"})
    public void cosTest(double a, double expected) {
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, expected, "Cosinus result is invalid");
    }

    @DataProvider(name = "cosTestProvider")
    public Object[][] cosTestProvider1(){
        return new Object[][]{
                {60.0, 0.5},
                {-13, 0.97437006478523522853969448008827},
                {45654.44, 0.41374010623486375554881744255136}
        };
    }

}
