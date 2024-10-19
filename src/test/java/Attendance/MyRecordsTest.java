package Attendance;

import BaseTest.BaseTest;
import Pages.Attendance.MyRecordsPage;
import Pages.NavBar.Navbar;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyRecordsTest extends BaseTest {
    MyRecordsPage myRecordsPage;
    Navbar navbar;

    @BeforeTest
    public void setUpMyRecords()
    {
        super.setUp();
    }

    @Test(dependsOnMethods = "Login.LoginPageTest.validLoginPageTest")
    public void navigateToMyRecords(){
        myRecordsPage = new MyRecordsPage(driver);
        navbar = new Navbar(driver);
        navbar.navigateTime();
        myRecordsPage.navigateToMyRecords();
    }







}
