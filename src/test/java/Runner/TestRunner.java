package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

import static Helper.pageHelper.webdriver;


@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"},
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void afterSuitcomplete() {
        webdriver.quit();
    }

}