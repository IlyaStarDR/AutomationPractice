package seleniumPOM.formPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFormPage {
    private static WebDriver chromeDriver;
    private static final int DELAY = 50;

    @BeforeClass
    public static void navigateChromeDriverToUrl() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test
    public void testFormPage() {
        FormPage form = new FormPage(chromeDriver);
        form.navigate();
        form.fillFirstName("Ilya");
        form.fillLastName("Starodubtcev");
        form.fillJobTitle("Junior QA Automation");
        form.selectEducation("College");
        form.selectSex("Male");
        form.selectYearsOfExperience("0-1");
        form.fillDate("09/19/2000");
        form.clickSubmit();
    }

    @AfterClass
    public void tearDown() {
        if (chromeDriver != null) {
            chromeDriver.quit();
        }
    }
}
