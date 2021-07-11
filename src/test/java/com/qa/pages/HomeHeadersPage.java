package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomeHeadersPage extends BasePageAbstractTemplate {

    //this constructor calls the super class constructor

    @FindBy(xpath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Offer')]")
    WebElement whatWeOffer;
    String whatWeOfferXPath = "//nav[contains(@id, 'primary-navigation')]//ul//li[contains(@aria-label, 'What We Offer')]";

    public HomeHeadersPage(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
        super(driver,  currentTestFromInitDrPgsAndUtilsClass,  extentReportGeneratorFromInitDrPgsAndUtilsClass,  scenario);
    }

    public WebElement getPageValidationElement(){
        return whatWeOffer;
    }
    public String getPageValidationElementXPath(){
        return whatWeOfferXPath;
    }
    public WebElement getWhatWeOffer() {
        return whatWeOffer;
    }
    public String getWhatWeOfferXPath() {
        return whatWeOfferXPath;
    }

    public void validatePageIsOpen(){
        Assert.assertNotNull(exceptionHandling.combinedStaleAndIsElementDisplayedHandling(driver, whatWeOfferXPath, 0));
    }
}
