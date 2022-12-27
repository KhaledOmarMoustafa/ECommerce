package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CategoriesPage;
import pages.CurrencyPage;
import pages.HooksPage;

public class CategoriesSteps {
    CategoriesPage categories = new CategoriesPage() ;

    HooksPage hooksPage = new HooksPage();

    @Given("user opens the browser")
    public void open_browser() throws InterruptedException {
   hooksPage.OpenBrowser();
    }
    @When("user clicks on the login button")
    public void login() throws InterruptedException {

        categories.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^Enter the Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        categories.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^Enters the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        categories.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user clicks login button")
    public void click_login() throws InterruptedException {
        categories.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }

    @Then("user click on any sub-category")
    public void category_page(){
        categories.chooseCategory(hooksPage.driver);

    }
    @And("user redirected to the sub category page")
    public void subcategory_page(){
        categories.choosesubCategory(hooksPage.driver);

    }
    @And("user close The browser")
    public void close_browser() throws InterruptedException {


       hooksPage.CloseBrowser();
    }



}
