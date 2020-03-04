package seleniumPOM.formPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormPage {
    public final static String URL = "https://formy-project.herokuapp.com/form";
    private WebDriver driver;

    @FindBy(id = "first-name")
    WebElement firstName;
    @FindBy(id = "last-name")
    WebElement lastName;
    @FindBy(id = "job-title")
    WebElement jobTitle;
    @FindBy(xpath = "//input[@type=\"radio\"]")
    List<WebElement> levelOfEducation;
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    List<WebElement> sex;
    @FindBy(id = "select-menu")
    WebElement yearsOfExperience;
    @FindBy(id = "datepicker")
    WebElement datepicker;
    @FindBy(className = "btn-primary")
    WebElement submit;


    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    public void fillFirstName(String name) {
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void fillLastName(String name) {
        lastName.clear();
        lastName.sendKeys(name);
    }

    public void fillJobTitle(String job) {
        jobTitle.clear();
        jobTitle.sendKeys(job);
    }

    public void selectEducation(String level) {
        for (WebElement element : levelOfEducation) {
            if (element.getText().equals(level)) {
                element.click();
            }
        }
    }

    public void selectSex(String option) {
        for (WebElement element : sex) {
            if (element.getText().equals(option)) {
                element.click();
            }
        }
    }

    public void selectYearsOfExperience(String text) {
        Select select = new Select(yearsOfExperience);
        select.selectByVisibleText(text);
    }

    public void fillDate(String date) {
        datepicker.clear();
        datepicker.sendKeys(date);
    }

    public void clickSubmit() {
        submit.submit();
    }
}
