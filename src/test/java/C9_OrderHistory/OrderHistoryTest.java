package C9_OrderHistory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.OrdersHistoryPage;
import C3_SignIn.SignInTest;
import C1_BaseDriver.Getdriver;
public class OrderHistoryTest {
    WebDriver driver;
    OrdersHistoryPage order;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void setup(){
        SignInTest loginPage=new SignInTest();
        loginPage.setup();
        loginPage.loginWithValidCredentials();
    }
    @Test(groups = {"includeXmlSceniaro"})
    public void OrderHistory() {
        driver=new Getdriver().getDriver();
        order=new OrdersHistoryPage(driver);
        order.AccountAndOrder();
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterOrderTest(){
        new Getdriver().quitDriver();
    }
}
