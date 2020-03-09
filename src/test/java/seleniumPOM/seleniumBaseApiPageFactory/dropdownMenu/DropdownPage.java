package seleniumPOM.seleniumBaseApiPageFactory.dropdownMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DropdownPage {
    private static final String URL_TO_SITE = "https://formy-project.herokuapp.com/dropdown";
    private static final int DELAY = 10;
    @FindBy(id = "dropdownMenuButton")
    WebElement dropdown;
    @FindBy(xpath = "//button[@id=\"dropdownMenuButton\"]/following-sibling::div/a")
    List<WebElement> urls;
    private WebDriver driver;
    private WebDriverWait wait;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, DELAY);
        PageFactory.initElements(driver, this);
    }

    public void navigateToUrlOfDropdown() {
        driver.navigate().to(URL_TO_SITE);
    }

    public void clickOnDropdownMenu() {
        wait.until(ExpectedConditions.visibilityOf(dropdown)).click();
    }

    public String getElementsUrlsOfDropdownMenu(int index) {
        wait.until(ExpectedConditions.visibilityOf(urls.get(index))).click();
        return driver.getCurrentUrl();
    }

}
