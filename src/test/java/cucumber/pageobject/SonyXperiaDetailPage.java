package cucumber.pageobject;

import cucumber.factory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tcbinh on 3/4/2016.
 */
public class SonyXperiaDetailPage {
    @FindBy(css = ".product-name>span[class='h1']")
    private WebElement productNameTitle;

    @FindBy(css = ".regular-price .price")
    private WebElement productPrice;

    public SonyXperiaDetailPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public WebElement getProductNameTitle() {
        return productNameTitle;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }
}
