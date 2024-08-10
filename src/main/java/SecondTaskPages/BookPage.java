package SecondTaskPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class BookPage {
    //1-constructor
    WebDriver driver;
    public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    //2-Elements
    private By BookingSeatNumber = By.xpath("(//div[text()='Select Seats'])[10]");
    private By SelectBoardingPoint = By.xpath("//div[text()='Select Boarding Point']");
    private By SelectDroppingPoint = By.xpath("//div[text()='Select Dropping Point']");

    private By FillBoradingPoint = By.xpath("(//div[@class=\"point-opt active\"]//child::div)[1]");
    private By FillDroppingPoint  = By.xpath("(//div[@class=\"point-opt active\"]//child::div)[1]");

    private By SelectedDate = By.xpath("(//div[text()='13'])[1]");
    private By Deatails = By.xpath("//div[@class=\"btnPassDetails\"]");

    public void BookingSeat (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(driver1 -> driver.findElement(BookingSeatNumber)).click();
          wait.until(driver1 -> driver.findElement(SelectBoardingPoint)).click();

            wait.until(driver1 -> driver.findElement(FillBoradingPoint)).click();

            wait.until(driver1 -> driver.findElement(SelectDroppingPoint)).click();
            wait.until(driver1 -> driver.findElement(FillDroppingPoint)).click();

            wait.until(driver1 -> driver.findElement(SelectedDate)).click();
            wait.until(driver1 -> driver.findElement(Deatails)).click();
        } catch (Exception e) {
            System.out.println(" An error happens while locating elements" + e);
        }
    }
}
