package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileStepDefinitions {

    WebDriver driver;
    WebDriverWait wait;

    WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
    WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));

    WebElement submitBtn = driver.findElement(By.cssSelector("[type='submit']"));

    WebElement avatarIcon = driver.findElement(By.cssSelector("[alt=\"Avatar of student\"]"));


    @Before
    public void openBrowser(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys("adeagle2021@gmail.com");
        passwordField.sendKeys("te$t$tudent");
        submitBtn.click();


    }
    @Given("I open Profile Page")
    public void openProfilePage(){
      wait.until(ExpectedConditions.elementToBeClickable(avatarIcon)).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name=\"current_password\"]")));
    }


    @When("I enter Current Password {string}")
    public void iEnterCurrentPassword(String arg0) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name=\"current_password\"]")))
                .sendKeys("te$t$tudent");

    }

    @And("I enter New Password {string}")
    public void iEnterNewPassword(String arg0) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[autocomplete=\"new-password\"]")))
                .sendKeys(" @");
    }

    @And("I save")
    public void iSave() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class=\"btn-submit\"]"))).click();
    }

    @Then("Password should be changed")
    public void passwordShouldBeChanged() {

    }
}
