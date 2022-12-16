package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CategoriesPage;
import pages.FilterPage;

public class FilterSteps {
    FilterPage filter ;

    WebDriver driver;

    @Given("open the browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        filter = new FilterPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("click on the login button")
    public void login() throws InterruptedException {

        filter.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        filter.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        filter.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("click login button")
    public void click_login() throws InterruptedException {
        filter.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("user choose category")
    public void category_page(){
        filter.chooseCategory(driver);

    }
    @And("user choose a sub category")
    public void subcategory_page(){
        filter.choosesubCategory(driver);

    }
    @And("user Choose a color")
    public void subcategoryColor_page(){
        filter.choosesubColor(driver);

    }
    @Then("page is filtered by color")
    public void filtered_color() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("close The Browser")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
