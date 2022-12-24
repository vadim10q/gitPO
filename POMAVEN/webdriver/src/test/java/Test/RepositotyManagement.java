package Test;

import Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RepositotyManagement
{
    protected WebDriver driver;
    protected static final  String USER_NAME =  "com-user-automation";
    @BeforeMethod()
    public void SetUp()
    {
        driver = DriverSingleton.getDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void stopBrowser()
    {
        DriverSingleton.closeDriver();
    }
}
