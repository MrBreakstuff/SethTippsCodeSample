package com.example.demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver getDriver(WebDriver driver){
        return driver;
    }
}
