package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashboard;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logo;

    @CacheLookup
    @FindBy(css = ".oxd-userdropdown-img")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminTab;



    public String verifyDashboardMessageDisplayed(){
        return getTextFromElement(dashboard);
    }

    public void verifyLogoIsDisplayed() {
        verifyThatElementIsDisplayed(logo);
        log.info("Verify Logo Is Displayed : " + logo.isDisplayed());
    }

    public void userProfileLogo() {
        clickOnElement(userProfileLogo);
        log.info("Click on User Profile Logo : " + userProfileLogo.toString());
    }

    public void clickOnLogout() {
        mouseHoverToElementAndClick(logoutButton);
        log.info("Click On Logout : " + logoutButton.toString());
    }

    public void clickOnAdminTab() {
        clickOnElement(adminTab);
        log.info("Click On Admin Tab : " + adminTab.toString());
    }
}
