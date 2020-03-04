package seleniumPOM.seleniumBaseApiPageFactory.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestButtonsPage {

    private static WebDriver chromeDriver;

    @BeforeClass
    public static void setUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://formy-project.herokuapp.com/buttons#");
    }

    @Test
    public void testButtons() {
        ButtonsPage buttonsPage = new ButtonsPage(chromeDriver);
        buttonsPage.clickOnPrimary();
        buttonsPage.clickOnSuccess();
        buttonsPage.clickOnInfo();
        buttonsPage.clickOnWarning();
        buttonsPage.clickOnDanger();
        buttonsPage.clickOnLink();
        buttonsPage.clickOnLeft();
        buttonsPage.clickOnMiddle();
        buttonsPage.clickOnRight();
        buttonsPage.clickOnOne();
        buttonsPage.clickOnTwo();
        buttonsPage.clickOnDropdownAndLinkOne();
        buttonsPage.clickOnDropdownAndLinkTwo();
    }

    @AfterClass
    public void tearDown() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }

}
