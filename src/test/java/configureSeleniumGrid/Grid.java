package configureSeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    private WebDriver driver;
    private String baseUrl;
    private String nodeUrl;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        baseUrl = "https://www.wikipedia.org/";
        nodeUrl = "http://77.47.207.230:16811/wd/hub";
        driver = new RemoteWebDriver(new URL(nodeUrl), DesiredCapabilities.chrome());
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void simpleTest() {
        driver.get(baseUrl);
        String expectedTitle = "Wikipedia";
        Assert.assertEquals(expectedTitle, driver.getTitle(), "Titles are not equals");
    }
}
