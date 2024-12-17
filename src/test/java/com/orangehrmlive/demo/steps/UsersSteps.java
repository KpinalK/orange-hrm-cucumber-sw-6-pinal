package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UsersSteps {
    @And("I click on the Admin tab")
    public void iClickOnTheAdminTab() {
        new DashboardPage().clickOnAdminTab();
    }

    @And("I should see System Users Text")
    public void iShouldSeeSystemUsersText() {
       String expectedText = "System Users";
        Assert.assertEquals(new AdminPage().verifySystemUsersText(),expectedText,"System users text not displayed");
    }

    @And("I click on the Add button")
    public void iClcickOnTheAddButton() {
        new AdminPage().clickOnAddButton();
    }

    @And("I should see Add Users text")
    public void iShouldSeeAddUsersText() {
        String expectedText = "Add User";
        Assert.assertEquals(new AddUserPage().verifyAddUserText(),expectedText,"Text not displayed");
    }

    @And("I select user role {string}")
    public void iSelectUserRole(String userRole) {
        new AddUserPage().selectRoleAdmin(userRole);
    }

    @And("I enter the Employee name {string}")
    public void iEnterTheEmployeeName(String employeeName) {
        new AddUserPage().enterEmployeeName(employeeName);
    }

    @And("I enter {string}")
    public void iEnter(String username) {
        new AddUserPage().enterUserName(username);
    }

    @And("I select the status {string}")
    public void iSelectTheStatus(String status) {
        new AddUserPage().selectStatus(status);
    }

    @And("I enter password")
    public void iEnterPassword() {
        new AddUserPage().enterPassword("pinal1234");
    }

    @And("I enter the confirm password")
    public void iEnterTheConfirmPassword() {
        new AddUserPage().enterConfirmPassword("pinal1234");
    }

    @And("I click on the Save Button")
    public void iClickOnTheSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("I should see the message Successfully Saved")
    public void iShouldSeeTheMessageSuccessfullySaved() {
        String expectedMessage = "Successfully Saved";
        Assert.assertEquals(new AddUserPage().verifyAddUserSuccessfulMessage(),expectedMessage,"Message not displayed");
    }


    @And("I enter the {string}")
    public void iEnterThe(String username) {
        new ViewSystemUsersPage().setUserName("Raghav");
    }

    @And("I select User Role")
    public void iSelectUserRole() {
        new ViewSystemUsersPage().selectRole("Admin");
    }

    @And("I select the status")
    public void iSelectTheStatus() {
        new ViewSystemUsersPage().selectStatus("Enabled");
    }

    @And("I click on the Search Button")
    public void iClickOnTheSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I should see the User should be in the Result list")
    public void iShouldSeeTheUserShouldBeInTheResultList() {
        String expectedResult = "No Records Found";
        Assert.assertEquals(new ViewSystemUsersPage().verifyUserInResultList(),expectedResult,"Record not found");
    }

    @And("I click on Check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckbox();
    }

    @And("I click on Delete Button")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @And("I see Popup will display")
    public void iSeePopupWillDisplay() {
        new ViewSystemUsersPage().popUpDisplay();
    }

    @And("I click on the Ok Button on the Popup")
    public void iClickOnTheOkButtonOnThePopup() {
        new ViewSystemUsersPage().clickOkOnPopUP();
    }

    @Then("I should see the message Successfully Deleted")
    public void iShouldSeeTheMessageSuccessfullyDeleted() {
        String expectedMessage = "Successfully Deleted";
        Assert.assertEquals(new ViewSystemUsersPage().verifyDeleteUserSuccessfulMessage(),expectedMessage,"Message not displayed");
    }


    @And("I enter the Username {string}")
    public void iEnterTheUsername(String username) {
        new ViewSystemUsersPage().setUserName(username);
    }

    @And("I select the user role {string}")
    public void iSelectTheUserRole(String userRole) {
        new ViewSystemUsersPage().selectRole(userRole);
    }

    @And("I enter Employee name {string}")
    public void iEnterEmployeeName(String employeeName) {
        new ViewSystemUsersPage().enterEmployeeName(employeeName);
    }

    @And("I select status {string}")
    public void iSelectStatus(String status) {
        new ViewSystemUsersPage().selectStatus(status);
    }

    @Then("I should see the message \\({int}) Record Found")
    public void iShouldSeeTheMessageRecordFound(int one) {
        String expectedResult = "(1) Record Found";
        Assert.assertEquals(new ViewSystemUsersPage().verifyOneRecordFound(),expectedResult,"no record found");
    }

    @And("I see username {string}")
    public void iSeeUsername(String username) {
       new ViewSystemUsersPage().setUserName(username);
    }

    @And("I click on the Reset Tab")
    public void iClickOnTheResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}
