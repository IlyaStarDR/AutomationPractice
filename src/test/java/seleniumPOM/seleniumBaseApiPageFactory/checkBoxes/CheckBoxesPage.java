package seleniumPOM.seleniumBaseApiPageFactory.checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxesPage {
    @FindBy
    WebElement checkBox;
    private WebDriver driver;


    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCheckBox(By xpath) {
        checkBox = driver.findElement(xpath);
        checkBox.click();
    }

    public boolean isCheckBoxSelected() {
        return checkBox.isSelected();
    }
}
