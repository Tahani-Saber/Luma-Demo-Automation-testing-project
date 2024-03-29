package C8_ReviewAndPayments;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.ReviewAndPaymentsPage;
import C1_BaseDriver.Getdriver;
import C7_ShippingPage.ShippingPageTest;

public class ReviewAndPaymentsTest {
    WebDriver driver;
    ReviewAndPaymentsPage review;
    @BeforeMethod(groups = {"excludeSetup"})
    public void setup() throws InterruptedException {
        driver=new Getdriver().getDriver();
        ShippingPageTest Ship=new ShippingPageTest();
        Ship.setup();
        Ship.validShippingWithState();

    }
    @Test(groups = {"includeXmlSceniaro"})
    public void Review() {
        driver=new Getdriver().getDriver();
        review=new ReviewAndPaymentsPage(driver);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
        review.RadioButtonSelected(0);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
        review.PlaceOrderButton();
    }

    @AfterMethod(groups = {"excludeXmlSceniaro"})
    public void AfterShippingPageTest(){
        new Getdriver().quitDriver();
    }
}