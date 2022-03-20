package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlexusHomepage extends BasePage {

    public PlexusHomepage(WebDriver driver) {
        super(driver);
        _url = "https://plexusworldwide.com";
    }

    @FindBy(css = ".banner-text[_ngcontent-app-root-c13]")
    public WebElement bannerText;

    @FindBy(css = ".banner-link[_ngcontent-app-root-c13]")
    public WebElement bannerLink;
}
