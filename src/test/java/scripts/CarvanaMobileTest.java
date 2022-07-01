package scripts;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waiter;

import java.net.URL;

public class CarvanaMobileTest {

    @Test(priority = 1)
    public void testCarFinderMenuItem() throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "My_New_Pixel_Device");
        caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        //caps.setCapability("appPackage", "com.android.chrome");
        //caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        URL url = new URL("http://127.0.0.1:4723/wd/hub/");

        //BROWSER TESTING FOR WEB APPLICATION BUT ON MOBILE DEVICES
        WebDriver driver = new RemoteWebDriver(url, caps);

        driver.get("https://www.carvana.com");
        driver.get("https://www.carvana.com");
        Thread.sleep(4000);
        driver.findElement((By.cssSelector("div[data-cv-test='headerMobileMenuOpen']"))).click();
        Thread.sleep(1200);

        driver.findElement((By.cssSelector("a[data-cv-test='headerMobileCarFinderLink']"))).click();
        Thread.sleep(1200);
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(),"WHAT CAR SHOULD I GET?");
        Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Car Finder can help! Answer a few quick questions to find the right car for you.");

        driver.findElement(By.cssSelector("a[data-qa='router-link']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[data-qa='headline']")).getText(),"WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[data-qa='sub-heading']")).getText(),"Select up to 4 in order of importance");

        Thread.sleep(10000);

    }
}
