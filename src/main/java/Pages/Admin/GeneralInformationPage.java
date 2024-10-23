package Pages.Admin;

import TestHelpers.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralInformationPage
{
    // Driver
    WebDriver GeneralInformationDriver;

    // Locators
    By Admin = By.xpath("//a[@class='oxd-main-menu-item active']");

    /* User Management Page */
    By UserManagement = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent --visited']");
    By Users = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']");
    By Username = By.xpath("//div//div//div//div//div//div//div//input[@class='oxd-input oxd-input--active']");
    By UserRole = By.xpath("");
    By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By Status = By.xpath("");
    By ResetButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
    By SearchButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By AddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By EditIcon = By.xpath("");
    By DeleteIcon = By.xpath("");

    /* Jobs Page */
    By Jobs = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']");
    By JobTitles = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Job Titles')]");
    By PayGrades = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Pay Grades')]");
    By EmploymentStatus = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Employment Status')]");
    By JobCategories = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Job Categories')]");
    By WorkShifts = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Work Shifts')]");

    /* Organization Page */
    By Organization = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']//span[contains(text(),'Organization')]");
    By GeneralInformation = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'General Information')]");
    By EditButton = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-left']");
    By OrganizationName = By.xpath("//div[./label[normalize-space(text())='Organization Name']]/following-sibling::div/input");
    By RegistrationNumber = By.xpath("//div[./label[normalize-space(text())='Registration Number']]/following-sibling::div/input");
    By TaxID = By.xpath("//div[./label[normalize-space(text())='Tax ID']]/following-sibling::div/input");
    By Phone = By.xpath("//div[./label[normalize-space(text())='Phone']]/following-sibling::div/input");
    By Fax = By.xpath("//div[./label[normalize-space(text())='Fax']]/following-sibling::div/input");
    By Email = By.xpath("//div[./label[normalize-space(text())='Email']]/following-sibling::div/input");
    By AddressStreet1 = By.xpath("//div[./label[normalize-space(text())='Address Street 1']]/following-sibling::div/input");
    By AddressStreet2 = By.xpath("//div[./label[normalize-space(text())='Address Street 2']]/following-sibling::div/input");
    By City = By.xpath("//div[./label[normalize-space(text())='City']]/following-sibling::div/input");
    By State = By.xpath("//div[./label[normalize-space(text())='State/Province']]/following-sibling::div/input");
    By Zip = By.xpath("//div[./label[normalize-space(text())='Zip/Postal Code']]/following-sibling::div/input");
    By Country = By.xpath("//div[./label[contains(text(), 'Country')]]/following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
    By CountryOption = By.xpath("//span[contains(text(), 'Egypt')]");
    By Notes = By.xpath("//textarea");
    By SaveButton = By.xpath("//button[@type='submit']");
    By Locations = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Locations')]");
    By Structure = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Structure')]");

    /* Qualifications Page */
    By Qualifications = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    By Skills = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Skills')]");
    By Education = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Education')]");
    By Licenses = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Licenses')]");
    By Languages = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Languages')]");
    By Memberships = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Memberships')]");

    /* Nationalities Page */
    By Nationalities = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'Nationalities')]");

    /* Corporate Branding Page */
    By CorporateBranding = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'Corporate Branding')]");

    /* Configuration Page */
    By Configuration = By.xpath("//span[@class='oxd-topbar-body-nav-tab-item' and contains(text(),'Configuration')]");
    By EmailConfiguration = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Email Configuration')]");
    By EmailSubscriptions = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Email Subscriptions')]");
    By Localization = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Localization')]");
    By LanguagePackages = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Language Packages')]");
    By Modules = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Modules')]");
    By SocialMediaAuthentication = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Social Media Authentication')]");
    By RegisterOAuthClient = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'Register OAuth Client')]");
    By LDAPConfiguration = By.xpath("//a[@class='oxd-topbar-body-nav-tab-link' and contains(text(),'LDAP Configuration')]");

    // Elements
    WebElement UserManagementElement;
    WebElement UsersElement;
    WebElement UsernameElement;
    WebElement UserRoleElement;
    WebElement JobsElement;
    WebElement JobTitlesElement;
    WebElement PayGradesElement;
    WebElement EmploymentStatusElement;
    WebElement JobCategoriesElement;
    WebElement WorkShiftsElement;
    WebElement OrganizationElement;
    WebElement GeneralInformationElement;
    WebElement EditButtonElement;
    WebElement OrganizationNameElement;
    WebElement RegistrationNumberElement;
    WebElement TaxIDElement;
    WebElement PhoneElement;
    WebElement FaxElement;
    WebElement EmailElement;
    WebElement AddressStreet1Element;
    WebElement AddressStreet2Element;
    WebElement CityElement;
    WebElement StateElement;
    WebElement ZipElement;
    WebElement CountryElement;
    WebElement NoteElement;
    WebElement SaveButtonElement;
    WebElement LocationsElement;
    WebElement StructureElement;
    WebElement QualificationsElement;
    WebElement SkillsElement;
    WebElement EducationElement;
    WebElement LicensesElement;
    WebElement LanguagesElement;
    WebElement MembershipsElement;
    WebElement NationalitiesElement;
    WebElement CorporateBrandingElement;
    WebElement ConfigurationElement;
    WebElement EmailConfigurationElement;
    WebElement EmailSubscriptionsElement;
    WebElement LocalizationElement;
    WebElement LanguagePackagesElement;
    WebElement ModulesElement;
    WebElement SocialMediaAuthenticationElement;
    WebElement RegisterOAuthClientElement;
    WebElement LDAPConfigurationElement;
    WebElement UserRoleMenuElement;
    WebElement EmployeeNameElement;
    WebElement StatusMenuElement;
    WebElement ResetButtonElement;
    WebElement SearchButtonElement;
    WebElement AddButtonElement;
    WebElement DeleteIconElement;
    WebElement EditIconElement;

    // Constructors
    public GeneralInformationPage(WebDriver driver)
    {
        GeneralInformationDriver = driver;
    }

    // Methods
    public void NavigateToUsersPage()
    {
        OrganizationElement = GeneralInformationDriver.findElement(Organization);
        Helper.click(OrganizationElement);
        GeneralInformationElement = GeneralInformationDriver.findElement(GeneralInformation);
        Helper.click(GeneralInformationElement);
    }

    private void SelectUsername()
    {
        UsernameElement = GeneralInformationDriver.findElement(Username);
        Helper.click(UsernameElement);
    }

    private void ClickEditButton ()
    {
        EditButtonElement = GeneralInformationDriver.findElement(EditButton);
        Helper.click(EditButtonElement);
    }


}