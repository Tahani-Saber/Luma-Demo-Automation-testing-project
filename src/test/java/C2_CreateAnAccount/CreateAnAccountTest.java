package C2_CreateAnAccount;

import C1_BaseDriver.Getdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CreateAnAccountPage;
import pages.HomePage;


public class CreateAnAccountTest {
    WebDriver driver;
    CreateAnAccountPage createaccount;
    @BeforeMethod(groups = {"includeXmlSceniaro"})
    public void setup(){
        driver=new Getdriver().getDriver();
        HomePage h=new HomePage(driver);
        h.PressCreateAnAccount();
        createaccount=new CreateAnAccountPage(driver);
    }
    @Test(groups = {"includeXmlSceniaro"})
    public void valid_Register() {
        createaccount.EnterFirstName("SohaiaaaaaaaaaaaaaaaalAaaaAaa");
        createaccount.EnterLastName("AshrafaaaaaaaaaaaaaaaaAaaAaa");
        createaccount.EnterSignUpForNewslettter();
        createaccount.EnterAllowRemoteShoppingAssistance();
        createaccount.EnterEmail("SohailaaaaaaaaaaaaAaaaaaaaaaAAAaa@gmail.com");
        createaccount.EnterPassword("Sohailaaaaaaaaaaaaaaaaaaaaaa.123");
        createaccount.EnterConfirmPassword("Sohailaaaaaaaaaaaaaaaaaaaaaa.123");
        createaccount.EnterShowPassword();
        createaccount.EnterCreateAnAccountButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/customer/account/");
    }

    @Test(groups = {"excludeXmlSceniaro"})
    public void invalid_Register() {
        createaccount.EnterFirstName("Sohaiaaalaaa");
        createaccount.EnterLastName("Ashrafaaaaa");
        createaccount.EnterSignUpForNewslettter();
        createaccount.EnterAllowRemoteShoppingAssistance();
        createaccount.EnterEmail("Sohailaaaaaa");
        createaccount.EnterPassword("Sohailaaaaaa.123");
        createaccount.EnterConfirmPassword("Sohailaaaaaa.123");
        createaccount.EnterShowPassword();
        createaccount.EnterCreateAnAccountButton();
        Assert.assertNotEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/customer/account/");
    }
    @AfterMethod(groups = {"includeXmlSceniaro"})
    public void AfterRegisterTest(){
        new Getdriver().quitDriver();
    }
}
//invalid:There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.
//url:https://demo-m2.bird.eu/customer/account/
//massage:Thank you for registering with Main Website Store.