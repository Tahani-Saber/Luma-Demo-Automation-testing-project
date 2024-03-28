package C10_SignOut;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.SignOutPage;
import C1_BaseDriver.Getdriver;
import C9_OrderHistory.OrderHistoryTest;

public class Signout {
    private SignOutPage p;
    private WebDriver driver;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void OrderHistory() {
        driver=new Getdriver().getDriver();
        OrderHistoryTest order=new OrderHistoryTest();
        order.setup();
        order.OrderHistory();
    }
    @Test(groups = {"includeXmlSceniaro"})
    public void SignOut(){
        driver=new Getdriver().getDriver();
        p=new SignOutPage(driver);
        p.profileOption();
        p.Signout();
    }
    @AfterMethod(groups = {"includeXmlSceniaro"})
    public void SignOutTest(){
        new Getdriver().quitDriver();
    }
}
