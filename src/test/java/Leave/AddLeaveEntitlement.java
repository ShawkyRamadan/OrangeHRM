package Leave;

import BaseTest.BaseTest;
import Pages.Leave.AddLeaveEntitlementPage;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddLeaveEntitlement extends BaseTest {
    AddLeaveEntitlementPage addLeaveEntitlementPage;

    // locators to navigate to the add leave entitlement page
    By leaveMenu = By.xpath("//a[@class='oxd-main-menu-item'][.//span[text()='Leave']]");
    By EntitlementMenu = By.xpath("//span[contains(text(), 'Entitlements ')]");
    By addEntitlementMenu = By.xpath("//a[@role='menuitem' and contains(text(), 'Add Entitlement')]");

    // Elements
    WebElement leaveMenuElement;
    WebElement EntitlementMenuElement;
    WebElement addEntitlementMenuElement;

    // Messages
    String SuccessMessage = "Success";


    @BeforeTest
    public void setUpAddLeaveEntitlementPage()
    {
        super.setUp();
    }

    @Owner("Abdelrhman")
    @Test(  testName = "TC-7",
            dependsOnMethods = {"Login.LogainPageTest.validLoginPageTest"},
            description = "This test will navigate to the add leave entitlement page"
    )
    public void navigateAddLeaveEntitlement()
    {
        // navigate to the add leave entitlement page
        leaveMenuElement = driver.findElement(leaveMenu);
        leaveMenuElement.click();
        EntitlementMenuElement = driver.findElement(EntitlementMenu);
        EntitlementMenuElement.click();
        addEntitlementMenuElement = driver.findElement(addEntitlementMenu);
        addEntitlementMenuElement.click();
    }

    @Owner("Abdelrhman")
    @Test(  testName = "TC-8",
            dependsOnMethods = "navigateAddLeaveEntitlement",
            description = "This test will add a leave entitlement for all employees"
    )
    public void addLeaveEntitlement()
    {
        addLeaveEntitlementPage = new AddLeaveEntitlementPage(driver);
        addLeaveEntitlementPage.addLeaveEntitlement("20");
        // check if the message is displayed
        Assert.assertTrue(addLeaveEntitlementPage.getMessage().contains(SuccessMessage), "The message is not displayed");
        addLeaveEntitlementPage.closeMessage();
    }


}
