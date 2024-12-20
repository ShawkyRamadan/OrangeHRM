package Pages.PIM;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
    WebDriver ReportsDriver;

    By Reports = By.xpath("//a[contains(text(), 'Reports')]");
    By SearchButton = By.xpath("//button[@type='submit']");
    By ReportName = By.xpath("//input[@name='reportName']");
    By ResetButton = By.xpath("//div[@class='oxd-form-actions']/button[@type='button']");

    WebElement SearchButtonElement;
    WebElement ResetButtonElement;

    WebElement ReportButtonElement;

    public ReportsPage(WebDriver driver) {
        this.ReportsDriver = driver;
    }

    public void NavigateToReportPage() {
        ReportButtonElement = ReportsDriver.findElement(Reports);
        Helper.click(ReportButtonElement);
    }

    public void searchReports(String ReportName){
        SearchButtonElement = ReportsDriver.findElement(this.ReportName);
        Helper.click(SearchButtonElement);
        SearchButtonElement = ReportsDriver.findElement(SearchButton);
        Helper.click(SearchButtonElement);
    }

    public void clickOnResetButton() {
        ResetButtonElement = ReportsDriver.findElement(ResetButton);
        Helper.click(ResetButtonElement);
    }




}
