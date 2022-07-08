package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waiter;

public class CarvanaTest extends Base {

    /*
    Scenario = Validate Carvana home page title and url
    Given user is on "https://www.carvana.com/"
    Then validate title equals to "Carvana | Buy & Finance Used Cars Online | At Home Delivery"
    And validate url equals to "https://www.carvana.com/"
     */

    @Test(priority = 1, description = "Validate Carvana home page title and url")
    public void validateCarvanaHomePageTitleAndURL() {
        Assert.assertEquals(driver.getTitle(), "Carvana | Buy & Finance Used Cars Online | At Home Delivery");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/");
    }
     /*
    Scenario: Validate Carvana logo
    Given user is on "https://www.carvana.com/"
    Then validate the logo of the "Carvana" is displayed
     */

    @Test(priority = 2, description = "Validate Carvana logo")
    public void validateCarvanaLogo() {
        if (isMobile) Assert.assertTrue(carvanaHomePage.mobileLogo.isDisplayed());
        else Assert.assertTrue(carvanaHomePage.webLogo.isDisplayed());
    }

    /*
    Scenario: Validate CAR FINDER menu item
    Given user is on “https://www.carvana.com/”
    When user clicks on “CAR FINDER” menu item
    Then user should be navigated to “https://www.carvana.com/help-me-search/”
    And user should see “WHAT CAR SHOULD I GET?” text
    And user should see “Car Finder can help! Answer a few quick questions to find the right car for you.” text
    And user should see “TRY CAR FINDER” link
    When user clicks on “TRY CAR FINDER” link
    Then user should be navigated to “https://www.carvana.com/help-me-search/qa”
    And user should see “WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?” text
    And user should see “Select up to 4 in order of importance” text
    */

    @Test(priority = 3, description = "Validate CAR FINDER menu item")
    public void ValidateCarFinderMenuItem() {
        if (isMobile) {
            carvanaHomePage.hamburgerMenu.click();
            Waiter.waitForVisibilityOfElement(driver, carvanaHomePage.carFinderMobileLink, 5);
            carvanaHomePage.carFinderMobileLink.click();
        } else carvanaHomePage.carFinderLink.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/help-me-search/");
        Assert.assertEquals(carvanaCarFinderPage.whatCarShouldIGetText.getText(), "WHAT CAR SHOULD I GET?");
        Assert.assertEquals(carvanaCarFinderPage.carFinderCanHelpText.getText(), "Car Finder can help! Answer a few quick questions to find the right car for you.");
        Assert.assertTrue(carvanaCarFinderPage.tryCarFinderLink.isDisplayed());

        carvanaCarFinderPage.tryCarFinderLink.click();
        Waiter.waitForVisibilityOfElement(driver, tryCarFinderPage.whatIsMostImportantToYouText, 5);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/help-me-search/qa");
        Assert.assertEquals(tryCarFinderPage.whatIsMostImportantToYouText.getText(), "WHAT IS MOST IMPORTANT TO YOU IN YOUR NEXT CAR?");
        Assert.assertEquals(tryCarFinderPage.selectUpTo4Text.getText(), "Select up to 4 in order of importance");

    }
    /*
    Scenario: Validate SELL/TRADE invalid vin search
    Given user is on “https://www.carvana.com/”
    When user clicks on “SELL/TRADE” menu item
    Then user should be navigated to “https://www.carvana.com/sell-my-car”
    And user should see “GET A REAL OFFER IN 2 MINUTES” text
    And user should see “We pick up your car. You get paid on the spot.” text
    When user clicks on “VIN” button
    And user enters vin number as “12345678912345678”
    And user clicks on “GET MY OFFER” button
    Then user should see “We couldn’t find that VIN. Please check your entry and try again.” text
     */

    @Test(priority = 4, description = "Validate SELL/TRADE invalid vin search")
    public void ValidateSellTradeInvalidVinSearch() {
        if (isMobile) {
            carvanaHomePage.hamburgerMenu.click();
            Waiter.waitForVisibilityOfElement(driver, carvanaHomePage.sellTradeMobileLink, 5);
            carvanaHomePage.sellTradeMobileLink.click();
        } else carvanaHomePage.sellTradeLink.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.carvana.com/sell-my-car");
        Assert.assertEquals(sellTradePage.getARealOfferIn2MinutesText.getText(), "GET A REAL OFFER IN 2 MINUTES");
        Assert.assertEquals(sellTradePage.wePickUpYourCarText.getText(), "We pick up your car. You get paid on the spot.");
        sellTradePage.vinButton.click();
        sellTradePage.vinInputBox.sendKeys("00000000000000000");
        sellTradePage.getMyOfferButton.click();
        Waiter.waitForVisibilityOfElement(driver,sellTradePage.weCoulntFindThatVinText,10);
        Assert.assertEquals(sellTradePage.weCoulntFindThatVinText.getText(), "We couldn’t find that VIN. Please check your entry and try again.");

    }


}