import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {

    CalculatorScreen calculatorScreen;

    @Test(description = "Calculation of a series")
    public void doSeries() {
        calculatorScreen = new CalculatorScreen(androidDriver);

        //we can do several series in one run with a dataset too
        String actualResult = calculatorScreen.doSeries("100/10*5-10+60");

        Assert.assertEquals(actualResult, "100");
    }

//    @AfterMethod
//    public void clear() {
//        calculatorScreen = new CalculatorScreen(androidDriver);
//        calculatorScreen.clear();
//    }
}
