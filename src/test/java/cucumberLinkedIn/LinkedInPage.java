package cucumberLinkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInPage {
    private WebDriver driver;
    private final static String URL = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";

    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement buttonSubmit;
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "error-for-username")
    WebElement errorLogin;

    public LinkedInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUp() {
        driver.manage().window().maximize();
    }

    public void navigateToUrl() {
        driver.navigate().to(URL);
    }

    public void setLogin(String login) {
        username.clear();
        username.sendKeys(login);
    }

    public void setPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickSubmit() {
        buttonSubmit.click();
    }

    public boolean checkIsErrorLoginMessageDisplayed() {
        return errorLogin.isDisplayed();
    }

    public void tearDown() {
        driver.quit();
    }


}
