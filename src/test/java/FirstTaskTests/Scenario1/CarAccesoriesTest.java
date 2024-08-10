package FirstTaskTests.Scenario1;
import FirstTaskPages.Scenario1.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CarAccesoriesTest extends BaseTest{
    @Test
    public void selectFirstCArItem (){
        Assert.assertTrue(new HomePage(driver)
                .searchForCarAccessory("car accessories")
                .assertTheAcessoryPage());
    }

}
