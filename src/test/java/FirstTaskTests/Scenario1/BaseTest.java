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
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}