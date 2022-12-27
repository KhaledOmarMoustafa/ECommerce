package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SuccessfulOrderPage;
import pages.WishListPage;

public class SuccessfulOrderSteps {
    SuccessfulOrderPage successfulOrderPage= new SuccessfulOrderPage();

    WebDriver driver = new ChromeDriver();

    @Given("User Open Browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        successfulOrderPage = new SuccessfulOrderPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user Click the login Button")
    public void login() throws InterruptedException {

        successfulOrderPage.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^User Enters Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        successfulOrderPage.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^User Enters Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        successfulOrderPage.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("User Clicks on Login Button")
    public void click_login() throws InterruptedException {
        successfulOrderPage.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("User click on shopping cart")
    public void shopping_cart(){
        successfulOrderPage.shopping(driver);

    }
    @And("user Agrees on terms")
    public void agree_terms(){
        successfulOrderPage.TermsOfService(driver);

    }
    @And("user Click checkout")
    public void click_checkout(){
        successfulOrderPage.CheckOut(driver);
    }

    @And("user select a country")
    public void select_country() throws InterruptedException {
        successfulOrderPage.country(driver);
        //Thread.sleep(3000);

    }
    @And("^user Enters a city\"(.*)\"$")
    public void enter_city(String city){
        successfulOrderPage.EnterCity(driver,city);

    }
        @And("^user enters address\"(.*)\"$")
    public void enter_address(String address)
    {
        successfulOrderPage.EnterAddress(driver,address);
    }
    @And("^user enter a zip code\"(.*)\"$")
    public void zip_code(String zip){
        successfulOrderPage.ZipCode(driver,zip);
    }
    @And("^user enters a phone number\"(.*)\"$")
    public void phone_number(String phone){
        successfulOrderPage.PhoneNumber(driver,phone);

    }
    @And("user click on continue")
    public void click_continue(){
        successfulOrderPage.ClickContinue1(driver);


    }
    @And("user choose the shipping method")
    public void shipping_method(){
        successfulOrderPage.ShippingMethod(driver);

    }
    @And("user clicks on continue")
    public void clicks_continue() throws InterruptedException {
        Thread.sleep(2000);
        successfulOrderPage.ClickContinue2(driver);

    }
    @And("Choose The payment Method")
    public void payment_method(){
        successfulOrderPage.PaymentMethod(driver);

    }

    @And("user click on continue again")
    public void click_again(){
        successfulOrderPage.ClickContinue3(driver);

    }
    @And("Click on continue for last time")
    public void click_last(){
        successfulOrderPage.ClickContinue4(driver);

    }
    @And("click on confirm")
    public void click_confirm(){
        successfulOrderPage.confirm(driver);

    }

    @Then("user is redirected to the confirmation screen and get the order number")
    public void confirmation_screen() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/checkout/completed", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @After
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
