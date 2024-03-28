package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccountPage {
    WebDriver w;
    public  CreateAnAccountPage(WebDriver W){
        this.w =W;
    }

    //Personal Information
    By FirstNameField = By.xpath("//*[@id=\"firstname\"]");
    By LastNameField = By.xpath("//*[@id=\"lastname\"]");
    By SignUpForNewslettterCheck = By.xpath("//*[@id=\"is_subscribed\"]");
    By AllowRemoteShoppingAssistanceCheck= By.xpath("//*[@id=\"assistance_allowed_checkbox\"]");

    //Sign-in Information
    By EmailField = By.xpath("//*[@id=\"email_address\"]");
    By PasswordField = By.xpath("//*[@id=\"password\"]");
    By ConfirmPasswordField = By.xpath("//*[@id=\"password-confirmation\"]");
    By ShowPasswordCheck= By.xpath("//*[@id=\"show-password\"]");
    By CreateAnAccountbutton=By.xpath("//*[@id=\"send2\"]");

    //Func. Personal information
    public void EnterFirstName(String FirstName) {
        WebElement q=w.findElement(FirstNameField);
        q.clear();
        q.sendKeys(FirstName);
    }
    public void EnterLastName(String LastName) {
        WebElement q=w.findElement(LastNameField);
        q.clear();
        q.sendKeys(LastName);
    }
    public void EnterSignUpForNewslettter() {
        WebElement checkbox = w.findElement(SignUpForNewslettterCheck);
        checkbox.click();
    }
    public void EnterAllowRemoteShoppingAssistance() {
        WebElement checkbox = w.findElement( AllowRemoteShoppingAssistanceCheck);
        checkbox.click();
    }

    //Func. Sign-in Information
    public void EnterEmail(String Email) {
        w.findElement(EmailField).sendKeys(Email);
    }
    public void EnterPassword(String Password) {
        w.findElement(PasswordField).sendKeys(Password);
    }
    public void EnterConfirmPassword(String ConfirmPassword) {
        w.findElement(ConfirmPasswordField).sendKeys(ConfirmPassword);
    }
    public void EnterShowPassword() {
        WebElement checkbox = w.findElement(ShowPasswordCheck);
        checkbox.click();
    }
    public void EnterCreateAnAccountButton() {
        w.findElement(CreateAnAccountbutton).click();
    }

}
