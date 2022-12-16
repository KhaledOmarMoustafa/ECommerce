package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage {
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
    public WebElement currency(WebDriver driver){

        By currency = By.name("customerCurrency");
        WebElement currencyEle = driver.findElement(currency);
        return  currencyEle;

    }
    public void chooseCurrency (WebDriver driver){
        WebElement dri = driver.findElement(By.name("customerCurrency"));
        Select select = new Select(dri);
        select.selectByIndex(1);

    }



    public void eml(WebDriver driver ,String email) {
        userName(driver).sendKeys(email);

    }
    public void ps(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }
    public void chooseCurr(WebDriver driver){
        currency(driver).click();
    }
}
