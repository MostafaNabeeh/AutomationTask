package FirstTaskTests.Scenario2;
import FirstTaskPages.Scenario2.HomePage;
import org.testng.annotations.Test;

public class DealTest extends BaseTest {
    @Test
    public void testGroceyAndDiscont() {
        new HomePage(driver).clickOnDealToday().clickOnProductAndDiscount();
    }
}
