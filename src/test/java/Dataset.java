import org.testng.annotations.DataProvider;

public class Dataset {
    @DataProvider(name = "data-provider")
    public Object[][] setData() {
        return new Object[][] {
                {100/10*5-10+60, 100},
                {50+10-20*2+10/2, 25},
                {76*5-45+100/5-55, 300}
        };
    }
}
