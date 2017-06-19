package testng;


import com.epam.tat.module4.Calculator;

/**
 * Created by Dina_Abdykasheva on 6/19/2017.
 */
public class AbstractCalculator {
    protected Calculator calculator;

    public AbstractCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
