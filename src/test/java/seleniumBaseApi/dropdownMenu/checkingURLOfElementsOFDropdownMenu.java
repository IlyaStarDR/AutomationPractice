package seleniumBaseApi.dropdownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class checkingURLOfElementsOFDropdownMenu {
    private static WebDriver chromeDriver;
    private static final int DELAY = 5;
    private static final String URL_TO_SITE = "https://formy-project.herokuapp.com/dropdown";
    private static final String XPATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH = "//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a";
    private static final String ID_OF_DROPDOWN_MENU = "dropdownMenuButton";


    @BeforeClass
    public static void navigateChromeDriverToUrl() {

        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "getUrlsOfDropMenu", dataProviderClass = DataProviderUrls.class)
    public void checkUrlsOfElementsOFDropdownMenuAreEqual(int index, String expectedUrl) {


        chromeDriver.navigate().to(URL_TO_SITE);
        WebElement dropDownMenuElement = chromeDriver.findElement(By.xpath(XPATH_TO_ITEMS_OF_DROPDOWN_MENU_BY_XPATH + "[" + index + "]"));
        WebElement dropDownMenu = chromeDriver.findElement(By.id(ID_OF_DROPDOWN_MENU));

//        Wait<WebDriver> wait = new FluentWait<>(chromeDriver)
//                .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);
        WebDriverWait wait = new WebDriverWait(chromeDriver, 2 * DELAY);
        wait.until(ExpectedConditions.visibilityOf(dropDownMenu)).click();
        wait.until(ExpectedConditions.visibilityOf(dropDownMenuElement)).click();
        String actualUrl = chromeDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }


    @AfterClass
    public void tearDown() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }
}