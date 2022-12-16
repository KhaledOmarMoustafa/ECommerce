package stepDefiniation;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TagsPage;

public class TagSteps {
    TagsPage tags ;

    WebDriver driver;

    @Given("opens the browser")
    public void open_browser() throws InterruptedException {
        driver =  new ChromeDriver();
        tags = new TagsPage();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("clicks on the login button")
    public void login() throws InterruptedException {

        tags.clickLogin(driver);
        Thread.sleep(1000);


    }
    @And("^user Email\"(.*)\"$")
    public void enter_email(String mail) throws InterruptedException {
        tags.eml(driver,mail);
        Thread.sleep(1000);

    }
    @And("^user Password\"(.*)\"$")
    public void enter_password(String ps) throws InterruptedException {

        tags.ps(driver,ps);
        Thread.sleep(1000);

    }
    @And("user clicks on login button")
    public void click_login() throws InterruptedException {
        tags.loginButton(driver);
        Thread.sleep(1000);
    }

    @And("user chooses category")
    public void category_page(){
        tags.chooseCategory(driver);

    }
    @And("user chooses a sub category")
    public void subcategory_page(){
        tags.choosesubCategory(driver);

    }
    @And("user Chooses a tag")
    public void subcategoryColor_page(){
        tags.choosesubTag(driver);

    }
    @Then("page is filtered by Tag")
    public void filtered_color() throws InterruptedException {

        //this assertion to check the url
        Assert.assertEquals("https://demo.nopcommerce.com/game", driver.getCurrentUrl());
        Thread.sleep(1000);

    }
    @And("Closes Browsers")
    public void close_browser() throws InterruptedException {


        driver.quit();
    }



}
