package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {
    static WebDriver driver;
    static ElementHelper elementHelper;

    private final By addToBasketButton = By.xpath("//button[@name='add-to-cart']");


    private final By showBasketButton = By.xpath("//div[@class='woocommerce-message']/a[.='Sepeti görüntüle']");

    WebDriverWait wait;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickAddToBasketButton(){

        Assert.assertTrue(elementHelper.find(addToBasketButton).isEnabled(), "addToBasketButton element should be enabled but it is not");
        elementHelper.click(addToBasketButton);
    }
    public void clickShowBasketButton(){
        elementHelper.waitForElement(showBasketButton,10);
        Assert.assertTrue(elementHelper.find(showBasketButton).isEnabled(), "showBasketButton element should be enabled but it is not");
        elementHelper.click(showBasketButton);
    }


}
