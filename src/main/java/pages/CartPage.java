package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver w;
    public  CartPage(WebDriver W){
        this.w =W;
    }
    By UpdateQTYField = By.xpath("//*[@class=\"input-text qty\"]");

    By UpdateShoppingCartButton= By.xpath("//*[@id=\"form-validate\"]/div[2]/button");
    By ProceedToCheckoutButton= By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button");
    By CartIcon = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");

    public void MoveToCartPage() {
        w.findElement(CartIcon).click();
    }
    public void UpdateQTYField(String number) {
        WebElement q=w.findElement(UpdateQTYField);
        q.clear();
        q.sendKeys(number);
    }
    public void UpdateShoppingCart () {
        w.findElement(UpdateShoppingCartButton).click();
    }

}
