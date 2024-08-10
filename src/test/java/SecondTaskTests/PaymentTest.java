package SecondTaskTests;

import SecondTaskPages.*;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @Test
    public void paymentTest() {
        HomePage homePage = new HomePage(driver);
        homePage.SelectTrip("CHIKKAMAGALURU","BENGALURU");

        BookPage bookPage = new BookPage(driver);
        bookPage.BookingSeat();

        CustomersPage customersPage = new CustomersPage(driver);
        customersPage.FillInputs("6789125987","sadFzghxm@gmail.com");

        PassengerPage passengerPage = new PassengerPage(driver);
        passengerPage.Fill("ali","20","012");

        PaymentPAge paymentPAge = new PaymentPAge(driver);
        paymentPAge.Payment();



    }




}
