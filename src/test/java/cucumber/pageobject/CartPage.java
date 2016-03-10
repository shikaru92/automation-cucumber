package cucumber.pageobject;

import cucumber.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;
import java.util.*;

/**
 * Created by tcbinh on 3/8/2016.
 */
public class CartPage {
    @FindBy(css = ".product-name>a[href*='sony-xperia']")
    private WebElement sonyXperiaInCart;

    public void abc()
    {
        List<WebElement> aa = DriverFactory.getDriver().findElements(By.name("aa"));
    }
}
