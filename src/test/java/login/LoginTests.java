package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {
    @Test
    public void testLogin() throws InterruptedException {
        String username = "Davorigaga";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("PASSWORD");

        //Handler for dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }
}
