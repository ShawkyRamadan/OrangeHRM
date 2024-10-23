package Pages.Attendance;

import Pages.NavBar.Navbar;
import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyRecordsPage {
    // Driver
    WebDriver myRecordsDriver;

    // Locators
    By attendanceMenu = By.xpath("//span[contains(text(),'Attendance ')]");
    By myRecordAttendance = By.xpath("//a[contains(text(),\"My Records\")]");
    By attendanceDate = By.xpath("//div[@class='oxd-date-input']/input[@class='oxd-input oxd-input--active']");
    By viewButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By tableData = By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']");

    // Elements
    WebElement attendanceMenuElement;
    WebElement myRecordAttendanceElement;
    WebElement attendanceDateElement;
    WebElement viewButtonElement;
    List<WebElement> tableDataElements;

    // Constructor
    public MyRecordsPage(WebDriver driver) {
        myRecordsDriver = driver;
    }

    // Methods
    public void navigateToMyRecords(){
        attendanceMenuElement = myRecordsDriver.findElement(attendanceMenu);
        Helper.click(attendanceMenuElement);
        myRecordAttendanceElement = myRecordsDriver.findElement(myRecordAttendance);
        Helper.click(myRecordAttendanceElement);

    }

    public void enterAttendanceDate(String date){
        attendanceDateElement = myRecordsDriver.findElement(attendanceDate);
        Helper.sendKeys(attendanceDateElement, date);
        //attendanceDateElement.sendKeys(date);
    }

    public void clickOnViewButton(){
        viewButtonElement = myRecordsDriver.findElement(viewButton);
        Helper.click(viewButtonElement);
        //viewButtonElement.click();
    }

    public int getTableDataSize(){
        tableDataElements = myRecordsDriver.findElements(tableData);
        return tableDataElements.size();
    }

}
