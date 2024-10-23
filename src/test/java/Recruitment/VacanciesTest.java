package Recruitment;

import BaseTest.BaseTest;
import Pages.NavBar.Navbar;
import Pages.Recruitment.VacanciesPage;
import io.qameta.allure.Owner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VacanciesTest extends BaseTest
{
    VacanciesPage vacanciesPage;
    Navbar navbar;

    @Owner("Maria")
    @Test(dependsOnMethods = "Login.LoginPageTest.validLoginPageTest")
    public void navigateToVacanciesPage(){
        vacanciesPage = new VacanciesPage(driver);
        navbar = new Navbar(driver);
        navbar.navigateRecruitment();
        vacanciesPage.navigateToVacanciesPage();
    }
}
