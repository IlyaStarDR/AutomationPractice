package seleniumPOM.seleniumBaseApiPageFactory.dropdownMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDropdownPage {
    private static final int DELAY = 0;
    private static WebDriver chromeDriver;
    private DropdownPage dropdownPage;

    @BeforeClass
    public static void navigateChromeDriverToUrl() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "getUrlsOfDropMenu", dataProviderClass = DataProviderUrls.class)
    public void checkUrlsOfElementsOFDropdownMenuAreEqual(int index, String expectedUrl) {
        dropdownPage = new DropdownPage(chromeDriver);
        dropdownPage.navigateToUrlOfDropdown();
        dropdownPage.clickOnDropdownMenu();
        String actualUrl = dropdownPage.getElementsUrlsOfDropdownMenu(index - 1);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @AfterClass
    public void tearDown() {
        chromeDriver.quit();
    }
}
