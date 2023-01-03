import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest{

    @Test

    public static void Login() throws InterruptedException{

        navigateToPage();
        provideEmail("adeagle2021@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();

    }

   @Test
  ```````````````````````````````
    public static void addSongToPlaylist()throws InterruptedException{
       WebElement allSongs = driver.findElement(By.cssSelector("//a[@class='songs active']"));
       allSongs.click();

       Thread.sleep(2000);

       WebElement HoliznaS = driver.findElement(By.cssSelector("//*[text()='HoliznaCC0 - Waiting On A Train']"));
       HoliznaS.click();
       Thread.sleep(2000);
       WebElement Addto = driver.findElement(By.cssSelector(".btn-add-to"));
       Addto.click();
       Thread.sleep(2000);
       WebElement Playcreation = driver.findElement(By.cssSelector("//input[@type='text']"));
       Playcreation.click();
       Playcreation.sendKeys("s");

       Thread.sleep(2000);

      WebElement submit = driver.findElement(By.cssSelector("//button[@type='submit']"));
      submit.click();
}

}