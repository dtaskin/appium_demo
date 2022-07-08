package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoLoanCalculatorPage extends BasePage{
    public AutoLoanCalculatorPage(){
        super();
    }

    //common locators

    @FindBy(css = "input[name='vehiclePrice']")
    public WebElement costOfCarIWantInputBox;

    @FindBy(id = "creditBlock")
    public WebElement creditScoreDropDown;

    @FindBy(css = "option[label='Excellent: 780']")
    public WebElement excellentCreditOption;

    @FindBy(name = "loanTerm")
    public WebElement loanTermDropDown;

    @FindBy(css = "option[label='60 Months']")
    public WebElement loanTermOption;

    @FindBy(name = "downPayment")
    public WebElement downPaymentInputBox;

    @FindBy(css = ".loan-calculator-display-value")
    public WebElement loanCalculatorDisplayValue;

    //web locators

    //mobile locators

}
