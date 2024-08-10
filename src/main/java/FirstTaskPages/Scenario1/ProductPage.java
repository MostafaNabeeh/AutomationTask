package FirstTaskPages.Scenario1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProductPage {

    private WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addItemToCartBTN = By.id("add-to-cart-button");
    private By clickGoTOCartPage = By.xpath("//a[@id='nav-cart']");
    private By assertItemIsAdded = By.xpath("//h1[contains(text(),\"About this item\")]");



    public CartPage addFirstElementToTheCart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            wait.until(driver1 -> driver1.findElement(addItemToCartBTN)).click();
            wait.until(driver1 -> driver1.findElement(clickGoTOCartPage)).click();
        } catch (Exception e) {
            System.out.println("couldn't find product element" + e);
        }
        return new CartPage(driver);
    }

    public boolean assertThatTheItemISAdded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(driver1 -> driver1.findElement(assertItemIsAdded)).isDisplayed();
    }
}



