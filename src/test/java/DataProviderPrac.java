import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class DataProviderPrac extends BaseTest {


    @DataProvider(name = "SearchItems")
    public static Object[][] enterMultipleSearchItems() {
        return new Object[][]{
                {"Dark"},
                {"Train"},
                {"Take"},
        };

    }
    @Test(priority = 0, dataProvider = "SearchItems")
    public void enterSearchItems(String items) throws InterruptedException {
        login("adeagle2021@gmail.com", "te$t$tudent");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type=\"search\"]"))).click();
        WebElement searchBox = driver.findElement(By.cssSelector("[type=\"search\"]"));
        searchBox.sendKeys(items);
        Thread.sleep(3000);

    }
    @DataProvider(name = "PlaylistNames")
    public static Object[][] enterNewPlaylistNames(){
        return new Object[][]{
                {"Joy"},
                {"Pain"},
                {"Rain"},

        };

    }
    @Test(dataProvider = "PlaylistNames")
    public void enterPlayNames(String plyname){
        HomePage homePage = new HomePage(driver);
        login("adeagle2021@gmail.com","te$t$tudent");
        homePage.getUserAvatar();
        WebElement playlistAdd = driver.findElement(By.cssSelector("[class=\"fa fa-plus-circle create\"]"));
        playlistAdd.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid=\"playlist-context-menu-create-simple\"]"))).click();
        WebElement PlaylistSearchField = driver.findElement(By.cssSelector("[name=\"name\"]"));
        PlaylistSearchField.click();
        PlaylistSearchField.sendKeys(plyname);
        PlaylistSearchField.sendKeys(Keys.ENTER);

    }
}