package SecondTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPAge {

    WebDriver driver;
    public PaymentPAge(WebDriver driver) {
        this.driver = driver;
    }


    // Elements
    private By clickOnProccedTopay = By.xpath("//div[text()='PROCEED TO PAY']");
    private By paymentPopup  = By.xpath("//div[text()='AGREE']");

    public void Payment (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(driver1 -> driver.findElement(clickOnProccedTopay)).click();
            wait.until(driver1 -> driver.findElement(paymentPopup)).click();
        }catch (Exception e) {
            System.out.println(" An error happens while locating elements" + e);
        }
    }

}
