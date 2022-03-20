package com.example.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JetBrainsHomepageTest extends BaseTest {

    public WebDriver driver;
    private JetBrainsHomepage jetBrainsHomepage;

    public JetBrainsHomepageTest(WebDriver driver){
        super(driver);
    }
    
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(options);
        jetBrainsHomepage = new JetBrainsHomepage(getDriver());
        driver.get(jetBrainsHomepage._url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        jetBrainsHomepage.searchButton.click();
        jetBrainsHomepage.searchField.sendKeys("Selenium");
        jetBrainsHomepage.submitButton.click();

        assertEquals(jetBrainsHomepage.searchPageField.getAttribute("value"), "Selenium");
    }

    @Test
    public void toolsMenu() {
        JetBrainsHomepage jetBrainsHomepage = new JetBrainsHomepage(getDriver());

        jetBrainsHomepage.toolsMenu.click();
        
        assertTrue(jetBrainsHomepage.menuPopup.isDisplayed());
    }

    @Test
    public void navigationToAllTools() {
        JetBrainsHomepage jetBrainsHomepage = new JetBrainsHomepage(getDriver());
        jetBrainsHomepage.seeAllToolsButton.click();

        WebElement productsList = driver.findElement(By.id("products-page"));
        assertTrue(productsList.isDisplayed());
        assertEquals(driver.getTitle(), "All Developer Tools and Products by JetBrains");
    }
}
