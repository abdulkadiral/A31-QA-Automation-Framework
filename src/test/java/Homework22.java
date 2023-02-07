import org.testng.annotations.Test;
import pages.AllSongsPage;
import pages.HomePage;
import pages.LoginPage;

public class Homework22 extends BaseTest {



    @Test
    public void reNamePlaylist () throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allsongspage = new AllSongsPage(driver);


        loginPage.logIn();
        allsongspage.clickAllSongspage();
        allsongspage.getAllSongsTitle();

        Thread.sleep(2000);

    }



}
