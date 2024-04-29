import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

//    @FindBy(id = "com.google.android.calculator:id/clr")
//    WebElement btnClear;


    AndroidDriver androidDriver;

    public CalculatorScreen(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public String doSeries(String series) {
        char[] charArray = series.toCharArray();
        for (char ch : charArray) {
            if (Character.isDigit(ch)) {
                androidDriver.findElement(By.id("com.google.android.calculator:id/digit_"+ch)).click();
            } else {
                if (ch == '+') {
                    btnPlus.click();
                } else if (ch == '-') {
                    btnSub.click();
                } else if (ch == '*') {
                    btnMul.click();
                } else if (ch == '/') {
                    btnDiv.click();
                }
            }
        }

        btnEqual.click();

        return txtResult.getText();
    }

//    public void clear() {
//        btnClear.click();
//    }
}
