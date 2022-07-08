package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarFinderPage extends BasePage{
    public CarFinderPage(){
        super();
    }

    //Locators common both for mobile and web
    @FindBy(tagName = "h1")
    public WebElement mainHeader;

    @FindBy(tagName = "h3")
    public WebElement subHeader;

    @FindBy(css = "div.leftSide>h1")
    public WebElement whatCarShouldIGetText;

    @FindBy(tagName = "h3")
    public WebElement carFinderCanHelpText;

    @FindBy(css = "a[data-qa='router-link']")
    public WebElement tryCarFinderLink;



    //Web locators


    //Mobile locators


}