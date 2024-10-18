package Leave;

import Pages.Leave.ApplyPage;
import BaseTest.BaseTest;
import Pages.Leave.MyLeavePage;
import TestHelpers.Helper;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class Apply extends BaseTest {
    ApplyPage applyPage;
    MyLeavePage myLeavePage;

    // Locators to navigate to the apply leave page
    By leaveMenu = By.xpath("//a[@class='oxd-main-menu-item'][.//span[text()='Leave']]");
    By applyMenu = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'Apply')]");
    By myLeaveMenu = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'My Leave')]");

    // Elements
    WebElement leaveMenuElement;
    WebElement applyMenuElement;
    WebElement myLeaveMenuElement;

    // Messages
    String SuccessMessage = "Success\nSuccessfully Saved";
    String cancelLeaveSuccessMessage = "Success\nSuccessfully Updated";
    String WarningMessage = "Warning\nFailed to Submit";

    @BeforeTest
    public void setUpApplyPage()
    {
        super.setUp();
    }

    @DataProvider(name = "ApplyLeave")
    public Object[][] ApplyLeaveData() {
        return new Object[][] {
            {"2024-01-10", "2024-02-10", "Leave for vacation"}
        };
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-1", dependsOnMethods = {"Login.LogainPageTest.validLoginPageTest"}, description = "This test will navigate to the apply leave page")
    public void navigateApplyLeave()
    {
        // navigate to the apply leave page
        leaveMenuElement = driver.findElement(leaveMenu);
        leaveMenuElement.click();
        applyMenuElement = driver.findElement(applyMenu);
        applyMenuElement.click();

    }

    @Owner("Abdelrhman")
    @Test(testName = "TC2-2", dependsOnMethods = "navigateApplyLeave", dataProvider = "ApplyLeave", description = "This test will apply for a leave")
    public void applyLeave(String fromDate, String toDate, String comment)
    {
        applyPage = new ApplyPage(driver);
        // date format yyyy-dd-mm
        applyPage.ApplyLeave(fromDate, toDate, comment);
        // check if the message is displayed
        Assert.assertEquals(applyPage.getMessage(),SuccessMessage);
        applyPage.closeMessage();
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-3", dependsOnMethods = "applyLeave", dataProvider = "ApplyLeave", description = "This test will apply for a leave that overlaps with another leave")
    public void applyLeaveOverlap(String fromDate, String toDate, String comment) {
        // date format yyyy-dd-mm
        applyPage.ApplyLeave(fromDate, toDate, comment);
        // check if the message is displayed
        Assert.assertEquals(applyPage.getMessage(), WarningMessage);
        applyPage.closeMessage();
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-4", dependsOnMethods = {"Login.LogainPageTest.validLoginPageTest"}, description = "This test will navigate to the my leave page")
    public void navigateMyLeave() {
        // navigate to my leave page
        myLeaveMenuElement = driver.findElement(myLeaveMenu);
        myLeaveMenuElement.click();
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-5", dependsOnMethods = {"navigateMyLeave"}, description = "This test will cancel a leave that was applied for")
    public void cancelLeave() {
        myLeavePage = new MyLeavePage(driver);
        Helper.wait(driver, 5);
        myLeavePage.cancelLeave();
        // check if the message is displayed
        Assert.assertEquals(myLeavePage.getMessage(), cancelLeaveSuccessMessage);
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-6", dependsOnMethods = {"cancelLeave"}, description = "This test will navigate to the apply leave page")
    public void navigateApplyLeaveAfterCancel() {
        // navigate to the apply leave page
        applyMenuElement = driver.findElement(applyMenu);
        applyMenuElement.click();
    }

    @Owner("Abdelrhman")
    @Test(testName = "TC-7", dependsOnMethods = {"navigateApplyLeaveAfterCancel"}, dataProvider = "ApplyLeave", description = "This test will apply for a leave that overlaps with another leave that is canceled")
    public void applyLeaveOverlapAfterCancel(String fromDate, String toDate, String comment) {
        // date format yyyy-dd-mm
        applyPage.ApplyLeave(fromDate, toDate, comment);
        // check if the message is displayed
        Assert.assertEquals(applyPage.getMessage(), SuccessMessage);
        applyPage.closeMessage();
    }

}
