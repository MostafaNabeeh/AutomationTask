package FirstTaskPages.Scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchBtn = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
    private By sumbitSearch = By.xpath("//input[@id=\"nav-search-submit-button\"]");



    public CarAccesoriesPage searchForCarAccessory(String item) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(driver1 -> driver1.findElement(searchBtn)).sendKeys(item);
            wait.until(driver1 -> driver1.findElement(sumbitSearch)).click();
        } catch (Exception e) {
            System.out.println("couldn't find product element" + e);
        }
        return new CarAccesoriesPage(driver);
    }

    public boolean assertTheHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(driver1 -> driver1.findElement(searchBtn)).isDisplayed();
    }

}
