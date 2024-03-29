package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {
    WebDriver w;
    public  ShippingPage(WebDriver W){
        this.w =W;
    }

    //fields
    By CompanyField = By.xpath("//*[@name=\"company\"]");
    By StreetAddressField = By.xpath("//*[@name=\"street[0]\"]");
    public By CountryField = By.xpath("//*[@name=\"country_id\"]");
    By StateAndProvinceField = By.xpath("//*[@name=\"region_id\"]");
    By CityField = By.xpath("//*[@name=\"city\"]");
    By ZipPostalCodeField = By.xpath("//*[@name=\"postcode\"]");
    By PhoneNumberField = By.xpath("//*[@name=\"telephone\"]");
    By FreeShippingCheck = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input");
    By FlatRateCheck = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input");
    By FixedCheck = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[3]/td[1]/input");
    By NextButton = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
    By ProceedToCheckoutButton= By.xpath("//*[@data-role=\"proceed-to-checkout\"]");

    //Functions
    public void EnterCompany(String Company) {
        w.findElement(CompanyField).clear();
        w.findElement(CompanyField).sendKeys(Company);
    }
    public void EnterStreetAddress(String StreetAddress) {
        w.findElement(StreetAddressField).clear();
        w.findElement(StreetAddressField).sendKeys(StreetAddress);
    }
    public void EnterCountry(String NameOfState,int state,int country) {
        WebElement SortbyCountry = w.findElement(CountryField);
        Select DropDownCountry = new Select(SortbyCountry);
        DropDownCountry.selectByIndex((country));
        if(state==0) {
            WebElement SortbyState = w.findElement(StateAndProvinceField);
            Select DropDownState = new Select(SortbyState);
            DropDownState.selectByIndex(Integer.parseInt(NameOfState));
        }else
        {
            w.findElement(StateAndProvinceField).sendKeys(NameOfState);
        }
    }
    public void ProceedToCheckout () {
        w.findElement(ProceedToCheckoutButton).click();
    }
    public void EnterCity(String City) {
        w.findElement(CityField).clear();
        w.findElement(CityField).sendKeys(City);
    }
    public void EnterZipPostalCode(Integer Zip) {
        w.findElement(ZipPostalCodeField).clear();
        w.findElement(ZipPostalCodeField).sendKeys(Integer.toString(Zip));
    }
    public void EnterPhoneNumber(int num) {
        w.findElement(PhoneNumberField).clear();
        w.findElement(PhoneNumberField).sendKeys(Integer.toString(num));
    }
    public void RadioButtonShipping(int index) {
        if(index==0)
        {
            w.findElement(FreeShippingCheck).click();
        }
        else if(index==1){
            w.findElement(FlatRateCheck).click();
        }
        else if(index==2){
            w.findElement(FixedCheck).click();
        }
    }
    public void EnterNext() {
        w.findElement(NextButton).click();
    }
}
