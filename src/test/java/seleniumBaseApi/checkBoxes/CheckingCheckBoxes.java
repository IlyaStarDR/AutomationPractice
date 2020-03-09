package seleniumBaseApi.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckingCheckBoxes {
    private static final int DELAY = 0;
    private static final String URL_TO_SITE = "https://formy-project.herokuapp.com/checkbox";
    private static WebDriver chromeDriver;

    @BeforeClass
    public static void navigateChromeDriverToUrl() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to(URL_TO_SITE);
        chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "getXpathSelector", dataProviderClass = DataProviderXpath.class)
    public void clickOnAllCheckBoxesUsingXpath(By path) {
        chromeDriver.findElement(path).click();

    }

    @Test(dataProvider = "getCssSelector", dataProviderClass = DataProviderCSS.class)
    public void clickOnAllCheckBoxesUsingCSS(By path) {
        chromeDriver.findElement(path).click();
    }

    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
