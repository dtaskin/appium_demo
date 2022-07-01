package utils;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver() throws Exception {

       DesiredCapabilities caps = new DesiredCapabilities();
       URL url = new URL("http://127.0.0.1:4723/wd/hub/");

       caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "android");
       caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4");
       caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
       driver = new RemoteWebDriver(url, caps);

    return driver;

    }
}
