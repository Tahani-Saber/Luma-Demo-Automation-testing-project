package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver w;
    public SignInPage(WebDriver W){
        this.w =W;
    }
    By EmailField = By.xpath("//*[@id=\"email\"]");
    By PasswordField = By.xpath("//*[@id=\"pass\"]");
    By SignInButton = By.xpath("//*[@id=\"send2\"]");

    public void enterEmail(String Email) {
        w.findElement(EmailField).sendKeys(Email);
    }
    public void enterPassword(String Password) {
        w.findElement(PasswordField).sendKeys(Password);
    }
    public void SignInButton() {
        w.findElement(SignInButton).click();
    }
}
