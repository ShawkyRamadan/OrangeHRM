package Pages.Attendance;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PunchInOut {
    // dirver
    WebDriver punchInOutDriver;

    // locators
    By attendanceMenu = By.xpath("//span[contains(text(),'Attendance ')]");
    By punchInOut = By.xpath("//a[contains(text(),'Punch In/Out')]");
    By date = By.xpath("//div[@class='oxd-date-input']/input");
    By time = By.xpath("//div[@class='oxd-time-input']/input");
    By note = By.xpath("//textarea");
    By punchInOutButton = By.xpath("//button[@type='submit']");

    // elements
    WebElement attendanceMenuElement;
    WebElement punchInOutElement;
    WebElement dateElement;
    WebElement timeElement;
    WebElement noteElement;
    WebElement punchInOutButtonElement;

    // constructor
    public PunchInOut(WebDriver driver) {
        punchInOutDriver = driver;
    }

    // methods
    public void navigateToPunchInOut(){
        attendanceMenuElement = punchInOutButton.findElement()
    }

    public void enterDate(String date){
        dateElement = punchInOutDriver.findElement(this.date);
        Helper.sendKeys(dateElement, date);
    }






}
