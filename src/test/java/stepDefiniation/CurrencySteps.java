package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CurrencyPage;
import pages.HooksPage;
import pages.LoginPage;

public class CurrencySteps {
    CurrencyPage currency = new CurrencyPage() ;
    HooksPage hooksPage = new HooksPage();



    @Given("user opens browser")
    public void open_browser() throws InterruptedException {

        hooksPage.OpenBrowser();

     }
    @When("user login")
    public void login() throws InterruptedException {

        currency.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^user Enter the Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        currency.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^user Enter the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        currency.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user clicks login")
    public void click_login() throws InterruptedException {
        currency.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }
    @And("click currencies")
    public void click_currency(){

        currency.chooseCurr(hooksPage.driver);
    }
    @Then("choose the Euro currency")
        public void choose_currecny(){
        currency.chooseCurrency(hooksPage.driver);

    }
    @And("user Close the browser")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }


}
