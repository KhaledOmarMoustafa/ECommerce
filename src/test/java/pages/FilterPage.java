package pages;

//import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {
    public void clickLogin(WebDriver driver){
        driver.findElement(By.className("ico-login")).click();
    }
    public WebElement userName(WebDriver driver){
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }



    public WebElement password(WebDriver driver){
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }
    public void loginButton(WebDriver driver){

        driver.findElement(By.xpath("//div//button[@class =\"button-1 login-button\"]")).click();
    }
    public WebElement Categories(WebDriver driver){

        By category = By.xpath("//div//a[@href=\"/apparel\"]");
        WebElement categoryEle = driver.findElement(category);
        return  categoryEle;

    }
    public WebElement subCategories(WebDriver driver){

        By subcategory = By.xpath("//div//img[@alt=\"Picture for category Shoes\"]");
        WebElement subcategoryEle = driver.findElement(subcategory);
        return  subcategoryEle;

    }
    public WebElement chooseColor(WebDriver driver){
        By color = By.xpath("//div//label[@for=\"attribute-option-15\"]");
        WebElement colorEle = driver.findElement(color);
        return colorEle;
    }
    public void chooseCategory (WebDriver driver){
        Categories(driver).click();
    }
    public void choosesubCategory (WebDriver driver){
        subCategories(driver).click();
    }
    public void choosesubColor(WebDriver driver){
        chooseColor(driver).click();

    }



    public void eml(WebDriver driver ,String email) {
        userName(driver).sendKeys(email);

    }
    public void ps(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }

}
