package com.selenium.cucumber.pageobject;

import com.selenium.cucumber.factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tcbinh on 3/1/2016.
 */
public class HomePage {
    @FindBy(css = "ol.nav-primary li.level0.first")
    private WebElement mobileNav;

    @FindBy(css = "ol.nav-primary li.level0.last")
    private WebElement tvNav;

    public HomePage()
    {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public WebElement getMobileNav()
    {
        return mobileNav;
    }

    public WebElement getTvNav()
    {
        return tvNav;
    }

    public HomePage clickMobileNav()
    {
        mobileNav.click();
        return this;
    }

    public HomePage clickTVNav()
    {
        tvNav.click();
        return this;
    }


}
