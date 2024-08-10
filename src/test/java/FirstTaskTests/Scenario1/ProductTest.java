package FirstTaskTests.Scenario1;
import FirstTaskPages.Scenario1.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;


public class ProductTest extends BaseTest {

    @Test
    public void searchForFirstProcut() {
        Assert.assertTrue(new HomePage(driver)
                .searchForCarAccessory("car accessories")
                .clickOnTheFirstItem()
                .addFirstElementToTheCart()
                .assertThatTheItemISAdded());

    }
}
