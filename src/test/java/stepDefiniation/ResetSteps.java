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
import pages.RegisterPage;
import pages.ResetPage;

public class ResetSteps {
    ResetPage reset = new ResetPage() ;

    HooksPage hooksPage = new HooksPage();


    @Given("open the browser and go to the home page")
    public void open_browser() throws InterruptedException {
        hooksPage.OpenBrowser();
         }
    @When("click on login")
    public void login() throws InterruptedException {

        reset.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^Entering his Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        reset.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("click on ForgotPassword")
    public void forget_password() throws InterruptedException {

        reset.forgotpassword(hooksPage.driver);
        Thread.sleep(1000);

    }
    @And("^user Enter His email\"(.*)\"$")
    public void enter_mail(String mail) throws InterruptedException {
        reset.entr(hooksPage.driver, mail);
        Thread.sleep(1000);
    }
    @And("User click recover")
    public void click_recover() throws InterruptedException {
        reset.send(hooksPage.driver);
        Thread.sleep(1000);
    }

    @Then("a message appears to the user to reset his Password")
    public void home_page() throws InterruptedException {
        String actualResult = reset.message(hooksPage.driver).getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue("confirmation mail has been sent you email",actualResult.contains(expectedResult));

    }
    @And("user exit the browser")
    public void close_browser() throws InterruptedException {

        hooksPage.CloseBrowser();
    }



}
