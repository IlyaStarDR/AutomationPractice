package seleniumBaseApi.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckingCheckBoxes {
    private static WebDriver chromeDriver;
    private static final int DELAY = 0;


    @BeforeClass
    public static void navigateChromeDriverToUrl() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://formy-project.herokuapp.com/checkbox");
        chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "getXpathSelector", dataProviderClass = DataProviderXpath.class)
    public void clickOnAllCheckBoxesUsingXpath(String path) {
        chromeDriver.findElement(By.xpath(path)).click();

    }

    @Test(dataProvider = "getCssSelector", dataProviderClass = DataProviderCSS.class)
    public void clickOnAllCheckBoxesUsingCSS(String path) {
        chromeDriver.findElement(By.cssSelector(path)).click();
    }

//    @AfterClass
//    public void tearDown() {
//        if (chromeDriver != null) {
//            chromeDriver.quit();
//        }
//    }
}
