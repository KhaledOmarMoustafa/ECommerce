package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SuccessfulOrderPage {
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
    public WebElement shoppingCart(WebDriver driver){

        By shoppingcart = By.className("cart-label");
        WebElement shoppingcartEle = driver.findElement(shoppingcart);
        return  shoppingcartEle;

    }
    public WebElement termsofservice(WebDriver driver){

        By terms = By.id("termsofservice");
        WebElement termsEle = driver.findElement(terms);
        return  termsEle;

    }
    public WebElement checkout(WebDriver driver){
        By checkOut = By.xpath("//div//button[@id=\"checkout\"]");
        //   By checkOut = By.name("checkout");
        WebElement checkOutEle = driver.findElement(checkOut);
        return checkOutEle;
    }
    public void country(WebDriver driver) throws InterruptedException {
        WebElement dri = driver.findElement(By.id("BillingNewAddress_CountryId"));
        dri.click();
        Select select = new Select(dri);
        select.selectByIndex(4);
    }
    public WebElement enterCity(WebDriver driver){

        By entercity = By.id("BillingNewAddress_City");

        WebElement entercityEle = driver.findElement(entercity);
        return  entercityEle;

    }
        public WebElement enterAddress(WebDriver driver){

        By enteraddress = By.id("BillingNewAddress_Address1");
        WebElement enteraddressEle = driver.findElement(enteraddress);
        return  enteraddressEle;
}
    public WebElement zipCode(WebDriver driver){
        By zipcode =By.id ("BillingNewAddress_ZipPostalCode");
        WebElement zipcodeEle = driver.findElement(zipcode);
        return zipcodeEle;
    }

    public WebElement phoneNumber(WebDriver driver){
        By phonenumber = By.id("BillingNewAddress_PhoneNumber");
        WebElement phonenumberEle = driver.findElement(phonenumber);
        return phonenumberEle;
    }
    public WebElement clickContinue13 (WebDriver driver){
       By click = By.xpath("//div//button[@class=\"button-1 new-address-next-step-button\"]");
        // By click = By.xpath("//div//button[@onclick=\"Billing.save()\"]");
        WebElement clickEle = driver.findElement(click);
        return clickEle;
    }
    public WebElement  shippingMethod(WebDriver driver){
        By shippingmethod = By.xpath("//li//label[@for=\"shippingoption_1\"]");
        WebElement shippingmethodEle = driver.findElement(shippingmethod);
        return shippingmethodEle;

    }
    public WebElement clickContinue2 (WebDriver driver){
        By click2 = By.cssSelector("div>button[class=\"button-1 shipping-method-next-step-button\"]");
        WebElement click2Ele = driver.findElement(click2);
        return click2Ele;
    }
    public WebElement  paymentMethod(WebDriver driver){
        By paymentmethod = By.xpath("//div//input[@id=\"paymentmethod_0\"]");
        WebElement paymentmethodEle = driver.findElement(paymentmethod);
        return paymentmethodEle;

    }

    public WebElement clickContinue4(WebDriver driver){
        By continue4 = By.cssSelector("div > button[class=\"button-1 payment-method-next-step-button\"]");
        WebElement continue4Ele = driver.findElement(continue4);
        return continue4Ele;
    }
    public WebElement Confirm(WebDriver driver){
        By confirm = By.className("button-1 confirm-order-next-step-button");
        WebElement confirmEle = driver.findElement(confirm);
        return confirmEle;
    }

    public void shopping (WebDriver driver)
    {
        shoppingCart(driver).click();
    }
    public void TermsOfService (WebDriver driver){
        termsofservice(driver).click();
    }
    public void CheckOut (WebDriver driver){
        checkout(driver).click();
    }

    public void EnterCity(WebDriver driver,String city)  {
        enterCity(driver).sendKeys(city);

    }
    public void EnterAddress (WebDriver driver,String address)
    {
        enterAddress(driver).sendKeys(address);
    }
        public void ZipCode (WebDriver driver, String zip)
    {
        zipCode(driver).sendKeys(zip);
    }
    public void PhoneNumber (WebDriver driver,String phone){
        phoneNumber(driver).sendKeys(phone);
    }
    public void ClickContinue1(WebDriver driver){
        clickContinue13(driver).click();

    }
    public void ShippingMethod(WebDriver driver){
        shippingMethod(driver).click();

    }
    public void ClickContinue2(WebDriver driver){
        clickContinue2(driver).click();

    }
    public void PaymentMethod(WebDriver driver){
        paymentMethod(driver).click();

    }
    public void ClickContinue3(WebDriver driver){
        clickContinue13(driver).click();

    }
    public void ClickContinue4(WebDriver driver){
        clickContinue4(driver).click();

    }
    public void confirm(WebDriver driver){
        Confirm(driver).click();

    }
    public void eml(WebDriver driver ,String email) {
        userName(driver).sendKeys(email);

    }
    public void ps(WebDriver driver ,String password) {
        password(driver).sendKeys(password);

    }
}
