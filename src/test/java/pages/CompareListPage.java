package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompareListPage {
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

        By category = By.cssSelector("a[href=\"/electronics\"]");
        WebElement categoryEle = driver.findElement(category);
        return  categoryEle;

    }
        public WebElement subCategories(WebDriver driver){

        By subcategory = By.xpath("//div//img[@alt=\"Picture for category Cell phones\"]");
        WebElement subcategoryEle = driver.findElement(subcategory);
        return  subcategoryEle;

    }
    public WebElement Product(WebDriver driver){
        By product = By.xpath("//div//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_415.jpeg\"]");
        WebElement productEle = driver.findElement(product);
        return productEle;
    }
    public WebElement addProduct(WebDriver driver) throws InterruptedException {
        By add = By.className("compare-products");
        WebElement addEle = driver.findElement(add);
        return addEle;
    }
    public WebElement secondCategories(WebDriver driver){

        By secondcategory = By.cssSelector("a[href=\"/electronics\"]");
        WebElement secondCategoryEle = driver.findElement(secondcategory);
        return  secondCategoryEle;

    }
    public WebElement secondsubCategory(WebDriver driver){

        By secondsubcategory = By.xpath("//div//img[@alt=\"Picture for category Cell phones\"]");
        WebElement secondSubCategoryEle = driver.findElement(secondsubcategory);
        return  secondSubCategoryEle;

    }public WebElement secondProduct(WebDriver driver){
        By secondproduct = By.xpath("//div//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000042_htc-one-mini-blue_415.jpeg\"]");
        WebElement secondProductEle = driver.findElement(secondproduct);
        return secondProductEle;
    }

    public WebElement addsecondProduct(WebDriver driver){
        By addSecond = By.className("compare-products");
        WebElement addSecondEle = driver.findElement(addSecond);
        return addSecondEle;
    }
    public WebElement ClickCart (WebDriver driver){
        By clickCart = By.xpath("//li//a[@href=\"/compareproducts\"]");
        WebElement clickCartEle = driver.findElement(clickCart);
        return clickCartEle;
    }

    public void chooseCategory (WebDriver driver){
        Categories(driver).click();
    }
        public void choosesubCategory (WebDriver driver){
        subCategories(driver).click();
    }
    public void choosefirstProduct (WebDriver driver){
        Product(driver).click();
    }

    public void addfirstproduct(WebDriver driver) throws InterruptedException {
        addProduct(driver).click();

    }
    public void choosesecondCategory (WebDriver driver){
        secondCategories(driver).click();
    }
    public void choosesecondsubCategory (WebDriver driver){
        secondsubCategory(driver).click();
    }
    public void choosesecondProduct (WebDriver driver){
        secondProduct(driver).click();
    }
    public void addSecondProduct(WebDriver driver){
        addsecondProduct(driver).click();

    }
    public void clickShoppingCart(WebDriver driver){
        ClickCart(driver).click();

    }
    public void eml(WebDriver driver ,String email) {
        userName(driver).sendKeys(email);

    }
    public void ps(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }

}
