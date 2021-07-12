package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeHeadersPage extends BasePageAbstractTemplate {

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]")
    WebElement headerBar;
    String headerBarXPath = "//div[contains(@id, 'schwab_header')]";

    @FindBy(xpath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Offer')]//a")
    WebElement whatWeOffer;
    String whatWeOfferXPath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Offer')]//a";

    @FindBy(xpath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Charge')]//a")
    WebElement whatWeCharge;
    String whatWeChargeXPath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Charge')]//a";

    @FindBy(xpath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'Why Schwab')]//a")
    WebElement whySchwab;
    String whySchwabXPath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'Why Schwab')]//a";

    @FindBy(xpath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'Insights')]//a")
    WebElement insights;
    String insightsXPath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'Insights')]//a";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//div[@class = 'meganv-logo-wrapper col-1']//a[contains(@aria-label, 'Charles Schwab Logo')]")
    WebElement schwabLogo;
    String schwabLogoXPath = "//div[contains(@id, 'schwab_header')]//div[@class = 'meganv-logo-wrapper col-1']//a[contains(@aria-label, 'Charles Schwab Logo')]";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//a[contains(text(), 'Find a Branch') and @id = 'meganv-util--wide--FindaBranch']")
    WebElement findABranch;
    String findABranchXPath = "//div[contains(@id, 'schwab_header')]//a[contains(text(), 'Find a Branch') and @id = 'meganv-util--wide--FindaBranch']";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//a[contains(text(), 'Contact Us') and @role = 'menuitem']")
    WebElement contactUs;
    String contactUsXPath = "//div[contains(@id, 'schwab_header')]//a[contains(text(), 'Contact Us') and @role = 'menuitem']";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//div[@class = 'meganv-main__searchbox']//input[@type = 'text' and @aria-label = 'Search field']")
    WebElement searchBox;
    String searchBoxXPath = "//div[contains(@id, 'schwab_header')]//div[@class = 'meganv-main__searchbox']//input[@type = 'text' and @aria-label = 'Search field']";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//a[contains(text(), 'Log In') and @aria-haspopup = 'true']")
    WebElement login;
    String loginXPath = "//a[contains(text(), 'Log In') and @aria-haspopup = 'true']";

    @FindBy(xpath = "//div[contains(@id, 'schwab_header')]//li//div//a[contains(text(), 'Open an Account')]")
    WebElement openAnAccount;
    String openAnAccountXPath = "//div[contains(@id, 'schwab_header')]//li//div//a[contains(text(), 'Open an Account')]";

    public HomeHeadersPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
        super(driver,  currentTestFromInitDrPgsAndUtilsClass,  extentReportGeneratorFromInitDrPgsAndUtilsClass,  scenario);
    }


    public WebElement getPageValidationElement(){
        return headerBar;
    }
    public String getPageValidationElementXPath(){
        return headerBarXPath;
    }
    public WebElement getHeaderBar() {
        return headerBar;
    }
    public String getHeaderBarXPath() {
        return headerBarXPath;
    }
    public WebElement getWhatWeOffer() {
        return whatWeOffer;
    }
    public String getWhatWeOfferXPath() {
        return whatWeOfferXPath;
    }
    public WebElement getWhatWeCharge() {
        return whatWeCharge;
    }
    public String getWhatWeChargeXPath() {
        return whatWeChargeXPath;
    }
    public WebElement getWhySchwab() {
        return whySchwab;
    }
    public String getWhySchwabXPath() {
        return whySchwabXPath;
    }
    public WebElement getInsights() {
        return insights;
    }
    public String getInsightsXPath() {
        return insightsXPath;
    }
    public WebElement getSchwabLogo() {
        return schwabLogo;
    }
    public String getSchwabLogoXPath() {
        return schwabLogoXPath;
    }
    public WebElement getFindABranch() {
        return findABranch;
    }
    public String getFindABranchXPath() {
        return findABranchXPath;
    }
    public WebElement getContactUs() {
        return contactUs;
    }
    public String getContactUsXPath() {
        return contactUsXPath;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public String getSearchBoxXPath() {
        return searchBoxXPath;
    }
    public WebElement getLogin() {
        return login;
    }
    public String getLoginXPath() {
        return loginXPath;
    }
    public WebElement getOpenAnAccount() {
        return openAnAccount;
    }

    public String getOpenAnAccountXPath() {
        return openAnAccountXPath;
    }
    public void validatePageIsOpen(){
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatWeOfferXPath, 0));
    }
}
