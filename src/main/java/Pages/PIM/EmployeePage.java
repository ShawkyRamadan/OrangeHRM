package Pages.PIM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage {

    WebDriver EmployeeDriver;
    By FirstName = By.xpath("//input[@name='firstName']");
    By MiddleName = By.xpath("//input[@name='middleName']");
    By LastName = By.xpath("//input[@name='lastName']");

    WebElement FirstNameElement ;
    WebElement MiddleNameElement ;
    WebElement LastNameElement ;

    public EmployeePage(WebDriver driver) {
        EmployeeDriver = driver;
    }


}
