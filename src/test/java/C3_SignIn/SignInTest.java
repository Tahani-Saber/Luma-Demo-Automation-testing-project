package C3_SignIn;

import C1_BaseDriver.Getdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SignInPage;
import org.testng.annotations.*;

public class SignInTest {
    WebDriver driver;
    SignInPage loginPage;
    @BeforeMethod(groups = {"includeXmlSceniaro"})
    public void setup(){
        driver=new Getdriver().getDriver();
        HomePage h=new HomePage(driver);
        h.PressSignIn();

    }

    @Test(groups = {"includeXmlSceniaro"})
    public void loginWithValidCredentials() {
        driver=new Getdriver().getDriver();
        loginPage=new SignInPage(driver);
        loginPage.enterEmail("SohailaaaaaaaaaaaaaAaaaaaaaaAAAaa@gmail.com");
        loginPage.enterPassword("Sohailaaaaaaaaaaaaaaaaaaaaaa.123");
        loginPage.SignInButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/");
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void loginWithinValidCredentials() {
        driver=new Getdriver().getDriver();
        loginPage=new SignInPage(driver);
        loginPage.enterEmail("Sohaa@gmail.com");
        loginPage.enterPassword("Sohailaaaaaa.123");
        loginPage.SignInButton();
        Assert.assertNotEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/");
    }

    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterSigninTest(){
        new Getdriver().quitDriver();
    }
}
