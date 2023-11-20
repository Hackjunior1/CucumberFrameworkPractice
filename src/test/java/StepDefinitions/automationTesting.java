package StepDefinitions;

import Helper.browserHelper;
import Helper.pageHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static Helper.pageHelper.webdriver;

public class automationTesting {
    pageHelper pagehelper =new pageHelper();
    @When("user opens the browser")
    public void openTheBrowser() {
        System.out.println("inside open browser method");
        pagehelper.browserHelper();
     //   pagehelper.webdriver.get(pagehelper.Url);
    }
    @Then("user Enter the URL in search bar")
    public void urlSeach() {
        System.out.println("inside search url method");
        webdriver.get(pagehelper.Url);
    }
    @Then("user Click on Shop Menu")
    public void clcikOnShopMenu() {
        System.out.println("inside clcikOnShopMenu methiod");
        webdriver.findElement(pagehelper.shopOption).click();
        webdriver.navigate().refresh();
        webdriver.findElement(pagehelper.shopOption).click();
    }
    @Then("Now user click on Home menu button")
    public void clickHomeMenu() {
        System.out.println("inside clickHomeMenu");
      //  pagehelper.scrillIntoView();
        webdriver.findElement(pagehelper.homeOption).click();
    }
    @Then("user click on the image in the Arrivals")
    public void bookSelectionToBuy() {
        System.out.println("inside bookSelectionToBuy");
       // pagehelper.scrillIntoView();
        webdriver.findElement(pagehelper.bookNumber3).click();
    }
    @Then("uesr Click on the Add To Basket button which adds that book to user basket")
    public void addToBasket() {
        System.out.println("inside addToBasket");
        webdriver.findElement(pagehelper.AddToCartBtN).click();
    }
    @And("click on viewDetails to verify the Item details and Prices")
    public void viewBasketDetails() {
        System.out.println("inside proceedToCheckoutPage");
        webdriver.findElement(pagehelper.viewBasket).click();
    }
    @Then("user click on Proceed to Check out button which navigates to payment gateway page.")
    public void proceedToCheckoutPage() {
        System.out.println("inside proceedToCheckoutPage");
        webdriver.findElement(pagehelper.checkOutBTN).click();
    }
    @Then("user can fill the details in billing page")
    public void povideDeliveryDetails() {
        System.out.println("inside povideDeliveryDetails");
        webdriver.findElement(pagehelper.firstName).sendKeys("suresh");
        webdriver.findElement(pagehelper.lastName).sendKeys("patibandla");
        webdriver.findElement(pagehelper.email).sendKeys("seleniumuser@gmail.com");
        webdriver.findElement(pagehelper.phone).sendKeys("7729922779");
        WebElement countryList = webdriver.findElement(By.id("billing_country"));
        Select selectCountry = new Select(countryList);
        selectCountry.selectByVisibleText("India");
        webdriver.findElement(pagehelper.address).sendKeys("Perangudi");
        webdriver.findElement(pagehelper.city).sendKeys("chennai");
        webdriver.findElement(pagehelper.postalCode).sendKeys("600091");
    }
    @Then("user selects the payment option as {string}")
    public void placeTheOrder(String paymentOption) {
        System.out.println("inside placeTheOrder");
        if(paymentOption.equalsIgnoreCase("Direct bank")){
            webdriver.findElement(pagehelper.paymentOptCheque).click();
        }
        else if(paymentOption.equalsIgnoreCase("cash")){
            webdriver.findElement(pagehelper.paymentOptCOD).click();
        }
        else
            webdriver.findElement(pagehelper.paymentOptPayPal).click();
    }
}
