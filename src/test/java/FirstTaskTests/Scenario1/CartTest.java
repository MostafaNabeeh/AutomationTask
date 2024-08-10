package FirstTaskTests.Scenario1;
import FirstTaskPages.Scenario1.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CartTest extends BaseTest{

    @Test
    public void endToEndTest() {
        Assert.assertTrue(new HomePage(driver).
                searchForCarAccessory("car accessories")
                .clickOnTheFirstItem()
                .addFirstElementToTheCart()
                .assertThatTheItemISAdded());

    }
}
