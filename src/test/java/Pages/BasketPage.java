package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasketPage {
    static WebDriver driver;
    static ElementHelper elementHelper;

    WebDriverWait wait;

    private final By goPaymentPageButton = By.cssSelector(".checkout-button");
    private final By txtBasket= By.cssSelector(".page-title");


    public BasketPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickGoPaymentButton(){
        elementHelper.waitForElement(txtBasket,10);
        Assert.assertTrue(elementHelper.find(txtBasket).isEnabled(),"txtBasket element should be enabled but it is not");
        elementHelper.click(goPaymentPageButton);
    }



}
