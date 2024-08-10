package SecondTaskTests;

import SecondTaskPages.BookPage;
import SecondTaskPages.HomePage;
import org.testng.annotations.Test;

public class BookTest extends BaseTest {

    @Test
    public void BookingTest (){
        HomePage homePage = new HomePage(driver);
        homePage.SelectTrip("CHIKKAMAGALURU","BENGALURU");

        BookPage bookPage = new BookPage(driver);
        bookPage.BookingSeat();
    }


}
