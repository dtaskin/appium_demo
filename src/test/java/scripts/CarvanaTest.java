package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waiter;

public class CarvanaTest extends Base{

    /*
    Scenario: Validate Carvana logo
    Given user is on "https://www.carvana.com/"
    Then validate the logo of the "Carvana" is displayed
     */

    @Test(priority = 1, description = "Validate Carvana logo")
    public void validateCarvanaLogo(){
//        Waiter.waitForVisibilityOfElement(driver,carvanaHomePage.mobileLogo,5);
        if(isMobile) Assert.assertTrue(carvanaHomePage.mobileLogo.isDisplayed());
        else Assert.assertTrue(carvanaHomePage.webLogo.isDisplayed());
    }
}