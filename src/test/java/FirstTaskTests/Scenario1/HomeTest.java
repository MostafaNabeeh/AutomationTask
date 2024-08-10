package FirstTaskTests.Scenario1;
import FirstTaskPages.Scenario1.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;


public class HomeTest extends BaseTest{
    @Test
    public void searchForItem() {
        Assert.assertTrue(new HomePage(driver).assertTheHomePage());
    }
}

