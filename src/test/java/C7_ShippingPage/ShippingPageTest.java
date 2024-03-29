package C7_ShippingPage;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.ShippingPage;

import C1_BaseDriver.Getdriver;
import C6_CartPage.CartPageTest;

public class ShippingPageTest {
    WebDriver driver;
    By CompanyField = By.xpath("//*[@name=\"company\"]");
    ShippingPage Shipping;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void setup() throws InterruptedException {
        driver=new Getdriver().getDriver();
        CartPageTest cart=new CartPageTest();
        cart.setup();
        cart.SelectitemOfCart();
    }

    private boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    @Test(groups = {"includeXmlSceniaro"})
    public void validShippingWithState() throws InterruptedException {
        driver=new Getdriver().getDriver();
        Shipping=new ShippingPage(driver);
        Thread.sleep(1000);
        Shipping.ProceedToCheckout();
        By CompanyField = By.xpath("//*[@name=\"company\"]");
        try{
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
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();}
        }


    @Test(groups = {"excludeXmlSceniaro"})
    public void ValidShippingWithoutState() throws InterruptedException {
        driver=new Getdriver().getDriver();
        Shipping=new ShippingPage(driver);
        Thread.sleep(1000);
        Shipping.ProceedToCheckout();
        try {
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
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
                Shipping.RadioButtonShipping(0);
                Shipping.EnterNext();}
        }
    @Test(groups = {"excludeXmlSceniaro"})
    public void invalidShippingWithState() throws InterruptedException {
        driver = new Getdriver().getDriver();
        Shipping = new ShippingPage(driver);
        Thread.sleep(1000);
        Shipping.ProceedToCheckout();
       try{ Shipping.EnterCompany("Ejada");
        Shipping.EnterStreetAddress("25 Street youssef");
        Shipping.EnterCountry("", 0, 103);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
        Shipping.EnterCity("cairo");
        Shipping.EnterZipPostalCode(11656);
        Shipping.EnterPhoneNumber(01025645232);
        Shipping.RadioButtonShipping(0);
        Shipping.EnterNext();
    }catch (RuntimeException e){
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)", "");
            Shipping.RadioButtonShipping(0);
            Shipping.EnterNext();}
    }

    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterShippingPageTest(){
        new Getdriver().quitDriver();
    }
}
//blank :The shipping method is missing. Select the shipping method and try again.
