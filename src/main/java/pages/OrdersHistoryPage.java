package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersHistoryPage {
    By ProfileOptionButton=By.xpath("//*[@id=\"html-body\"]/div[6]/header/div[1]/div/ul/li[2]/span/button");
    By OrderHIstoryButton=By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[4]/a");
    By MyAccountButton=By.xpath("//*[@href=\"https://demo-m2.bird.eu/customer/account/\"]");

    WebDriver w;
    public  OrdersHistoryPage(WebDriver W){
        this.w =W;
    }
    public void AccountAndOrder() {
        w.findElement(ProfileOptionButton).click();
        w.findElement(MyAccountButton).click();
        w.findElement(OrderHIstoryButton).click();
    }

}
