package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PaymentPage {

    static WebDriver driver;
    static ElementHelper elementHelper;

    WebDriverWait wait;

    private final By debitCreditCardRadioBtn = By.id("payment_method_iyzico");
    private final By debitCreditCardBtn = By.id("place_order");
    private final By txtTotal = By.xpath("//th[.='Toplam']");


    public PaymentPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickRadioDebitCreditCard(){
        elementHelper.waitForElement(txtTotal,10);
        elementHelper.scrollToElement(txtTotal);
        elementHelper.click(debitCreditCardRadioBtn);

    }
    public void clickDebitCreditCardBtn(){
        elementHelper.waitForElement(debitCreditCardBtn,10);
          elementHelper.click(debitCreditCardBtn);
    }
}
