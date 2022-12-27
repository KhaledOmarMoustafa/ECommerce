package pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HooksPage {
    public WebDriver driver ;


    public void OpenBrowser() throws InterruptedException {
        driver =  new ChromeDriver();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    public void CloseBrowser(){
        driver.quit();

    }
}
