package C4_HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import C3_SignIn.SignInTest;
import java.util.concurrent.TimeUnit;
import C1_BaseDriver.Getdriver;

public class HomePageTest {
    WebDriver driver;
    HomePage home;
    SignInTest loginPage;
    @BeforeMethod(groups = {"excludeSetup"})
    public void setup(){
        loginPage=new SignInTest();
        loginPage.setup();
        loginPage.loginWithValidCredentials();
    }

    @Test(groups = {"includeXmlSceniaro"})
    public void Search_SelectItem() throws InterruptedException {
        driver=new Getdriver().getDriver();
        home=new HomePage(driver);
        Thread.sleep(1000);
        home.PressHome();
        Thread.sleep(1000);
        //Search items
        home.EnterSearchField("bag");
        home.EnterSearchIcon();
        //Wait
        Thread.sleep(500);
        //sort
        home.SortItems(2);
        //Wait
        Thread.sleep(500);
        //scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)", "");
        //Select item
        home.EnterSelectItem();
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterHomePageTest(){
        new Getdriver().quitDriver();
    }
}
