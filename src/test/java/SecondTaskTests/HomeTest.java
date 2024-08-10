package SecondTaskTests;
import SecondTaskPages.HomePage;
import org.testng.annotations.Test;
public class HomeTest extends BaseTest{

    @Test
    public void testSelectCity (){
        HomePage homePage = new HomePage(driver);
        homePage.SelectTrip("CHIKKAMAGALURU","BENGALURU");
    }

}
