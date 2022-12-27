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
import pages.LoginPage;

public class LoginSteps {
    LoginPage login = new LoginPage() ;

    HooksPage hooksPage = new HooksPage();


    @Given("user open the browser and go to the home page")
    public void open_browser() throws InterruptedException {
        hooksPage.OpenBrowser();
    }
    @When("user click on login")
    public void login() throws InterruptedException {

        login.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^Entering the Email\"(.*)\"$")
     public void enter_email(String mail) throws InterruptedException {
        login.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^Entering the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        login.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user click login")
    public void click_login() throws InterruptedException {
        login.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }
    @Then("User is Able to login and redirected to the home page")
    public void home_page() throws InterruptedException {
        String url = hooksPage.driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/",url);
        System.out.println(url);
        Thread.sleep(1000);

    }

    @And("user quits the Browser")
    public void end_browser() throws InterruptedException {

        Thread.sleep(2000);

        hooksPage.CloseBrowser();
    }
}
