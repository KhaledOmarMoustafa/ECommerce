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
import pages.ShoppingCartPage;
import pages.WishListPage;

public class WishListSteps {
    WishListPage wishListPage = new WishListPage();

    HooksPage hooksPage = new HooksPage();

    @Given("user Open browser")
    public void open_browser() throws InterruptedException {
   hooksPage.OpenBrowser();
    }
    @When("user Click the login button")
    public void login() throws InterruptedException {

        wishListPage.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^user Enters email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        wishListPage.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^user Enters password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        wishListPage.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user Clicks on Login button")
    public void click_login() throws InterruptedException {
        wishListPage.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }

    @And("user Chooses Category")
    public void category_page(){
        wishListPage.chooseCategory(hooksPage.driver);

    }
        @And("user go to The sub category")
    public void subcategory_page(){
        wishListPage.choosesubCategory(hooksPage.driver);

    }
    @And("choose The first product")
    public void first_product(){
        wishListPage.choosefirstProduct(hooksPage.driver);
    }

    @And("user Add item to the wish list")
    public void add_item() throws InterruptedException {
        wishListPage.addfirstproduct(hooksPage.driver);
        //Thread.sleep(3000);

    }
    @And("user choose Another category")
    public void another_category(){
        wishListPage.chooseSecondCategory(hooksPage.driver);

    }
//    @And("user go to The sub category")
//    public void second_subcategory()
//    {
//        wishListPage.choosesecondsubCategory(driver);
//    }
    @And("choose the Second product")
    public void second_product(){
        wishListPage.choosesecondProduct(hooksPage.driver);
    }
    @And("user Add another Item to the wish list")
    public void addanother_item(){
        wishListPage.addSecondProduct(hooksPage.driver);

    }
    @Then("user Click his wish list")
    public void click_cart(){
        wishListPage.clickShoppingCart(hooksPage.driver);

    }
    @And("user is redirected to the wish list page")
    public void wish_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/wishlist", hooksPage.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("browser is closed")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }



}
