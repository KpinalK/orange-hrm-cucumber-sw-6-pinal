package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectUserRole;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='No Records Found']")
    WebElement resultList;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFound;

    @CacheLookup
    @FindBy(css = "div[class='oxd-table-card-cell-checkbox'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkbox;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(xpath = "//div[@role='document']")
    WebElement popUp;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement okAlert;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successFull;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement noRecordFound;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    public void selectRole(String key){
        mouseHoverToElementAndClick(selectUserRole);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select Role : " + selectUserRole.toString());
    }

    public void setUserName(String uname){
        sendTextToElement(userName,uname);
        log.info("Select user : " + userName.toString());
    }

    public void selectStatus(String key){
        mouseHoverToElementAndClick(selectStatus);
        typeKeysAndEnter(key.split("")[0]);
        log.info("Select status : " + selectStatus.toString());
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
        log.info("Click On Search Button : " + searchButton.toString());
    }

    public String verifyUserInResultList(){
        return getTextFromElement(resultList);
    }

    public void clickOnCheckbox(){
        clickOnElement(checkbox);
        log.info("Click On Checkbox : " + checkbox.toString());
    }

    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
        log.info("Click On Delete Button : " + deleteButton.toString());
    }

    public void popUpDisplay(){
        verifyThatElementIsDisplayed(popUp);
        log.info("popUp Display : " + popUp.toString());
    }

    public void clickOkOnPopUP(){
        clickOnElement(okAlert);
        log.info("Click Ok On PopUP : " + okAlert.toString());
    }

    public String verifyDeleteUserSuccessfulMessage(){
       return getTextFromElement(successFull);
    }

    public void enterEmployeeName(String eName){
        sendTextToElement(employeeName,eName);
        log.info("Enter EmployeeName : " + employeeName.toString());
    }

    public String verifyOneRecordFound(){
        return getTextFromElement(noRecordFound);
    }

    public void clickOnResetButton(){
        clickOnElement(resetButton);
        log.info("Click On Reset Button : " + resetButton);
    }
}
