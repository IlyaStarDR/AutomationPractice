package seleniumBaseApi.checkBoxes;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class DataProviderXpath {

    @DataProvider
    public static Object[][] getXpathSelector() {
        return new Object[][]{
                {By.id("//input[@id=\"checkbox-1\"]")},
                {By.id("//input[@id=\"checkbox-2\"]")},
                {By.id("//input[@id=\"checkbox-3\"]")},
        };
    }
}
