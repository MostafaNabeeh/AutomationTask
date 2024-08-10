package SecondTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomersPage {

    //1-constructor
    WebDriver driver;
    public CustomersPage (WebDriver driver) {
        this.driver = driver;
    }


//    Elements

    private By FillPhone = By.xpath("//input[@name='mobileNo']");
    private By FillMail= By.xpath("//input[@name='email']");
    private By CLickOnCheckOut = By.xpath("//div[text()=\"PROCEED TO passenger detail as\"]");



    public  void FillInputs ( String phone , String mail  ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(driver1 -> driver.findElement(FillPhone)).sendKeys(phone);
            wait.until(driver1 -> driver.findElement(FillMail)).sendKeys(mail);
            wait.until(driver1 -> driver.findElement(CLickOnCheckOut)).click();

        }catch (Exception e){
            System.out.println(" An error happens while locating elements" + e);

        }

    }
}
