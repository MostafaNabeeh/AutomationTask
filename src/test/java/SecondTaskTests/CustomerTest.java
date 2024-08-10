package SecondTaskTests;

import SecondTaskPages.BookPage;
import SecondTaskPages.CustomersPage;
import SecondTaskPages.HomePage;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {
    @Test
    public void CustomerTest() {
        HomePage homePage = new HomePage(driver);
        homePage.SelectTrip("CHIKKAMAGALURU","BENGALURU");

        BookPage bookPage = new BookPage(driver);
        bookPage.BookingSeat();

        CustomersPage customersPage = new CustomersPage(driver);
        customersPage.FillInputs("6789125987","sadFzghxm@gmail.com");
    }


}
