package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by tcbinh on 3/3/2016.
 */
@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-report.json"})
public class CukeRunner extends AbstractTestNGCucumberTests{

    @BeforeSuite
    public void initDriver()
    {
        DriverFactory.instantiateDriverObject();
    }

    @AfterMethod
    public void clearAllCookies()
    {
        DriverFactory.clearCookies();
    }

    @AfterSuite
    public void closeDriverObject()
    {
        DriverFactory.closeDriverObject();
    }
}
