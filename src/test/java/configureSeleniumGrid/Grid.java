package configureSeleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    WebDriver driver;
    String baseUrl, nodeUrl;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        baseUrl ="https://www.wikipedia.org/";
        nodeUrl="http://77.47.207.230:16811/wd/hub";
        driver = new RemoteWebDriver(new URL(nodeUrl), DesiredCapabilities.chrome());
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void simpleTest() {
        driver.get(baseUrl);
        Assert.assertEquals("Wikipedia", driver.getTitle());
    }
}
