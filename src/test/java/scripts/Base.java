package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CarFinderPage;
import pages.CarvanaHomePage;
import pages.SellTradePage;
import pages.TryCarFinderPage;
import utils.ConfigReader;
import utils.Driver;
import utils.Environment;

public class Base extends Environment {

    WebDriver driver;
    String applicationURL = ConfigReader.getProperty("applicationURL");

    //Pages
    CarvanaHomePage carvanaHomePage;
    CarFinderPage carvanaCarFinderPage;
    TryCarFinderPage tryCarFinderPage;
    SellTradePage sellTradePage;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(applicationURL);
        carvanaHomePage = new CarvanaHomePage();
        carvanaCarFinderPage = new CarFinderPage();
        tryCarFinderPage = new TryCarFinderPage();
        sellTradePage = new SellTradePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}