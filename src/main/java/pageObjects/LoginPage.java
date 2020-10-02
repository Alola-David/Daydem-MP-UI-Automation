package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By username = By.id ("username");

    public void enterUsername(String uName){
        driver.findElement (username).sendKeys (uName);
    }

    public void enterUserPassword(String pwd){
        WebElement passwordField = driver.findElement (By.id ("password"));
        passwordField.sendKeys (pwd);
    }

    public DashboardPage clickLoginBtn(){
        driver.findElement (By.xpath ("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
        return new DashboardPage (driver);
    }
}
