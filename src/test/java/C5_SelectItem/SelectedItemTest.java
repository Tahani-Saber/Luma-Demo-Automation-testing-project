package C5_SelectItem;
import C4_HomePage.HomePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.SelectedItemPage;
import C1_BaseDriver.Getdriver;

public class SelectedItemTest {
    WebDriver driver;SelectedItemPage selectitem;
    @BeforeMethod(groups = {"excludeXmlSceniaro"})
    public void setup() throws InterruptedException {
        driver=new Getdriver().getDriver();
        HomePageTest homepage=new HomePageTest();
        homepage.setup();
        homepage.Search_SelectItem();
    }
    @Test(groups = {"includeXmlSceniaro"})
    public void SelectitemWithValid() throws InterruptedException {
        driver=new Getdriver().getDriver();
        selectitem=new SelectedItemPage(driver);
        Thread.sleep(1000);
        selectitem.EnterQTYField("3");
        selectitem.PressAddToCart();
        Thread.sleep(1000);
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectItemWithZero() throws InterruptedException {
        driver=new Getdriver().getDriver();
        selectitem=new SelectedItemPage(driver);
        Thread.sleep(1000);
        selectitem.EnterQTYField("0");
        selectitem.PressAddToCart();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"qty-error\"]")).getText(),"Please enter a quantity greater than 0.");
    }
    @Test(groups = {"excludeXmlSceniaro"})
    public void SelectItemWithBlank() throws InterruptedException {
        driver=new Getdriver().getDriver();
        selectitem=new SelectedItemPage(driver);
        Thread.sleep(1000);
        selectitem.EnterQTYField("");
        selectitem.PressAddToCart();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"qty-error\"]")).getText(),"Please enter a valid number in this field.");
    }
    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterSelectedItemTest(){
        new Getdriver().quitDriver();
    }
}