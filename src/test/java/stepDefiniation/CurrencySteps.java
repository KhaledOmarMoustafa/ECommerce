package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CurrencyPage;
import pages.LoginPage;

public class CurrencySteps {
    CurrencyPage currency ;

    WebDriver driver;

    @Given("user opens browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        currency =  new CurrencyPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user login")
    public void login() throws InterruptedException {

        currency.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^user Enter the Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        currency.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^user Enter the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        currency.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user clicks login")
    public void click_login() throws InterruptedException {
        currency.loginButton(driver);
        Thread.sleep(1000);
    }
    @And("click currencies")
    public void click_currency(){

        currency.chooseCurr(driver);
    }
    @Then("choose the Euro currency")
        public void choose_currecny(){
        currency.chooseCurrency(driver);

    }
    @And("Close the browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }


}
