package FirstTaskTests.Scenario1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class BaseTest {
    public WebDriver driver;

    
    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().setSize(new Dimension(1024, 768));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
