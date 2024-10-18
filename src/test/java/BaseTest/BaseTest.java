package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public void setUp() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }
    }

    @AfterSuite(alwaysRun = true)  // AfterSuite ensures this is called after all tests are done
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Quit the driver after all tests are complete
            driver = null;
        }
    }
}

