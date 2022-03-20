package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlexusJoinPage extends BasePage {

    public PlexusJoinPage(WebDriver driver) {
        super(driver);
        _url = "https://join.plexusworldwide.com/";
    }

    @FindBy(css = "div.slide-container__image.sub.mb-4")
    public WebElement focusImage;
}
