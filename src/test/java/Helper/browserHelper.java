package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserHelper {
    pageHelper pagehelper = new pageHelper();
    WebDriver webdriver;

    public WebDriver launchBrowser() {
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        return webdriver;
    }

    public void quithteBrowser() {
        webdriver.quit();
    }

    public void urlsearch() {
        launchBrowser().get(pagehelper.Url);
    }

    public void clickOnShopMenu() {
        launchBrowser().findElement(pagehelper.shopOption).click();
        launchBrowser().navigate().refresh();
        launchBrowser().findElement(pagehelper.shopOption).click();
    }

    public void clickOnHomeMenu() {
        launchBrowser().findElement(pagehelper.homeOption).click();
    }

    public void bookselection() {
        launchBrowser().findElement(pagehelper.bookNumber3).click();
    }

    public void addToBasket() {
        launchBrowser().findElement(pagehelper.bookNumber3).click();
    }
}
