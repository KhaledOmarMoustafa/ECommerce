package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPage {
    public void clickLogin(WebDriver driver) {
        driver.findElement(By.className("ico-login")).click();
    }

    public WebElement userName(WebDriver driver) {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }


    public void forgotpassword(WebDriver driver) {
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
    }

    public WebElement enterEmail(WebDriver driver) {
        By enterEmail = By.id("Email");
        WebElement enterEmailEle = driver.findElement(enterEmail);
        return enterEmailEle;
    }

    public WebElement recover(WebDriver driver) {
        By recover = By.name("send-email");
        WebElement recoverEle = driver.findElement(recover);
        return recoverEle;

    }

    public WebElement message(WebDriver driver) {
        By message = By.className("content");
        WebElement messageEle = driver.findElement(message);
        return messageEle;
    }

    public void eml(WebDriver driver, String email) {
        userName(driver).sendKeys(email);

    }

    public void entr(WebDriver driver, String entrEmail) {
        enterEmail(driver).sendKeys(entrEmail);

    }
    public void send(WebDriver driver ){
        recover(driver).click();
    }
}