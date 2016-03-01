package com.selenium.cucumber.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by tcbinh on 3/1/2016.
 */
public class ChromeSetup {
    private static String CHROME_DRIVER = "/chromedriver.exe";

    private WebDriver driver = setupChromeDriver();

    public WebDriver driver()
    {
        return driver;
    }

    public void close()
    {
        driver.quit();
    }

    private WebDriver setupChromeDriver()
    {
        String localFile = ChromeSetup.class.getResource(CHROME_DRIVER).getFile();
        System.setProperty("webdriver.chrome.driver", localFile);
        return driver = new ChromeDriver();
    }
}
