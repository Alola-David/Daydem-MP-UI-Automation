package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    private By welcomeAdmin = By.xpath ("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]");
    private By logOut = By.className ("topbar__link-title");


    public void clickWelcomeAdmin() throws InterruptedException {
        Thread.sleep (10000);
        driver.findElement (welcomeAdmin).click ();

    }
    public LoginPage clickLogout() throws InterruptedException {
        Thread.sleep (3000);
        driver.findElement (logOut).click ();
        return new LoginPage (driver);
    }

}
