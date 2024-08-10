package SecondTaskPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    //1-constructor
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    //2-Elements
    private By departureBTN = By.xpath("//span[contains(text(),'Select Departure City')]");
    private By searchDepturCity = By.xpath("(//*[@placeholder= 'Search Your City Name'])[1]");

    private By destinationBTN = By.xpath("//span[contains(text(),'Select Destination City')]");
    private By searchdestinationrCity = By.xpath("(//*[@placeholder= 'Search Your City Name'])[2]");

    private By Calender = By.id("imgDepartDate");
    private By SelectDay = By.xpath("//a[text()='6']//parent::td");
    private By SerchBtn =By.id("submitSearch");


    //3-Method
    public void SelectTrip (String DepartureCity, String DestinationCity) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Thread.sleep(5000);
            wait.until(driver1 -> driver.findElement(departureBTN)).click();
            wait.until(driver1 -> driver.findElement(searchDepturCity)).sendKeys(DepartureCity+Keys.ENTER);

          wait.until(driver1 -> driver.findElement(destinationBTN)).click();
          wait.until(driver1 -> driver.findElement(searchdestinationrCity)).sendKeys(DestinationCity+Keys.ENTER);

          wait.until(driver1 -> driver.findElement(Calender)).click();

            Thread.sleep(2000);
//          Actions actions = new Actions(driver);
//          actions.click(driver.findElement(SelectDay));

          wait.until(driver1 -> driver.findElement(SelectDay)).click();
            wait.until(driver1 -> driver.findElement(SelectDay)).click();
            wait.until(driver1 -> driver.findElement(SelectDay)).click();

            wait.until(driver1 -> driver.findElement(SerchBtn)).click();

        }catch (Exception e) {
            System.out.println(" An error happens while locating elements" + e);
        }
    }





}
