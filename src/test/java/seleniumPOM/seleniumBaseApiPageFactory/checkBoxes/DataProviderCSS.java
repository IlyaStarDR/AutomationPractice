package seleniumPOM.seleniumBaseApiPageFactory.checkBoxes;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataProviderCSS {

    @DataProvider
    public static Object[][] getCssSelector() {
        return new Object[][]{
                {By.cssSelector("input[id=\"checkbox-1\"]")},
                {By.cssSelector("input[id=\"checkbox-2\"]")},
                {By.cssSelector("input[id=\"checkbox-3\"]")}
        };
    }
}
