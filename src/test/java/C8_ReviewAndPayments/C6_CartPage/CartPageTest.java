package C6_CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.CartPage;
import C1_BaseDriver.Getdriver;
import C5_SelectItem.SelectedItemTest;

public class CartPageTest {
    public WebDriver driver;
    CartPage cart;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void setup() throws InterruptedException {
        driver=new Getdriver().getDriver();
        SelectedItemTest Select=new SelectedItemTest();
        Select.setup();
        Select.SelectitemWithValid();
    }
    @Test(groups = {"includeXmlSceniaro"})
    public void SelectitemOfCart() throws InterruptedException {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        Thread.sleep(1500);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        int Quantity= 5 ;
        cart.UpdateQTYField(Integer.toString(Quantity));
        cart.UpdateShoppingCart();
        Thread.sleep(1000);
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectitemOfCartWithZero() throws InterruptedException {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        Thread.sleep(1500);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        cart.UpdateQTYField("0");
        cart.UpdateShoppingCart();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class=\"mage-error\"]")).getText(),"Please enter a number greater than 0 in this field.");
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectitemOfCartWithBlank() throws InterruptedException {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        Thread.sleep(1500);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        cart.UpdateQTYField("");
        cart.UpdateShoppingCart();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class=\"mage-error\"]")).getText(),"This is a required field.");
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterCartPageTest() {
        new Getdriver().quitDriver();
    }
}