package com.example.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PlexusHomepageTest extends BaseTest {

    public WebDriver driver;
    private PlexusHomepage plexusHomepage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        plexusHomepage = new PlexusHomepage(getDriver(driver));
        driver.get(plexusHomepage._url);
        plexusHomepage.waitForElementToAppear(By.cssSelector(".header-logo[_ngcontent-app-root-c14]"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkBannerText() {
        assertEquals(plexusHomepage.bannerText.getText(), "Sign up today for only $9.95!");
    }

    @Test
    public void checkBannerLinkContent() {
        plexusHomepage.bannerLink.click();
        plexusHomepage.switchTabs();
        PlexusJoinPage joinPage = new PlexusJoinPage(getDriver(driver));
        assertTrue(joinPage.focusImage.isDisplayed(), "Expected image not displayed");
    }
}
