package SecondTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PassengerPage {
    WebDriver driver;
    public PassengerPage(WebDriver driver) {
        this.driver = driver;
    }

    private By name = By.xpath("//input[@placeholder=\"Name\"]");
    private By genderBtn = By.xpath("//input[@name=\"paxGender[0]\"]");
    private By genderType= By.xpath("//div[text()=\"Male\"]");
    private By age = By.xpath("//input[@name=\"paxAge[0]\"]");
    private By concession  = By.xpath("//input[@name=\"paxConcessionType[0]\"]");
    private By concessionType = By.xpath("//div[text()=\"GENERAL PUBLIC\"]");
    private By idcart = By.xpath("//input[@name=\"paxIDCardType[0]\"]");
    private By idCarttype = By.xpath("//div[text()=\"PAN\"]");
    private By idNumber = By.xpath("//input[@name=\"paxIDCardNo[0]\"]");
    private By proceedCheckoutBtn = By.xpath("//div[text()=\"proceed to return trip selection\"]");


    public void Fill ( String Name , String Age ,String IdCartNumber ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(driver1 -> driver.findElement(name)).sendKeys(Name);
            wait.until(driver1 -> driver.findElement(genderBtn)).click();
            wait.until(driver1 -> driver.findElement(genderType)).click();
            wait.until(driver1 -> driver.findElement(age)).sendKeys(Age);
            wait.until(driver1 -> driver.findElement(concession)).click();
            wait.until(driver1 -> driver.findElement(concessionType)).click();
            wait.until(driver1 -> driver.findElement(idcart)).click();
            wait.until(driver1 -> driver.findElement(idCarttype)).click();
            wait.until(driver1 -> driver.findElement(idNumber)).sendKeys(IdCartNumber);
            wait.until(driver1 -> driver.findElement(proceedCheckoutBtn)).click();

        }catch (Exception e) {
            System.out.println(" An error happens while locating elements" + e);
        }
    }

}
