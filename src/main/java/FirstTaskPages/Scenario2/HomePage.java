package FirstTaskPages.Scenario2;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By dealTodayBt = By.xpath("//a[text()=\"Today's Deals\"]");
    private By handlePop_Up = By.xpath("(//input[@type='submit'])[2]");

    public DealPage clickOnDealToday() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(driver1 -> driver1.findElement(dealTodayBt)).click();
            wait.until(driver1 -> driver1.findElement(handlePop_Up)).click();
        } catch (Exception e) {
            System.out.println("couldn't find product element" + e);
        }
        return new DealPage(driver);
    }
}





