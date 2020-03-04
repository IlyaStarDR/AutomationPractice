package seleniumPOM.seleniumBaseApiPageFactory.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxesPage {
    private WebDriver driver;

    @FindBy
    WebElement checkBox;


    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCheckBox(String xpath) {
        checkBox = driver.findElement(By.xpath(xpath));
        checkBox.click();
    }
}
