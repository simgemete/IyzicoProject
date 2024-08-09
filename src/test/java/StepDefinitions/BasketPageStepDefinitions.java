package StepDefinitions;

import Pages.BasketPage;
import Pages.ProductPage;
import Util.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class BasketPageStepDefinitions {
    WebDriver driver = Driver.getDriver();
    BasketPage basketPage = new BasketPage(driver);

    @And("The user clicks on the Go to Payment Page button")
    public void theUserClicksOnTheGoToPaymentPageButton() {
        basketPage.clickGoPaymentButton();
    }

}
