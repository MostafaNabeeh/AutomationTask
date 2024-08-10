package SecondTaskTests;
import SecondTaskPages.BookPage;
import SecondTaskPages.CustomersPage;
import SecondTaskPages.HomePage;
import SecondTaskPages.PassengerPage;
import org.testng.annotations.Test;

public class PassangerTest extends BaseTest {
    @Test
    public void passengerTest() {
        HomePage homePage = new HomePage(driver);
        homePage.SelectTrip("CHIKKAMAGALURU","BENGALURU");

        BookPage bookPage = new BookPage(driver);
        bookPage.BookingSeat();

        CustomersPage customersPage = new CustomersPage(driver);
        customersPage.FillInputs("6789125987","sadFzghxm@gmail.com");

        PassengerPage passengerPage = new PassengerPage(driver);
        passengerPage.Fill("ali","20","012");
    }
}







