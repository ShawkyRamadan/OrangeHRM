package Dashboard;

import BaseTest.BaseTest;
import Pages.Dashboard.DashboardPage;
import Pages.NavBar.Navbar;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {
    DashboardPage dashboardPage;
    Navbar navbar;


    @Test(dependsOnMethods = "Login.LoginPageTest.validLoginPageTest")
    public void NavigateToDashboard()
    {
        dashboardPage = new DashboardPage(driver);
        navbar = new Navbar(driver);

        navbar.navigateDashboard();
        dashboardPage.navigateToDashboardPage();
    }
}
