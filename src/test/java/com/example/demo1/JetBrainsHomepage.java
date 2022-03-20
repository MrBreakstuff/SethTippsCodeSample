package com.example.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JetBrainsHomepage extends BasePage {

    public JetBrainsHomepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.wt-button_mode_primary")
    public WebElement seeAllToolsButton;

    @FindBy(css = "nav > [data-test-marker=\"Developer Tools\"]")
    public WebElement toolsMenu;

    @FindBy(css = "[data-test='site-header-search-action']")
    public WebElement searchButton;

    @FindBy(css = "[data-test='search-input']")
    public WebElement searchField;

    @FindBy(css = "button[data-test='full-search-button']")
    public WebElement submitButton;

    @FindBy(css = "input[data-test='search-input']")
    public WebElement searchPageField;

    @FindBy(css = ".main-submenu__content")
    public WebElement menuPopup;
}
