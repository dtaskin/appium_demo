package scripts;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pages.CarvanaHomePage;
import utils.Driver;

import java.net.MalformedURLException;

public class Base {

    AndroidDriver androidDriver;
    WebDriver driver;
    CarvanaHomePage carvanaHomePage;


    @BeforeMethod
    public void setup() throws Exception {
        driver = Driver.getDriver();
        carvanaHomePage = new CarvanaHomePage(androidDriver);
    }
}
