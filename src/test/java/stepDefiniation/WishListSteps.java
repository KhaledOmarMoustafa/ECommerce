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
import pages.WishListPage;

public class WishListSteps {
    WishListPage wishListPage;

    WebDriver driver;

    @Given("user Open browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        wishListPage = new WishListPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user Click the login button")
    public void login() throws InterruptedException {

        wishListPage.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^user Enters email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        wishListPage.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^user Enters password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        wishListPage.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user Clicks on Login button")
    public void click_login() throws InterruptedException {
        wishListPage.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("user Chooses Category")
    public void category_page(){
        wishListPage.chooseCategory(driver);

    }
        @And("user go to The sub category")
    public void subcategory_page(){
        wishListPage.choosesubCategory(driver);

    }
    @And("choose The first product")
    public void first_product(){
        wishListPage.choosefirstProduct(driver);
    }

    @And("user Add item to the wish list")
    public void add_item() throws InterruptedException {
        wishListPage.addfirstproduct(driver);
        //Thread.sleep(3000);

    }
    @And("user choose Another category")
    public void another_category(){
        wishListPage.chooseSecondCategory(driver);

    }
//    @And("user go to The sub category")
//    public void second_subcategory()
//    {
//        wishListPage.choosesecondsubCategory(driver);
//    }
    @And("choose the Second product")
    public void second_product(){
        wishListPage.choosesecondProduct(driver);
    }
    @And("user Add another Item to the wish list")
    public void addanother_item(){
        wishListPage.addSecondProduct(driver);

    }
    @Then("user Click his wish list")
    public void click_cart(){
        wishListPage.clickShoppingCart(driver);

    }
    @And("user is redirected to the wish list page")
    public void wish_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/wishlist", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("user Close the Browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
