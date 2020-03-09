package seleniumPOM.formPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThanksPage {

    private final static String URL_TO_THANKS_PAGE = "https://formy-project.herokuapp.com/form";
    WebDriver driver;
    @FindBy(xpath = "//div[@role=\"alert\"]")
    WebElement alertMessage;

    public ThanksPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.navigate().to(URL_TO_THANKS_PAGE);
    }

    public String getAlertMessage() {
        return alertMessage.getText();
    }
}
