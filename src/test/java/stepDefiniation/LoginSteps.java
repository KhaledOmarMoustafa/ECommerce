package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    LoginPage login ;

    WebDriver driver;

    @Given("user open the browser and go to the home page")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        login =  new LoginPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user click on login")
    public void login() throws InterruptedException {

        login.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^Entering the Email\"(.*)\"$")
     public void enter_email(String mail) throws InterruptedException {
        login.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^Entering the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        login.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user click login")
    public void click_login() throws InterruptedException {
        login.loginButton(driver);
        Thread.sleep(1000);
    }
    @Then("User is Able to login and redirected to the home page")
    public void home_page() throws InterruptedException {
        String url = driver.getCurrentUrl();
        Assert.assertEquals( "https://demo.nopcommerce.com/",url);
        System.out.println(url);
        Thread.sleep(1000);

    }

    @And("user quits the Browser")
    public void end_browser() throws InterruptedException {

        Thread.sleep(2000);

        driver.quit();
    }
}
