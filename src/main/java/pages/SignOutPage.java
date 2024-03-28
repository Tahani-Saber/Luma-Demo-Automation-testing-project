package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignOutPage {
    WebDriver w;
    public  SignOutPage(WebDriver W){
        this.w =W;
    }
    By ProfileOptionButton=By.xpath("//*[@id=\"html-body\"]/div[6]/header/div[1]/div/ul/li[2]/span/button");
    By SignOutButton=By.xpath("//*[@id=\"html-body\"]/div[6]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
    public WebDriver profileOption(){
        w.findElement(ProfileOptionButton).click();
        return w;
    }
    public void Signout() {
        w.findElement(SignOutButton).click();
    }
}
