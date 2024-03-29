package C6_CartPage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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
    public void SelectitemOfCart() {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        cart.UpdateQTYField("4");
        cart.UpdateShoppingCart();
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectitemOfCartWithZero() {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        cart.UpdateQTYField("0");
        cart.UpdateShoppingCart();
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectitemOfCartWithBlank() {
        driver=new Getdriver().getDriver();
        cart=new CartPage(driver);
        cart.MoveToCartPage();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        cart.UpdateQTYField("");
        cart.UpdateShoppingCart();
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterCartPageTest(){
        new Getdriver().quitDriver();
    }
}
//0:Please enter a number greater than 0 in this field.
//blank:This is a required field.
//valid url:https://demo-m2.bird.eu/checkout/#shipping

    /*@DataProvider(name = "dataProvider1")
    public Object[][] dataProviderMethod1() {
        return new Object[][] {
                {""}
                ,{"0"}
                ,{"4"}
        };
    }*///(dataProvider = "dataProvider1")String [][]s