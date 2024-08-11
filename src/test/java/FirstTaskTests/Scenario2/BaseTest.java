package FirstTaskTests.Scenario2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


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
