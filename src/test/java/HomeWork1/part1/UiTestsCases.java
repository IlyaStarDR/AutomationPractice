package HomeWork1.part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestsCases {

    @Test
    public void verifyString() {
        System.setProperty("webdriver.chrome.driver", "C:\\My_Files\\java\\DON'T TOUCH FRAMES\\chromeDrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
    }
}
