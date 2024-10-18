package TestHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Helper {
    public static  void click(WebElement webElement) {
        webElement.click();
    }

    public static void sendKeys(WebElement webelement, String text) {
        webelement.sendKeys(text);
    }

    public static void wait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void clear (WebElement element )
    {
        element.clear();
    }


}
