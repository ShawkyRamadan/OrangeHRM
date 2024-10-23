package Pages.Dashboard;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    //Driver
    WebDriver dashboardDriver;

    //Locators
    By attendanceCardWidget = By.xpath("//div[@class='orangehrm-dashboard-widget-body --scroll-visible']/div[@class='orangehrm-attendance-card']");
    By myActionsToDoListWidget = By.xpath("//div[@class='orangehrm-todo-list']");
    By quickLaunchIcons = By.xpath("//div[@class='oxd-grid-3 orangehrm-quick-launch']");
    By distributionByLocationChart = By.xpath("//div[@class='oxd-pie-chart']/canvas[@id='eLGmBBdH']");

    //Elements
    WebElement attendanceCardWidgetElement;
    WebElement myActionsToDoListWidgetElement;
    WebElement quickLaunchIconsElement;
    WebElement distributionByLocationChartElement;

    //Constructor
    public DashboardPage(WebDriver driver) { dashboardDriver = driver; }

    //Methods
    public void navigateToDashboardPage()
    {
        // Navigate to dashboard widget
        attendanceCardWidgetElement = dashboardDriver.findElement(attendanceCardWidget);
        Helper.click(attendanceCardWidgetElement);
        myActionsToDoListWidgetElement = dashboardDriver.findElement(myActionsToDoListWidget);
        Helper.click(myActionsToDoListWidgetElement);
        quickLaunchIconsElement = dashboardDriver.findElement(quickLaunchIcons);
        Helper.click(quickLaunchIconsElement);
        distributionByLocationChartElement = dashboardDriver.findElement(distributionByLocationChart);
        Helper.click(distributionByLocationChartElement);
    }

}

