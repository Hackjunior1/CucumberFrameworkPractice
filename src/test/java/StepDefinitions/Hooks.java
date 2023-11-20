package StepDefinitions;

import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static Helper.pageHelper.webdriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @AfterStep
    public void addScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
        System.out.println("screen shot created");
    }
}