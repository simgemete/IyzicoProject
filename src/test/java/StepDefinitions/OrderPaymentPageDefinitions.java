package StepDefinitions;

import Pages.MainPage;
import Pages.OrderPaymentPage;
import Util.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class OrderPaymentPageDefinitions {
    WebDriver driver = Driver.getDriver();
    OrderPaymentPage orderPaymentPage = new OrderPaymentPage(driver);

    @And("The user fills in the required fields with random values")
    public void theUserFillsInTheRequiredFieldsWithRandomValues() {
        orderPaymentPage.fillsRequiredFields();
    }


    @And("The user clicks on the Pay button")
    public void theUserClicksOnThePayButton() {
        orderPaymentPage.clickPaymentButton();
    }

    @Then("The user verifies the Siparis Alındı text")
    public void theUserVerifiesTheSiparisAlindiText() {
        orderPaymentPage.checkOrderTake();
    }
}
