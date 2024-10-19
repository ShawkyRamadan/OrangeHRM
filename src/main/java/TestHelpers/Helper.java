package TestHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
    public static void click(WebElement webElement) {
        webElement.click();
    }

    public static void sendKeys(WebElement webelement, String text) {
        webelement.sendKeys(text);
    }

    public static void wait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void clear(WebElement element)
    {
        element.clear();
    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element, int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(element));
    }


}
