package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CompareListPage;
import pages.WishListPage;

public class CompareListSteps {
    CompareListPage compareListPage;

    WebDriver driver ;

    @Given("User Open browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        compareListPage = new CompareListPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("User Click the login button")
    public void login() throws InterruptedException {

        compareListPage.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^User Enters email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        compareListPage.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^User Enters password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        compareListPage.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("User Clicks on Login button")
    public void click_login() throws InterruptedException {
        compareListPage.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("User Chooses Category")
    public void category_page(){
        compareListPage.chooseCategory(driver);

    }
        @And("User choose the sub category")
    public void subcategory_page(){
        compareListPage.choosesubCategory(driver);

    }
    @And("Choose The first product")
    public void first_product(){
        compareListPage.choosefirstProduct(driver);
    }

    @And("user Add item to the Compare list")
    public void add_item() throws InterruptedException {
        compareListPage.addfirstproduct(driver);
     //   Thread.sleep(3000);

    }
    @And("User choose Another category")
    public void another_category(){
        compareListPage.choosesecondCategory(driver);

    }
    @And("User go to The sub category")
    public void second_subcategory() {
        compareListPage.choosesecondsubCategory(driver);
    }
    @And("Choose the Second product")
    public void second_product(){
        compareListPage.choosesecondProduct(driver);
    }
    @And("user Add another Item to the compare list")
    public void addanother_item() throws InterruptedException {
        compareListPage.addSecondProduct(driver);
        Thread.sleep(2000);

    }
    @Then("user Click his compare list")
    public void click_comparelist(){
        compareListPage.clickShoppingCart(driver);

    }
    @And("user is redirected to the compare list page")
    public void compare_list() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/compareproducts", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("user Closes the Browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
