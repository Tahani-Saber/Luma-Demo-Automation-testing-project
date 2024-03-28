package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver w;
    public  HomePage(WebDriver W){
        this.w =W;
    }
    //Search buttons
    By SearchField = By.xpath("//*[@id=\"search\"]");
    By SearchIcon = By.xpath("//*[@title=\"Search\"]");
    By SelectItem = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]");
    By SortByDropDown = By.xpath("//*[@id=\"sorter\"]");
    By HomeButton=By.xpath("//*[@href=\"https://demo-m2.bird.eu/home\"]");
    //HomepageButtons
    By SignIn=By.xpath("//*[@id=\"html-body\"]/div[6]/header/div[1]/div/ul/li[2]/a");
    By CreateAnAccount=By.xpath("//*[@href=\"https://demo-m2.bird.eu/customer/account/create/\"]");
    //By HomeButton=By.xpath("//*[@id=\\\"html-body\\\"]/div[6]/header/div[2]/a");


    //homepage
    public void PressSignIn() {
        w.findElement(SignIn).click();
    }
    public void PressCreateAnAccount() {
        w.findElement(CreateAnAccount).click();
    }

    public void PressHome() {
        w.findElement(HomeButton).click();
    }
    //Search
    public void EnterSearchField(String Search) {
        w.findElement(SearchField).sendKeys(Search);
    }
    public void EnterSearchIcon() {
        w.findElement(SearchIcon).click();
    }
    public void EnterSelectItem() {
        w.findElement(SelectItem).click();
    }
    public void SortItems(int i){
        WebElement Sortby= w.findElement(SortByDropDown);
        Select DropDown = new Select(Sortby);
        DropDown.selectByIndex(i);
    }
}
