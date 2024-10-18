package Pages.Leave;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddLeaveEntitlementPage {
    // driver
    WebDriver addLeaveEntitlementDriver;

    // locators
    By addToMultipleEmployee = By.xpath("//label[./input[@value='1']]");
    By leaveType = By.xpath("//div[./label[contains(text(), 'Leave Type')]]/following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
    By leaveOption = By.xpath("//span[contains(text(), 'CAN - FMLA')]");
    By entitlement = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@class='oxd-input oxd-input--active']");
    By saveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and @data-v-da722d4c]");
    By confirmButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and @data-v-c94a08c2]");
    By message = By.xpath("//div[@id='oxd-toaster_1']/div/div");
    By messageClose = By.xpath("//div[@id='oxd-toaster_1']/div/div[@class='oxd-toast-close-container']/div");


    // Elements
    WebElement addToEmployeeElement;
    WebElement leaveTypeElement;
    WebElement leaveOptionElement;
    WebElement entitlementElement;
    WebElement saveButtonElement;
    WebElement confirmButtonElement;
    WebElement messageElement;
    WebElement messageCloseElement;

    // constructor
    public AddLeaveEntitlementPage(WebDriver driver) {
        addLeaveEntitlementDriver = driver;
    }

    // methods
    private void selectAddToMultipleEmployee() {
        addToEmployeeElement = addLeaveEntitlementDriver.findElement(addToMultipleEmployee);
        Helper.wait(addLeaveEntitlementDriver, 5);
        addToEmployeeElement.click();
    }

    private void SelectLeaveType() {
        leaveTypeElement = addLeaveEntitlementDriver.findElement(leaveType);
        Helper.wait(addLeaveEntitlementDriver, 5);
        Helper.click(leaveTypeElement);
        leaveOptionElement = addLeaveEntitlementDriver.findElement(leaveOption);
        WebDriverWait wait = new WebDriverWait(addLeaveEntitlementDriver, Duration.ofSeconds(10));
        // Wait for the leaveOption to be clickable
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(leaveOptionElement));
        option.click();
    }

    private void enterEntitlement(String entitlementText) {
        entitlementElement = addLeaveEntitlementDriver.findElement(entitlement);
        Helper.clear(entitlementElement);
        Helper.sendKeys(entitlementElement, entitlementText);
    }

    private void clickSaveButton() {
        saveButtonElement = addLeaveEntitlementDriver.findElement(saveButton);
        saveButtonElement.click();
    }

    private void clickConfirmButton() {
        confirmButtonElement = addLeaveEntitlementDriver.findElement(confirmButton);
        confirmButtonElement.click();
    }

    public String getMessage() {
        messageElement = addLeaveEntitlementDriver.findElement(message);
        return messageElement.getText();
    }

    public void closeMessage() {
        messageCloseElement = addLeaveEntitlementDriver.findElement(messageClose);
        messageCloseElement.click();
    }

    public void addLeaveEntitlement(String entitlementText) {
        selectAddToMultipleEmployee();
        SelectLeaveType();
        enterEntitlement(entitlementText);
        clickSaveButton();
        clickConfirmButton();
    }
}
