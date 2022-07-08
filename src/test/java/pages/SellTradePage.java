package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellTradePage extends BasePage{
    public SellTradePage(){
        super();
    }

    //common locators
    @FindBy(className = "sc-4ef54ea5-6")
    public WebElement getARealOfferIn2MinutesText;

    @FindBy(className = "sc-4ef54ea5-17")
    public WebElement wePickUpYourCarText;

    @FindBy(css = "button[data-cv-test='VINToggle']")
    public WebElement vinButton;

    @FindBy(css = "input[aria-labelledby='VIN']")
    public WebElement vinInputBox;

    @FindBy(css = "button[data-cv-test='heroGetMyOfferButton']")
    public WebElement getMyOfferButton;

    @FindBy(className = "sc-fTFLOO")
    public WebElement weCoulntFindThatVinText;

    //web locators

    //mobile locators
}
