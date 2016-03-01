package com.selenium.cucumber.factory;

import com.selenium.cucumber.config.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by tcbinh on 3/1/2016.
 */
public class WebDriverThread {
    private WebDriver driver;
    private DriverType selectedDriverType;
    private final DriverType defaultDriverType = DriverType.FIREFOX;
    private final String browser = System.getProperty("browser");

    public WebDriver getDriver()
    {
        if (null == driver)
        {
            selectedDriverType = determineEffectiveDriverType();
            DesiredCapabilities desiredCapabilities = selectedDriverType.getDesiredCapabilities();
            instantiateWebDriver(desiredCapabilities);
        }
        return driver;
    }

    public void quitDriver()
    {
        if (null != driver)
        {
            driver.quit();
            driver = null;
        }
    }

    private void instantiateWebDriver(DesiredCapabilities desiredCapabilities)
    {
        driver = selectedDriverType.getWebDriverObject(desiredCapabilities);
    }

    private DriverType determineEffectiveDriverType() {
        DriverType driverType = defaultDriverType;
        try
        {
            driverType = DriverType.valueOf(browser);
        } catch (IllegalArgumentException ignored) {
            System.err.println("Unknown driver specified, defaulting to '" + driverType + "'...");
        } catch (NullPointerException ignored) {
            System.err.println("No driver specified, defaulting to '" + driverType + "'...");
        }
        return driverType;
    }

}
