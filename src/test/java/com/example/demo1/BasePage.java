package com.example.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected WebDriver _driver;
    protected String _url;
    private WebDriverWait _wait;

    public BasePage(WebDriver driver){
        this._driver = driver;
        this._wait = new WebDriverWait(_driver, TIMEOUT, POLLING);
        //lazy loading is cool
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    protected void waitForElementToAppear(By locator){
        _wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void switchTabs(){
        ArrayList<String> tabs2 = new ArrayList<String> (_driver.getWindowHandles());
        _driver.switchTo().window(tabs2.get(1));
    }
}
