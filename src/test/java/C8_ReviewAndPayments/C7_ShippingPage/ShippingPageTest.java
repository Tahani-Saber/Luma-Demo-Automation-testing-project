package C7_ShippingPage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.ShippingPage;
import C1_BaseDriver.Getdriver;
import C6_CartPage.CartPageTest;

public class ShippingPageTest {
    WebDriver driver;
    ShippingPage Shipping;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void setup() throws InterruptedException {
        driver=new Getdriver().getDriver();
        CartPageTest cart=new CartPageTest();
        cart.setup();
        cart.SelectitemOfCart();
    }

    @Test(groups = {"includeXmlSceniaro"})
    public void validShippingWithState() throws InterruptedException {
        driver=new Getdriver().getDriver();
        Shipping=new ShippingPage(driver);
        Thread.sleep(1200);
        Shipping.ProceedToCheckout();
        try{
            Thread.sleep(1500);
            Shipping.EnterCompany("Ejada");
            Shipping.EnterStreetAddress("25 Street youssef");
            Shipping.EnterCountry("3",0,103);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.EnterCity("cairo");
            Shipping.EnterZipPostalCode(11656);
            Shipping.EnterPhoneNumber(01025645232);
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();
        }
        catch (RuntimeException e){
            Thread.sleep(200);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();
            }
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/checkout/#payment");
        }
    @Test(groups = {"excludeXmlSceniaro"})
    public void ValidShippingWithoutState() throws InterruptedException {
        driver=new Getdriver().getDriver();
        Shipping=new ShippingPage(driver);
        Thread.sleep(1300);
        Shipping.ProceedToCheckout();
        try {
            Thread.sleep(1600);
            Shipping.EnterCompany("Ejada");
            Shipping.EnterStreetAddress("25 Street youssef");
            Shipping.EnterCountry("Egypt", 1, 3);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.EnterCity("cairo");
            Shipping.EnterZipPostalCode(11656);
            Shipping.EnterPhoneNumber(01025645232);
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();
        }catch (RuntimeException e){
            Thread.sleep(200);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();
        }
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/checkout/#payment");
     }
    @Test(groups = {"excludeXmlSceniaro"})
    public void invalidShippingWithState() throws InterruptedException {
        driver = new Getdriver().getDriver();
        Shipping = new ShippingPage(driver);
        Thread.sleep(1000);
        Shipping.ProceedToCheckout();
       try{Thread.sleep(1500);
           Shipping.EnterCompany("Ejada");
           Shipping.EnterStreetAddress("25 Street youssef");
           Shipping.EnterCountry("", 0, 103);
           ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
           Shipping.EnterCity("cairo");
           Shipping.EnterZipPostalCode(11656);
           Shipping.EnterPhoneNumber(01025645232);
           Shipping.RadioButtonShipping(0);
           Shipping.EnterNext();
        }catch (RuntimeException e){
           Thread.sleep(200);
           ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
           Shipping.RadioButtonShipping(0);
           Shipping.EnterNext();
       }
        Assert.assertNotEquals(driver.getCurrentUrl(),"https://demo-m2.bird.eu/checkout/#payment");
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterShippingPageTest(){
       new Getdriver().quitDriver();
    }
}