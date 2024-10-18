package Pages.Login;

import Pages.Dashboard.DashboardPage;
import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage
{

        WebDriver loginDriver;
        public LoginPage(WebDriver driver)
        {
            this.loginDriver=driver;
        }
        private WebDriverWait wait;
        private By userName= By.xpath("//input[@name=\"username\"]");
        private WebElement userNameElement;

        private By password= By.xpath("//input[@name=\"password\"]\n");
        private WebElement passwordElement;

        private By loginButton = By.cssSelector("button[class*=\"oxd-button\"]");
        private WebElement loginButtonElement;

        private By invalidErrorMessage = By.xpath("//p[contains(.,'credentials')]");
        private By requiredErrorMessage = By.tagName("span");



        public void enterUserName(String userNameText)
        {

            loginDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            userNameElement=loginDriver.findElement(userName);
            loginDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            Helper.clear(userNameElement);
            Helper.sendKeys(userNameElement,userNameText);

        }

        public void enterPassword(String passwordText)
        {
            loginDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            passwordElement=loginDriver.findElement(password);
            Helper.clear(passwordElement);
            Helper.sendKeys(passwordElement,passwordText);




        }

        public DashboardPage cliclOnLoginButton()
        {
            loginButtonElement= loginDriver.findElement(loginButton);
            Helper.click(loginButtonElement);
            return new DashboardPage(loginDriver);
        }


        public boolean isInvalidErrorMessageVisible (){
            wait.until(ExpectedConditions.visibilityOfElementLocated(invalidErrorMessage));
            return loginDriver.findElement(invalidErrorMessage).isDisplayed();
        }
        public boolean isRequiredErrorMessageVisible(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(requiredErrorMessage));
            return loginDriver.findElement(requiredErrorMessage).isDisplayed();
        }
        public boolean isDuplicateRequiredMessageVisible(){
            List<WebElement> requiredErrorList =  loginDriver.findElements(requiredErrorMessage);
            for (WebElement webElement : requiredErrorList) {
                if (!webElement.isDisplayed()) {
                    return false;
                }
            }
            return true;
        }
    }
















