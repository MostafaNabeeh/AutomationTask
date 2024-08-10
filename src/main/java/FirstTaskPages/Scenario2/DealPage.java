package FirstTaskPages.Scenario2;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DealPage {
    private WebDriver driver;
    public DealPage(WebDriver driver) {
        this.driver = driver;
    }

    private By assertDealPage = By.xpath("//h1[contains(text(), \"Today's Deals\")]");
    private By seeMoreBTN = By.xpath("//a[@class='a-size-base a-link-normal']");
    private By groceryDeal = By.xpath("(//span[contains(text (),\"Grocery & Gourmet Food\")]");
    private By discount = By.xpath("//span[contains(text (),\"10% off or more\")]");
    private By handlePop_Up = By.xpath("(//input[@type='submit'])[2]");


    public void clickOnProductAndDiscount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {

            wait.until(driver1 -> driver1.findElement(handlePop_Up)).click();
            wait.until(driver1 -> driver1.findElement(seeMoreBTN)).click();
            wait.until(driver1 -> driver1.findElement(groceryDeal)).click();
            wait.until(driver1 -> driver1.findElement(discount)).click();
        } catch (Exception e) {
            System.out.println("couldn't find  element" + e);
        }
    }

    public boolean assertThatYouAreinDealPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(driver1 -> driver1.findElement(assertDealPage)).isDisplayed();
    }
}
