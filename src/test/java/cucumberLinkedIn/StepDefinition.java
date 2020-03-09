package cucumberLinkedIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class StepDefinition {
    private LinkedInPage linkedInPage;


    @Given("^Open the Chrome and navigate to url$")
    public void openChromeAndNavigateToUrl() {
        WebDriver driver = new ChromeDriver();
        linkedInPage = new LinkedInPage(driver);
        linkedInPage.setUp();
        linkedInPage.navigateToUrlLinkedIn();
    }

    @When("^Enter the Username and Password$")
    public void enterUsernameAndPassword() {
        linkedInPage.setLogin("username");
        linkedInPage.setPassword("password");
    }

    @Then("^Click button submit and verify that error message appeared$")
    public void clickSubmit() {
        linkedInPage.clickSubmit();
        Assert.assertTrue(linkedInPage.checkIsErrorLoginMessageDisplayed());
        linkedInPage.tearDown();
    }
}

