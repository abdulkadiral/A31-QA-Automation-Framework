package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllSongsPage extends BasePage {

    By allSongsBtn = By.xpath("//a[@href=\"#!/songs\"]");

    By shuffleButton = By.xpath("//button[@data-test=\"btn-shuffle-all\"]");

    By allSongsPageHeader = By.xpath("//*[contains(text(), '66 songs')]");


    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }


    public void clickAllSongspage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(allSongsBtn));
        driver.findElement(allSongsBtn).click();
    }


    public void clickShuffleAllSongs() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shuffleButton));

    }

    public WebElement getAllSongsTitle() {return findElement(allSongsPageHeader); }



    }
