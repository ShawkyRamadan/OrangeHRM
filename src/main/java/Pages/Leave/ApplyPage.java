package Pages.Leave;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class ApplyPage {
    WebDriver applyDriver;

    // Locators
    By leaveType = By.xpath("//div[./label[contains(text(), 'Leave Type')]]/following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
    By leaveOption = By.xpath("//span[contains(text(), 'CAN - FMLA')]");
    By fromDate = By.xpath("//div[./label[contains(text(), 'From Date')]]/following-sibling::div//div[@class='oxd-date-input']/input[@class='oxd-input oxd-input--active']");
    By toDate = By.xpath("//div[./label[contains(text(), 'To Date')]]/following-sibling::div//div[@class='oxd-date-input']/input[@class='oxd-input oxd-input--active']");
    By toDateIcon = By.xpath("//div[./label[contains(text(), 'To Date')]]/following-sibling::div//div[@class='oxd-date-input']/i");
    By partialDays = By.xpath("//div[./label[contains(text(), 'Partial Days')]]/following-sibling::div//div[@class='oxd-select-wrapper']");
    By partialDaysOption = By.xpath("//span[contains(text(), 'All Days')]");
    By duration = By.xpath("//div[./label[contains(text(), 'Duration')]]/following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']/div");
    By durationOption = By.xpath("//span[contains(text(), 'Specify Time')]");
    By comment = By.xpath("//textarea");
    By applyButton = By.xpath("//button[@type='submit']");
    By message = By.xpath("//div[@id='oxd-toaster_1']/div/div");
    By messageClose = By.xpath("//div[@id='oxd-toaster_1']/div/div[@class='oxd-toast-close-container']/div");


    // Elements
    WebElement leaveTypeElement;
    WebElement leaveOptionElement;
    WebElement fromDateElement;
    WebElement toDateElement;
    WebElement toDateIconElement;
    WebElement partialDaysElement;
    WebElement partialDaysOptionElement;
    WebElement durationElement;
    WebElement durationOptionElement;
    WebElement commentElement;
    WebElement applyButtonElement;
    WebElement messageElement;
    WebElement messageCloseElement;



    public ApplyPage(WebDriver driver) {
        applyDriver = driver;
    }

    private void SelectLeaveType() {
        leaveTypeElement = applyDriver.findElement(leaveType);
        Helper.wait(applyDriver, 5);
        Helper.click(leaveTypeElement);
        leaveOptionElement = applyDriver.findElement(leaveOption);
        WebDriverWait wait = new WebDriverWait(applyDriver, Duration.ofSeconds(10));
        // Wait for the leaveOption to be clickable
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(leaveOptionElement));
        option.click();

    }

    // format yyyy-dd-mm
    private void SetFromDate(String date) {
        fromDateElement = applyDriver.findElement(fromDate);
        Helper.sendKeys(fromDateElement, date);
    }

    // format yyyy-dd-mm
    private void SetToDate(String date){
        toDateElement = applyDriver.findElement(toDate);
        toDateElement.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        Helper.sendKeys(toDateElement, date);
        toDateIconElement = applyDriver.findElement(toDateIcon);
        Helper.click(toDateIconElement);

    }

    private void SelectPartialDays() {
        partialDaysElement = applyDriver.findElement(partialDays);
        Helper.click(partialDaysElement);

        partialDaysOptionElement = applyDriver.findElement(partialDaysOption);
        WebDriverWait wait = new WebDriverWait(applyDriver, Duration.ofSeconds(10));
        // Wait for the option to be clickable
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(partialDaysOptionElement));
        option.click();

    }

    private void SelectDuration() {
        WebDriverWait wait = new WebDriverWait(applyDriver, Duration.ofSeconds(10));
        durationElement = applyDriver.findElement(duration);
        WebElement duration = wait.until(ExpectedConditions.elementToBeClickable(durationElement));
        Helper.click(duration);
        durationOptionElement = applyDriver.findElement(durationOption);
        // Wait for the option to be clickable
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(durationOptionElement));
        option.click();
    }

    private void SetComment(String commentText) {
        commentElement = applyDriver.findElement(comment);
        Helper.sendKeys(commentElement, commentText);
    }

    private void ClickApply() {
        applyButtonElement = applyDriver.findElement(applyButton);
        Helper.click(applyButtonElement);
    }

    public String getMessage() {
        messageElement = applyDriver.findElement(message);
        return messageElement.getText();
    }

    public void closeMessage() {
        messageCloseElement = applyDriver.findElement(messageClose);
        Helper.click(messageCloseElement);
    }


    public void ApplyLeave(String fromDate, String toDate, String comment) {
        SelectLeaveType();
        SetFromDate(fromDate);
        SetToDate(toDate);
        SelectPartialDays();
        SelectDuration();
        SetComment(comment);
        ClickApply();

    }
}
