package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectedItemPage {

    WebDriver w;
    public  SelectedItemPage(WebDriver W){
        this.w =W;
    }
    By QTYField = By.xpath("//*[@id=\"qty\"]");
    By AddToCartButton= By.xpath("//*[@title=\"Add to Cart\"]");
    By CartIcon = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
    By ViewAndEditCart = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span");

    public void EnterQTYField(String number) {
        WebElement q=w.findElement(QTYField);
        q.clear();
        q.sendKeys(number);
    }
    public void PressAddToCart () {
        w.findElement(AddToCartButton).click();
    }

}
