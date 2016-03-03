package cucumber.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pageobject.HomePage;
import cucumber.pageobject.MobilePage;
import org.testng.Assert;

/**
 * Created by tcbinh on 3/3/2016.
 */
public class AutomationStepDefs {
    private HomePage homePage;
    private MobilePage mobilePage;
    @Before
    public void setUp()
    {
        homePage = new HomePage();
    }

    @Given("^the user is on homepage")
    public void the_user_is_on_homepage()
    {
        homePage.get();
    }
    @Then("^make sure the title of the page is \"([^\"]*)\"")
    public void validate_the_title_of_the_page(String pageTitle)
    {
        Assert.assertEquals(homePage.getPageValidateTitle().getText().trim(), pageTitle);
    }

    @Given("^the user is on Mobile List page$")
    public void the_user_is_on_Mobile_List_page()
    {
        homePage.clickMobileNav();
    }

    @When("^the title of the page is \"([^\"]*)\"$")
    public void the_title_of_the_page_is(String mobileTitle) {
        mobilePage = new MobilePage();
        Assert.assertEquals(mobilePage.getCategoryTitle().getText(), mobileTitle);
    }

    @When("^the user select Sort by dropdown list as \"([^\"]*)\"$")
    public void the_user_select_Sort_by_dropdown_list_as(String condition)
    {
        mobilePage.selectSortBy(condition);
    }

    @Then("^make sure all products are sorted by \"([^\"]*)\"$")
    public void make_sure_all_products_are_sorted_by(String condition){

    }
}
