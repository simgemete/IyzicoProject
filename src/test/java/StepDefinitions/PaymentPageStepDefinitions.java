package StepDefinitions;

import Pages.PaymentPage;
import Util.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class PaymentPageStepDefinitions {
    WebDriver driver = Driver.getDriver();
    PaymentPage paymentPage = new PaymentPage(driver);


    @And("The user selects the Debit or Credit Card option")
    public void theUserSelectsTheDebitOrCreditCardOption() {
        paymentPage.clickRadioDebitCreditCard();
    }

    @And("The user clicks on the Pay with Debit or Credit Card button")
    public void theUserClicksOnThePayWithDebitOrCreditCardButton() {
        paymentPage.clickDebitCreditCardBtn();
    }
}
