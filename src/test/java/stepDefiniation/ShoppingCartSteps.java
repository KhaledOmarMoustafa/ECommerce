package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ShoppingCartPage;
import pages.TagsPage;

public class ShoppingCartSteps {
    ShoppingCartPage shoppingCartPage;

    WebDriver driver;

    @Given("user open browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        shoppingCartPage = new ShoppingCartPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user click the login button")
    public void login() throws InterruptedException {

        shoppingCartPage.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^user Enters Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        shoppingCartPage.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^user Enters Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        shoppingCartPage.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user Clicks on login button")
    public void click_login() throws InterruptedException {
        shoppingCartPage.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("user Chooses category")
    public void category_page(){
        shoppingCartPage.chooseCategory(driver);

    }
//    @And("user Chooses sub category")
//    public void subcategory_page(){
//        shoppingCartPage.choosesubCategory(driver);
//
//    }
    @And("choose the first product")
    public void first_product(){
        shoppingCartPage.choosefirstProduct(driver);
    }

    @And("user Add item")
    public void add_item() throws InterruptedException {
        shoppingCartPage.addfirstproduct(driver);
        //Thread.sleep(3000);

    }
    @And("user choose another category")
    public void another_category(){
        shoppingCartPage.choosesecondCategory(driver);

    }
    @And("user go to the sub category")
    public void second_subcategory() {
        shoppingCartPage.choosesecondsubCategory(driver);
    }
    @And("choose the second product")
    public void second_product(){
        shoppingCartPage.choosesecondProduct(driver);
    }
    @And("user Add another Item")
    public void addanother_item(){
        shoppingCartPage.addSecondProduct(driver);

    }
    @Then("user click his shopping cart")
    public void click_cart(){
        shoppingCartPage.clickShoppingCart(driver);

    }
    @And("user is redirected to the shopping cart")
    public void shopping_cart() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/cart", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("close  Browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
