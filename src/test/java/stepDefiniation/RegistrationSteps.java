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

public class RegistrationSteps {
    RegisterPage register ;

    WebDriver driver ;

    @Given("user open browser and go to home page")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        register =  new RegisterPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user click on Register")
    public void register_button() throws InterruptedException {

       register.clickRegister(driver);
        Thread.sleep(1000);


    }
    @And("choose the gender")
    public void chooseGender() throws InterruptedException {
        register.chooseGender(driver);
        Thread.sleep(1000);

    }
    @And("^enter his first name\"(.*)\"$")
    public void first_name(String userName) throws InterruptedException {

        register.LoginSteps(driver,userName);
        Thread.sleep(1000);

    }
    @And("^enter his last name\"(.*)\"$")
    public void last_name(String secondname) throws InterruptedException {

        register.scndname(driver,secondname);
        Thread.sleep(1000);
    }
    @And("enter his date of birth")
    public void date_birth() throws InterruptedException {

        register.dayofBirth(driver  );
        register.chooseDayEle(driver);
        register.monthOfBirth(driver);
        register.month(driver);
        register.yearOfBirth(driver);
        register.year(driver);

        Thread.sleep(3000);

    }
    @And("^enter his email\"(.*)\"$")
    public void email(String email) throws InterruptedException {


          register.eml(driver,email);
        Thread.sleep(1000);


    }
    @And("^enter his company name\"(.*)\"$")
    public void company(String companyName) throws InterruptedException {

        register.cmname(driver,companyName);
        Thread.sleep(1000);

    }
    @And("^enter his password\"(.*)\"$")
    public void password(String password) throws InterruptedException {

        register.psword(driver,password);
        Thread.sleep(1000);
    }
    @And("^confirm his password\"(.*)\"$")
    public void confirmPassword(String confirm) throws InterruptedException {

        register.confirmpsword(driver,confirm);
        Thread.sleep(1000);
    }
    @Then("user registered successfuly")
    public void registerButton() throws InterruptedException {
        register.clickButton(driver);

        Thread.sleep(1000);
    }

    @And("user go to home page")
    public void home_page() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", driver.getCurrentUrl());
        Thread.sleep(1000);


    }
    @And("user quit the Browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }


  }


