package seleniumPOM.seleniumBaseApiPageFactory.checkBoxes;

import org.testng.annotations.DataProvider;

public class DataProviderXpath {

    @DataProvider
    public static Object[][] getXpathSelector() {
        return new Object[][]{
                {"//input[@id=\"checkbox-1\"]"},
                {"//input[@id=\"checkbox-2\"]"},
                {"//input[@id=\"checkbox-3\"]"},
        };
    }
}
