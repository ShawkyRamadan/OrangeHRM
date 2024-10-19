package Login;

import Pages.Login.LoginPage;
import BaseTest.BaseTest;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginPageTest extends BaseTest {
    private LoginPage loginPage;


    @BeforeClass
    public void setUpLoginPage() {
        super.setUp();  // Initialize driver in the parent class
    }

    @Severity(SeverityLevel.CRITICAL )
    @Owner("SHAWKY")
    @Issue("https://ahmed22968337.atlassian.net/browse/DEPI235-1")
    @Test(priority = 4,dataProvider = "ValidTestData")
    public void validLoginPageTest(String user,String pass)  {

        loginPage=new LoginPage(driver);

        loginPage.enterUserName(user);

        loginPage.enterPassword(pass);
        loginPage.clickOnLoginButton();

        String expected="Dashboard";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String actual=driver.findElement(By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")).getText();
        Assert.assertEquals(actual,expected);

    }
    @DataProvider(name = "ValidTestData")
    public static Object[][] validData()
    {
        return new Object[][]{{"Admin","admin123"}};

    }

}
