package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage {

    static WebDriver driver;
    static ElementHelper elementHelper;

    WebDriverWait wait;

    private final By product = By.xpath("//h2[.='Serenity Kadın Ayakkabı']");
    private final By controlMain = By.cssSelector(".woocommerce-Price-amount");
    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickProduct(){
        elementHelper.waitForElement(controlMain,10);
        Assert.assertTrue(elementHelper.find(product).isEnabled(), "Product element should be enabled but it is not");
        elementHelper.click(product);

    }
}
