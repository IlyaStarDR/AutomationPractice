package seleniumPOM.seleniumBaseApiPageFactory.checkBoxes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumBaseApi.checkBoxes.DataProviderXpath;

public class TestCheckBoxesPage {
    private static final String URL_TO_SITE = "https://formy-project.herokuapp.com/checkbox";
    private static WebDriver chromeDriver;

    @BeforeClass
    public static void setUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to(URL_TO_SITE);

    }

    @Test(dataProvider = "getXpathSelector", dataProviderClass = DataProviderXpath.class)
    public void clickOnAllCheckBoxesUsingXpath(By xpath) {
        CheckBoxesPage boxesPage = new CheckBoxesPage(chromeDriver);
        boxesPage.clickOnCheckBox(xpath);
        Assert.assertTrue(boxesPage.isCheckBoxSelected(), "Check box isn't selected");
    }

    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
