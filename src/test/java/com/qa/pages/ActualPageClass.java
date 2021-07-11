package com.qa.pages;

import com.aventstack.extentreports.ExtentTest;
import com.qa.appUtilFiles.ActionExecutor;
import com.qa.appUtilFiles.ExceptionHandling;
import com.qa.utilFiles.coreCodeUtilFiles.ExtentReportGenerator;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActualPageClass extends somePageTemplate{

    //this constructor calls the super class constructor

    public ActualPageClass(WebDriver driver, ExtentTest currentTestFromInitDrPgsAndUtilsClass, ExtentReportGenerator extentReportGeneratorFromInitDrPgsAndUtilsClass, Scenario scenario){
        super(driver,  currentTestFromInitDrPgsAndUtilsClass,  extentReportGeneratorFromInitDrPgsAndUtilsClass,  scenario);
    }

    @FindBy(xpath = "//")
    WebElement sampleElement;
    String sampleElementXPath = "//";


}
