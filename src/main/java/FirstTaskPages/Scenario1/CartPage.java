package FirstTaskPages.Scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


    public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    private  By assertThatYouAreInCartPage= By.id("sc-buy-box-ptc-button-announce");

    public boolean assertThatTheItemISAdded (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(driver1 -> driver1.findElement(assertThatYouAreInCartPage)).isDisplayed();
    }

}

