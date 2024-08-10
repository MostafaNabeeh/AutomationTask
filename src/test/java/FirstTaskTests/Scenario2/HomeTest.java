package FirstTaskTests.Scenario2;

import FirstTaskPages.Scenario2.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void checkDealToday() {
        new HomePage(driver).clickOnDealToday();
    }
}

