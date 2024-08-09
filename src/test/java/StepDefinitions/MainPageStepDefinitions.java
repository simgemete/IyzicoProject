package StepDefinitions;

import Pages.MainPage;
import Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MainPageStepDefinitions {
    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage(driver);

    @Given("The user opens the URL")
    public void theUserOpensTheURL() {
    }

    @When("The user clicks on the second product")
    public void theUserClicksOnTheSecondProduct() {
        mainPage.clickProduct();
    }
}
