package StepDefinitions;

import Pages.MainPage;
import Pages.ProductPage;
import Util.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ProductPageStepDefinitions {
    WebDriver driver = Driver.getDriver();
    ProductPage productPage = new ProductPage(driver);

    @And("The user clicks on the Add to Basket button")
    public void theUserClicksOnTheAddBasketButton() {
        productPage.clickAddToBasketButton();
    }


    @And("The user clicks on the Show Basket button")
    public void theUserClicksOnTheShowBasketButton() {
        productPage.clickShowBasketButton();
    }



}
