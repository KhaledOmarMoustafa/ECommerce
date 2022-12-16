package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;
import pages.ResetPage;

public class ResetSteps {
    ResetPage reset ;

    WebDriver driver;


    @Given("open the browser and go to the home page")
    public void open_browser() throws InterruptedException {
        driver = new ChromeDriver();
        reset =  new ResetPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("click on login")
    public void login() throws InterruptedException {

        reset.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^Entering his Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        reset.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("click on ForgotPassword")
    public void forget_password() throws InterruptedException {

        reset.forgotpassword(driver);
        Thread.sleep(1000);

    }
    @And("^user Enter His email\"(.*)\"$")
    public void enter_mail(String mail) throws InterruptedException {
        reset.entr(driver,mail);
        Thread.sleep(1000);
    }
    @And("User click recover")
    public void click_recover() throws InterruptedException {
        reset.send(driver);
        Thread.sleep(1000);
    }

    @Then("a message appears to the user to reset his Password")
    public void home_page() throws InterruptedException {
        String actualResult = reset.message(driver).getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue("confirmation mail has been sent you email",actualResult.contains(expectedResult));

    }
    @And("close the Browser")
    public void close_browser() throws InterruptedException {

        driver.quit();
    }



}
