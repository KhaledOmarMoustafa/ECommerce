package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public void clickRegister(WebDriver driver){
        driver.findElement(By.xpath("//div//a[@href =\"/register?returnUrl=%2F\" ]")).click();
    }
//        By register = By.linkText("Register");
//      WebElement registerEle =  driver.findElement(register);
//      return registerEle;
//    }
    public void chooseGender(WebDriver driver){
//        By gender = By.name("Gender");
//        WebElement genderEle = driver.findElement(gender);
//        return genderEle;
        driver.findElement(By.name("Gender")).click();
    }


    public WebElement firstNameEle(WebDriver driver){
        By firstName = By.id("FirstName");
        WebElement firstnameEle = driver.findElement(firstName);
        return firstnameEle;
    }
    public WebElement lastNameEle(WebDriver driver){
        By lastName = By.id("LastName");
        WebElement lastnameEle = driver.findElement(lastName);
        return lastnameEle;
    }
    public WebElement dayofBirth(WebDriver driver) {
        By day = By.name("DateOfBirthDay");

        WebElement dayEle = driver.findElement(day);

        return dayEle;
    }

    public void chooseDayEle(WebDriver driver) {
//        By choose = By.partialLinkText("19");
//        WebElement chooseEle = driver.findElement(choose);
//        return chooseEle;
        WebElement dri = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(dri);
        select.selectByIndex(4);
    }
    public WebElement monthOfBirth (WebDriver driver) {
        By month = By.name("DateOfBirthMonth");
        WebElement monthEle = driver.findElement(month);
        return monthEle;
    }
    public void month(WebDriver driver) {
//        By whichMonth = By.linkText("February");
//        WebElement whichMonthEle = driver.findElement(whichMonth);
//        return whichMonthEle;
        WebElement dri = driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(dri);
        select.selectByIndex(4);
   }
    public WebElement yearOfBirth (WebDriver driver) {
        By year = By.name("DateOfBirthYear");
        WebElement yearEle = driver.findElement(year);
        return yearEle;
    }
    public void year (WebDriver driver) {
            WebElement dri = driver.findElement(By.name("DateOfBirthYear"));
            Select select = new Select(dri);
            select.selectByIndex(4);
        }
//        By whichYear = By.linkText("1994");
//        WebElement whichYearEle = driver.findElement(whichYear);
//        return whichYearEle;



    public WebElement email(WebDriver driver) {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }
    public WebElement company(WebDriver driver) {
        By company = By.id("Company");
        WebElement companyEle = driver.findElement(company);
        return companyEle;
    }
    public WebElement password(WebDriver driver) {
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }
    public WebElement confirmPassword(WebDriver driver) {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement confirmPasswordEle = driver.findElement(confirmPassword);
        return confirmPasswordEle;
    }
    public void LoginSteps(WebDriver driver ,String firstName){
        firstNameEle(driver).sendKeys(firstName);


    }
    public void scndname(WebDriver driver ,String secondName) {
        lastNameEle(driver).sendKeys(secondName);

    }
    public void cmname(WebDriver driver ,String companyName) {
        company(driver).sendKeys(companyName);

    }
    public void eml(WebDriver driver ,String email) {
        email(driver).sendKeys(email);


    }
    public void psword(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }
    public void confirmpsword(WebDriver driver ,String confirmPassword) {
        confirmPassword(driver).sendKeys(confirmPassword);

    }


//    public void emailEle(WebDriver driver ,String username,String password){
//        usernameEle(driver).sendKeys(username);
//        passwordEle(driver).sendKeys(password);
//
//    }
    public void  clickButton(WebDriver driver){
//        By click = By.name("register-button");
//        WebElement clickEle = driver.findElement(click);
//        return clickEle;

        driver.findElement(By.name("register-button")).click();
    }

}
