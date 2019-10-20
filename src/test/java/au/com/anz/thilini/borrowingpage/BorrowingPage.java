package au.com.anz.thilini.borrowingpage;

import au.com.anz.thilini.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by LakinduMac on 16/10/19.
 */
public class BorrowingPage extends BasePage {

    private static final String HOME_PAGE_URL = "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";

    private static final String startOverButtonCssElement = "button.start-over, div.borrow__result text--white clearfix";

    private static final String requiredErrorCssElement = "span[id=required]";

    private static final String calculateButtonCssElement = "button.btn--borrow__calculate";

    private static final String incomeFieldCssElement = "input[aria-labelledby = 'q2q1']";

    private static final String otherIncomeFieldCssElement = "input[aria-labelledby = 'q2q2']";

    private static final String expensesFieldCssElement = "input[id = 'expenses']";

    private static final String currentLoanFieldCssElement = "input[id = 'homeloans']";

    private static final String otherLoanFieldCssElement = "input[id = 'otherloans']";

    private static final String creditLimitFieldCssElement = "input[id = 'credit']";

    private static final String otherCommitmentsFieldCssElement = "input[aria-labelledby = 'q3q4']";
    
    private static final String propertyTypeCssElement = "input[id = borrow_type_home]";

    private static final String appTypeCssElement = "input[id = application_type_single]";

    private static final String dependentXPathElement = "//select[@title='Number of dependants']/option[text() = '0']";

    private static final String amoundToBorrowCssElement = "span[class='borrow__result__text__amount']";

    BorrowingPage() {
        PageFactory.initElements(driver, this);
    }

    void goToBorrowingPage() {
        driver.get(HOME_PAGE_URL);

    }

    public void addApplicationtypeSingle()
    {
        WebElement appType = findElementByCss(appTypeCssElement);
        appType.click();

        WebElement dependents = findElementByXPath(dependentXPathElement);
        dependents.click();

        WebElement property = findElementByCss(propertyTypeCssElement);
        property.click();

        WebElement income = findElementByCss(incomeFieldCssElement);
        income.sendKeys("80000");

        WebElement otherIncome = findElementByCss(otherIncomeFieldCssElement);
        otherIncome.sendKeys("10000");

        WebElement expenses = findElementByCss(expensesFieldCssElement);
        expenses.sendKeys("500");

        WebElement currentHomeLoans = findElementByCss(currentLoanFieldCssElement);
        currentHomeLoans.sendKeys("0");

        WebElement otherLoans = findElementByCss(otherLoanFieldCssElement);
        otherLoans.sendKeys("100");

        WebElement otherCommitments = findElementByCss(otherCommitmentsFieldCssElement);
        otherCommitments.sendKeys("0");

        WebElement creditCards = findElementByCss(creditLimitFieldCssElement);
        creditCards.sendKeys("10000");

        WebElement calculate = findElementByCss(calculateButtonCssElement);
        calculate.click();

        wait.waitForElementAttributeEqualsString("span[class='borrow__result__text']", "aria-live", "assertive", 10);
        Assert.assertEquals("Amount returned is not correct","$470,000", findElementText(amoundToBorrowCssElement));
    }

    public void ClearFieldValues() {
        WebElement startOverButton = driver.findElement(By.cssSelector(startOverButtonCssElement));
        startOverButton.click();

        WebElement calculate = driver.findElement(By.cssSelector(calculateButtonCssElement));
        calculate.click();

        Assert.assertEquals("Required error is not available","Required", findElementText(requiredErrorCssElement));

        Assert.assertEquals("Income field is not cleared","", findElementText(incomeFieldCssElement));

        Assert.assertEquals("Other income field is not cleared","", findElementText(otherIncomeFieldCssElement));

        Assert.assertEquals("Expenses field is not cleared","", findElementText(expensesFieldCssElement));

        Assert.assertEquals("Current home loan value not cleared","", findElementText(currentLoanFieldCssElement));

        Assert.assertEquals("Other loan value not cleared","", findElementText(otherLoanFieldCssElement));

        Assert.assertEquals("Credit card limit not cleared","", findElementText(creditLimitFieldCssElement));
    }

    public WebElement findElementByCss(String cssElement){
        return driver.findElement(By.cssSelector(cssElement));
    }

    public WebElement findElementByXPath(String xPathElement){
        return driver.findElement(By.xpath(xPathElement));
    }

    public String findElementText(String cssElement){
        return driver.findElement(By.cssSelector(cssElement)).getText();
    }
}
