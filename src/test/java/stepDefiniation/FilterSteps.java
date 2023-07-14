package stepDefiniation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FilterPage;
import pages.HooksPage;

public class FilterSteps {
    FilterPage filter = new FilterPage() ;

  HooksPage hooksPage = new HooksPage();
    @Given("open the browser")
    public void open_browser() throws InterruptedException {

        hooksPage.OpenBrowser();
    }
    @When("click on the login button")
    public void login() throws InterruptedException {

        filter.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        filter.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        filter.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("click login button")
    public void click_login() throws InterruptedException {
        filter.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }

    @And("user choose category")
    public void category_page(){
        filter.chooseCategory(hooksPage.driver);

    }
    @And("user choose a sub category")
    public void subcategory_page(){
        filter.choosesubCategory(hooksPage.driver);

    }
    @And("user Choose a color")
    public void subcategoryColor_page(){
        filter.choosesubColor(hooksPage.driver);

    }
    @Then("page is filtered by color")
    public void filtered_color() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15", hooksPage.driver.getCurrentUrl());
        Thread.sleep(2000);

    }
    @And("user close the Browser")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }



}
