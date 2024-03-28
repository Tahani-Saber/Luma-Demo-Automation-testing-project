package C1_BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Getdriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            EdgeOptions options= new EdgeOptions();
            options.addArguments("inprivate");
            driver = new EdgeDriver();
            driver.get("https://demo-m2.bird.eu/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

