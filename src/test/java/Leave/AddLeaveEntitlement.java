package Leave;

import BaseTest.BaseTest;
import Pages.Leave.AddLeaveEntitlementPage;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddLeaveEntitlement extends BaseTest {
    AddLeaveEntitlementPage addLeaveEntitlementPage;

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
        addLeaveEntitlementPage = new AddLeaveEntitlementPage(driver);
        addLeaveEntitlementPage.navigateLeave();
        addLeaveEntitlementPage.navigateAddLeaveEntitlement();
    }

    @Owner("Abdelrhman")
    @Test(  testName = "TC-8",
            dependsOnMethods = "navigateAddLeaveEntitlement",
            description = "This test will add a leave entitlement for all employees"
    )
    public void addLeaveEntitlement()
    {
        addLeaveEntitlementPage.addLeaveEntitlement("20");
        // check if the message is displayed
        Assert.assertTrue(addLeaveEntitlementPage.getMessage().contains(SuccessMessage), "The message is not displayed");
        addLeaveEntitlementPage.closeMessage();
    }


}
