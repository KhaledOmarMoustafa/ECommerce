package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HooksPage;
import pages.LoginPage;
import pages.SearchPage;

public class SearchSteps {
    SearchPage search = new SearchPage();
    HooksPage hooksPage = new HooksPage();


    @Given("user open the browser")
    public void open_browser() throws InterruptedException {
    hooksPage.OpenBrowser();
    }
    @When("user click on the login button")
    public void login() throws InterruptedException {

        search.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^user Enters the Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        search.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^user Enters the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        search.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user click login button")
    public void click_login() throws InterruptedException {
        search.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }
    @And("redirected to the home page")
    public void home_page() throws InterruptedException {
        String url = hooksPage.driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/",url);
        System.out.println(url);
        Thread.sleep(1000);

    }@And("user click on search")
    public void click_search() throws InterruptedException {
        search.searchEle(hooksPage.driver);
        Thread.sleep(1000);
    }@And("^user enter his search\"(.*)\"$")
    public void enter_search(String search1) throws InterruptedException {
        search.searchPage(hooksPage.driver, search1);
        Thread.sleep(1000);
    }
        @And("user click on search Button")
        public void search_btn (){
            search.searchButton(hooksPage.driver);
        }

    @Then("user is redirected to what he searched for")
    public void search_page() throws InterruptedException {
        String url = hooksPage.driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/search?q=HTC+One+M8+Android+L+5.0+Lollipop",url);
        System.out.println(url);
        Thread.sleep(1000);
    }


    @And("User close the browser")
    public void end_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }
}

