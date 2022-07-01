package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarvanaHomePage {
    public CarvanaHomePage(AndroidDriver<AndroidElement> androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }



    @FindBy(xpath = "div[data-qa='styled-hamburger']")
    public WebElement sandwichMenuButton;

    @FindBy(xpath = "/html/body/div[7]/div/div/div[2]/div/div[7]/div/a")
    public WebElement carFinderLink;
}
