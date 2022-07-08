package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import scripts.Base;

public class TryCarFinderPage extends BasePage {
    public TryCarFinderPage(){
        super();
    }

    // Common locators
    @FindBy(css = "div[data-qa='headline']")
    public WebElement whatIsMostImportantToYouText;

    @FindBy(css = "div[data-qa='sub-heading']")
    public WebElement selectUpTo4Text;

    //Web Locators

    //Mobile locators
}
