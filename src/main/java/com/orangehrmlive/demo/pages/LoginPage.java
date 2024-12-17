package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='app']/div[1]/div/div[1]/div/div[2]/h5")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]")
    WebElement errorMessage;

    public void enterUsername(String uName){
        sendTextToElement(userName,uName);
        log.info("Enter Username : " + userName.toString());
    }

    public void enterPassword(String pass) {
        sendTextToElement(password,pass);
        log.info("Enter Password : " + password.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click On Login Button : " + loginButton.toString() );
    }

    public String verifyLoginTextDisplay(){
        return getTextFromElement(loginText);
    }

    public String verifyErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
