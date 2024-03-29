package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewAndPaymentsPage {
    int i=2;
    WebDriver w;
    public  ReviewAndPaymentsPage(WebDriver W){
        this.w =W;
    }
    By CheckMoneyOrder = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[1]/label");
    By MoneticoOne_TimePaymentMethod = By.xpath("//*[@id=\"monetico_onetime\"]");
    By MoneticoMulti_TimePaymentMethod = By.xpath("//*[@id=\"monetico_multitime\"]");
    By MoneticoCofidis_1EURO_PaymentMethod= By.xpath("//*[@id=\"monetico_1euro\"]");
    By MoneticoCofidis3XCBPaymentMethod= By.xpath("//*[@id=\"monetico_3xcb\"]");
    By MoneticoCofidis4XCBPaymentMethod= By.xpath("//*[@id=\"monetico_4xcb\"]");
    By Monetico_PAYPAL_Payment_Method = By.xpath("//*[@id=\"monetico_paypal\"]");

    public void RadioButtonSelected(int index) {
        if(index==0)
        {
            i=2;
            w.findElement(CheckMoneyOrder).click();
        }
        else if(index==1){
            i=3;
            w.findElement(MoneticoOne_TimePaymentMethod).click();
        }
        else if(index==2){
            i=4;
            w.findElement(MoneticoMulti_TimePaymentMethod).click();
        }
        else if(index==3){
            i=5;
            w.findElement(MoneticoCofidis_1EURO_PaymentMethod).click();
        }else if (index==4){
            i=6;
            w.findElement(MoneticoCofidis3XCBPaymentMethod).click();
        }
        else if (index==5){
            i=7;
            w.findElement(MoneticoCofidis4XCBPaymentMethod).click();
        }else if (index==6){
            i=8;
            w.findElement(Monetico_PAYPAL_Payment_Method).click();
        }
    }
    public void PlaceOrderButton() {
       w.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div["+i+"]/div[2]/div[4]/div/button")).click();
    }
}
