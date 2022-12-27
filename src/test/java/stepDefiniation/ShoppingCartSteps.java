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
import pages.TagsPage;

public class ShoppingCartSteps {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    HooksPage hooksPage = new HooksPage();

    @Given("user open browser")
    public void open_browser() throws InterruptedException {
    hooksPage.OpenBrowser();
    }
    @When("user click the login button")
    public void login() throws InterruptedException {

        shoppingCartPage.clickLogin(hooksPage.driver);
        Thread.sleep(1000);


    }
    @And("^user Enters Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        shoppingCartPage.eml(hooksPage.driver, mail);
        Thread.sleep(1000);

    }
    @And("^user Enters Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        shoppingCartPage.ps(hooksPage.driver, ps);
        Thread.sleep(1000);

    }
    @And("user Clicks on login button")
    public void click_login() throws InterruptedException {
        shoppingCartPage.loginButton(hooksPage.driver);
        Thread.sleep(1000);
    }

    @And("user Chooses category")
    public void category_page(){
        shoppingCartPage.chooseCategory(hooksPage.driver);

    }
//    @And("user Chooses sub category")
//    public void subcategory_page(){
//        shoppingCartPage.choosesubCategory(driver);
//
//    }
    @And("choose the first product")
    public void first_product(){
        shoppingCartPage.choosefirstProduct(hooksPage.driver);
    }

    @And("user Add item")
    public void add_item() throws InterruptedException {
        shoppingCartPage.addfirstproduct(hooksPage.driver);
        //Thread.sleep(3000);

    }
    @And("user choose another category")
    public void another_category(){
        shoppingCartPage.choosesecondCategory(hooksPage.driver);

    }
    @And("user go to the sub category")
    public void second_subcategory() {
        shoppingCartPage.choosesecondsubCategory(hooksPage.driver);
    }
    @And("choose the second product")
    public void second_product(){
        shoppingCartPage.choosesecondProduct(hooksPage.driver);
    }
    @And("user Add another Item")
    public void addanother_item(){
        shoppingCartPage.addSecondProduct(hooksPage.driver);

    }
    @Then("user click his shopping cart")
    public void click_cart(){
        shoppingCartPage.clickShoppingCart(hooksPage.driver);

    }
    @And("user is redirected to the shopping cart")
    public void shopping_cart() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/cart", hooksPage.driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("close the browser")
    public void close_browser() throws InterruptedException {


        hooksPage.CloseBrowser();
    }



}
