package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class pageHelper {

    public static WebDriver webdriver;

    public final String Url = "https://practice.automationtesting.in/";
    public By shopOption = By.linkText("Shop");
    public By homeOption = By.xpath("//a[contains(text(),'Home')]");
    public By bookNumber3 = By.xpath("//h3[text()='Mastering JavaScript']");
    public By AddToCartBtN = By.xpath("//button[text()='Add to basket']");
    public By viewBasket = By.xpath("//div//a[text()='View Basket']");
    public By checkOutBTN = By.xpath("//div//a[contains(text(),'Proceed to Checkout')]");
    public By firstName = By.id("billing_first_name");
    public By lastName = By.id("billing_last_name");
    public By email = By.id("billing_email");
    public By phone = By.id("billing_phone");

    public By address = By.id("billing_address_1");
    public By city = By.id("billing_city");
    public By postalCode = By.id("billing_postcode");
    public By paymentOptCOD = By.id("payment_method_cod");
    public By paymentOptCheque = By.id("payment_method_cheque");
    public By paymentOptPayPal = By.id("payment_method_ppec_paypal");
    public By orderBth = By.xpath("//div[contains(@class,'form-row place-order')]//input[@type='submit']");
    public static final Duration EXPLICITWAIT = Duration.ofSeconds(20);
    public static final Duration timeout = Duration.ofSeconds(2);

    public void browserHelper() {
        ChromeOptions chromeooptions = new ChromeOptions();
        chromeooptions.addArguments("--remote-allow-origins=*");
        webdriver = new ChromeDriver(chromeooptions);
        webdriver.manage().window().maximize();
     //   webdriver.manage().timeouts().implicitlyWait(pageHelper.EXPLICITWAIT);
    }
    public void scrillIntoView(){
        JavascriptExecutor js = (JavascriptExecutor) webdriver;
        ((JavascriptExecutor) webdriver).executeScript("return arguments[0].scrollIntoView();", bookNumber3);
    }

}
