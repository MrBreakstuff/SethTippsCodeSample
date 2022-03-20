package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest {

    private WebDriver driver;
    protected ChromeOptions options;

    public BaseTest(WebDriver driver){
        this.driver = driver;
    }

    @BeforeSuite
    public void beforeSuite(){
        ChromeDriverManager.chromedriver();
        options = new ChromeOptions();
            options.addArguments("start-maximized", "disable-infobars");
            
    }

    @AfterSuite
    public void afterSuite(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
