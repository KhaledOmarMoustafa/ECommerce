package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
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

    public WebElement search(WebDriver driver){
        By search = By.id("small-searchterms");
        WebElement searchEle = driver.findElement(search);
        return searchEle;
    }
    public WebElement searchBtn(WebDriver driver){
        By searchbtn = By.xpath("//div//button[@class=\"button-1 search-box-button\"]");
        WebElement searchBtnEle = driver.findElement(searchbtn);
        return  searchBtnEle;
    }




    public void eml(WebDriver driver ,String email) {
        userName(driver).sendKeys(email);

    }
    public void ps(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }
    public void searchEle(WebDriver driver ){
        search(driver).click();

    }
    public void searchPage(WebDriver driver,String search){
        search(driver).sendKeys(search);
    }
    public void searchButton (WebDriver driver){
        searchBtn(driver).click();
    }

}
