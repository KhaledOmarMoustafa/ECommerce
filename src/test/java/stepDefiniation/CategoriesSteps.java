package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CategoriesPage;
import pages.CurrencyPage;

public class CategoriesSteps {
    CategoriesPage categories ;

    WebDriver driver ;

    @Given("user opens the browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        categories= new CategoriesPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user clicks on the login button")
    public void login() throws InterruptedException {

        categories.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^Enter the Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        categories.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^Enters the Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        categories.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user clicks login button")
    public void click_login() throws InterruptedException {
        categories.loginButton(driver);
        Thread.sleep(1000);
    }

    @Then("user click on any sub-category")
    public void category_page(){
        categories.chooseCategory(driver);

    }
    @And("user redirected to the sub category page")
    public void subcategory_page(){
        categories.choosesubCategory(driver);

    }
    @And("Close The browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
