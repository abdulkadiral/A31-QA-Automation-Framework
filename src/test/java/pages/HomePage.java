package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy
    By userAvatarIcon = By.cssSelector("img.avatar");

    By searchField = By.cssSelector("[type=\"search\"]");

    public HomePage( WebDriver givenDriver) {
        super(givenDriver);
    }

    public WebElement getUserAvatar () {
        return findElement(userAvatarIcon);
    }
    public void enterinSearchField(String item){
        WebElement searchBox = driver.findElement(searchField);
        searchBox.click();
        searchBox.sendKeys(item);


    }

}
