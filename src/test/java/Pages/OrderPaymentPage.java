package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class OrderPaymentPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    private final By txtName = By.id("ccname");
    private final By txtCardNumber = By.id("ccnumber");
    private final By txtCardDate = By.id("ccexp");
    private final By txtCardCvv = By.id("cccvc");
    private final By paymentButton = By.cssSelector("#iyz-payment-button > span");;
    private final By txtOrderTake = By.cssSelector(".woocommerce-notice");


    public OrderPaymentPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void fillsRequiredFields(){
        elementHelper.setImplicitWaitTime(20);
        elementHelper.waitForElement(txtName,10);
        elementHelper.type(txtName,"Mevsim Demir");
        elementHelper.waitForElement(txtCardNumber,10);
        elementHelper.type(txtCardNumber,"5311570000000005");
        elementHelper.waitForElement(txtCardDate,10);
        elementHelper.type(txtCardDate,"0827");
        elementHelper.waitForElement(txtCardCvv,10);
        elementHelper.type(txtCardCvv,"375");

    }

    public void clickPaymentButton(){
        elementHelper.waitForElement(paymentButton,10);
        elementHelper.click(paymentButton);
    }

    public void checkOrderTake(){
        elementHelper.setImplicitWaitTime(10);
        elementHelper.waitForElement(txtOrderTake,10);
        Assert.assertEquals(elementHelper.find(txtOrderTake).getText(),"Teşekkür ederiz. Siparişiniz alınmıştır.","The order received text is checked");

    }






}
