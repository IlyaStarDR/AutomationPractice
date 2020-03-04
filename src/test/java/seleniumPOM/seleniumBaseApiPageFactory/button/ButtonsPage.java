package seleniumPOM.seleniumBaseApiPageFactory.button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    private WebDriver driver;

    @FindBy(xpath = "//button[contains(text(), \"Primary\")]")
    WebElement buttonPrimary;

    @FindBy(className = "btn-success")
    WebElement buttonSuccess;
    @FindBy(className = "btn-info")
    WebElement buttonInfo;
    @FindBy(className = "btn-warning")
    WebElement buttonWarning;
    @FindBy(className = "btn-danger")
    WebElement buttonDanger;
    @FindBy(className = "btn-link")
    WebElement buttonLink;
    @FindBy(xpath = "//button[contains(text(), \"Left\")]")
    WebElement buttonLeft;
    @FindBy(xpath = "//button[contains(text(), \"Middle\")]")
    WebElement buttonMiddle;
    @FindBy(xpath = "//button[contains(text(), \"Right\")]")
    WebElement buttonRight;
    @FindBy(xpath = "//button[contains(text(), \"1\")]")
    WebElement buttonOne;
    @FindBy(xpath = "//button[contains(text(), \"2\")]")
    WebElement buttonTwo;
    @FindBy(id = "btnGroupDrop1")
    WebElement dropdown;
    @FindBy(xpath = "//a[contains(text(), \"Dropdown link 1\")]")
    WebElement linkOne;
    @FindBy(xpath = "//a[contains(text(), \"Dropdown link 2\")]")
    WebElement linkTwo;


    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnPrimary() {
        buttonPrimary.click();
    }

    public void clickOnSuccess() {
        buttonSuccess.click();
    }

    public void clickOnInfo() {
        buttonInfo.click();
    }

    public void clickOnWarning() {
        buttonWarning.click();
    }

    public void clickOnDanger() {
        buttonDanger.click();
    }

    public void clickOnLink() {
        buttonLink.click();
    }

    public void clickOnLeft() {
        buttonLeft.click();
    }

    public void clickOnMiddle() {
        buttonMiddle.click();
    }

    public void clickOnRight() {
        buttonRight.click();
    }

    public void clickOnOne() {
        buttonOne.click();
    }

    public void clickOnTwo() {
        buttonTwo.click();
    }

    public void clickOnDropdown() {
        dropdown.click();
    }

    public void clickOnDropdownAndLinkOne() {
        clickOnDropdown();
        linkOne.click();
    }

    public void clickOnDropdownAndLinkTwo() {
        clickOnDropdown();
        linkTwo.click();
    }

}
