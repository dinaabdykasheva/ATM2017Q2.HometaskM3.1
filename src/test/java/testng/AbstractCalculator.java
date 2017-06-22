package testng;


import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

/**
 * Created by Dina_Abdykasheva on 6/19/2017.
 */
public class AbstractCalculator {
    protected Calculator calculator;

    @BeforeClass
    public void initCalc() {
        this.calculator = new Calculator();
    }
}
