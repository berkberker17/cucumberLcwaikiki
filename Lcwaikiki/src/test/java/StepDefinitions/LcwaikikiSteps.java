package StepDefinitions;

import Pages.LcwaikikiPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LcwaikikiSteps {

        WebDriver driver = DriverFactory.getDriver();
        LcwaikikiPages lcwaikikiPages = new LcwaikikiPages(driver);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        LcwaikikiPages.Homepage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        LcwaikikiPages.AcceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        LcwaikikiPages.clickSearchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        LcwaikikiPages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        LcwaikikiPages.searchButton();
    }

    @When("Filter for erkek pantolon")
    public void filterForErkekPantolon() {
        LcwaikikiPages.filterErkekPantolon();
    }

    @When("click the first product")
    public void clickTheFirstProduct() {
        LcwaikikiPages.firtsProduct();
    }

    @When("Add to Cart")
    public void addToCart() {
        LcwaikikiPages.addCart();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        LcwaikikiPages.checkCartPage();
    }

    @When("clean the sepet")
    public void cleanTheSepet() {
        LcwaikikiPages.cleanTheSepet();
    }
}
