package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarvanaHomePage extends BasePage{
    public CarvanaHomePage(){
        super(); // its extending to basePage so its using its super class
    }

    //Web locators
    @FindBy(css = "a[data-cv-test='headerCarFinderLink']")
    public WebElement carFinderLink;

    @FindBy(css = "a[data-cv-test='headerTradesLink']")
    public WebElement sellTradeLink;

    @FindBy(css = "a[data-cv-test='headerFinanceDropdown']")
    public WebElement financeLink;

    @FindBy(css = "a[data-cv-test='headerFinanceLoanCalc']")
    public WebElement financeLoanCalculatorLink;


    //Mobile Locators
    @FindBy(css = "div[data-qa='styled-hamburger']>svg")
    public WebElement hamburgerMenu;

    @FindBy(css = "a[data-cv-test='headerMobileCarFinderLink']")
    public WebElement carFinderMobileLink;

    @FindBy(css = "a[data-cv-test='headerMobileTradesLink']")
    public WebElement sellTradeMobileLink;

    @FindBy(css = "a[data-cv-test='headerMobileFinanceDropdown']")
    public WebElement financeMobileLink;

    @FindBy(css = "a[data-cv-test='headerMobileFinanceLoanCalc']")
    public WebElement financeLoanCalculatorMobileLink;


}