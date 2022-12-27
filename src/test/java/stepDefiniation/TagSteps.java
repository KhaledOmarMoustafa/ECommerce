package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HooksPage;
import pages.TagsPage;

public class TagSteps {
    TagsPage tags = new TagsPage() ;

   HooksPage hooksPage = new HooksPage();

    @Given("opens the browser")
    public void open_browser() throws InterruptedException {
        hooksPage.OpenBrowser();
    }
    @When("clicks on the login button")
    public void login() throws InterruptedException {

        tags.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^user Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        tags.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^user Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        tags.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user clicks on login button")
    public void click_login() throws InterruptedException {
        tags.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }

    @And("user chooses category")
    public void category_page(){
        tags.chooseCategory(hooksPage.driver);

    }
    @And("user chooses a sub category")
    public void subcategory_page(){
        tags.choosesubCategory(hooksPage.driver);

    }
    @And("user Chooses a tag")
    public void subcategoryColor_page(){
        tags.choosesubTag(hooksPage.driver);

    }
    @Then("page is filtered by Tag")
    public void filtered_color() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/game", hooksPage.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("User Close the browser")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }



}
