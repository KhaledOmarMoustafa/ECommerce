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

public class RegistrationSteps {
    RegisterPage register = new RegisterPage();
    HooksPage hooksPage = new HooksPage( );


    @Given("user open browser and go to home page")
    public void open_browser() throws InterruptedException {

        hooksPage.OpenBrowser();
    }
    @When("user click on Register")
    public void register_button() throws InterruptedException {

       register.clickRegister(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("choose the gender")
    public void chooseGender() throws InterruptedException {
        register.chooseGender(hooksPage.driver);
        Thread.sleep(1000);

    }
    @And("^enter his first name\"(.*)\"$")
    public void first_name(String userName) throws InterruptedException {

        register.LoginSteps(hooksPage.driver, userName);
        Thread.sleep(1000);

    }
    @And("^enter his last name\"(.*)\"$")
    public void last_name(String secondname) throws InterruptedException {

        register.scndname(hooksPage.driver, secondname);
        Thread.sleep(1000);
    }
    @And("enter his date of birth")
    public void date_birth() throws InterruptedException {

        register.dayofBirth(hooksPage.driver  );
        register.chooseDayEle(hooksPage.driver);
        register.monthOfBirth(hooksPage.driver);
        register.month(hooksPage.driver);
        register.yearOfBirth(hooksPage.driver);
        register.year(hooksPage.driver);

        Thread.sleep(3000);

    }
    @And("^enter his email\"(.*)\"$")
    public void email(String email) throws InterruptedException {


          register.eml(hooksPage.driver, email);
        Thread.sleep(1000);


    }
    @And("^enter his company name\"(.*)\"$")
    public void company(String companyName) throws InterruptedException {

        register.cmname(hooksPage.driver, companyName);
        Thread.sleep(1000);

    }
    @And("^enter his password\"(.*)\"$")
    public void password(String password) throws InterruptedException {

        register.psword(hooksPage.driver, password);
        Thread.sleep(1000);
    }
    @And("^confirm his password\"(.*)\"$")
    public void confirmPassword(String confirm) throws InterruptedException {

        register.confirmpsword(hooksPage.driver, confirm);
        Thread.sleep(1000);
    }
    @Then("user registered successfuly")
    public void registerButton() throws InterruptedException {
        register.clickButton(hooksPage.driver);

        Thread.sleep(1000);
    }

    @And("user go to home page")
    public void home_page() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", hooksPage.driver.getCurrentUrl());
        Thread.sleep(1000);


    }
    @And("user quit the Browser")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }


  }


