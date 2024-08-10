package FirstTaskPages.Scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CarAccesoriesPage {

    private WebDriver driver;

    public CarAccesoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By SelectFirstItem = By.xpath("//div[@data-index=\"4\"]");
    private By assertThatyouEnterTheAccessoriesPage = By.id("a-autoid-1-announce");


    public ProductPage clickOnTheFirstItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(driver1 -> driver1.findElement(SelectFirstItem)).click();
        } catch (Exception e) {
            System.out.println("couldn't find product element" + e);
        }
        return new ProductPage(driver);
    }

    public boolean assertTheAcessoryPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(driver1 -> driver1.findElement(assertThatyouEnterTheAccessoriesPage)).isDisplayed();
    }
}
