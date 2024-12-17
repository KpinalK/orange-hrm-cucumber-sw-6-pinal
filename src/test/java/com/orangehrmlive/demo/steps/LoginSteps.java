package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I enter the Username")
    public void iEnterTheUsername() {
        new LoginPage().enterUsername("Admin");
    }

    @And("I enter the password")
    public void iEnterThePassword() {
        new LoginPage().enterPassword("admin123");
    }

    @And("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see Dashboard Message")
    public void iShouldSeeDashboardMessage() {
        String expectedMessage = "Dashboard";
        Assert.assertEquals(new DashboardPage().verifyDashboardMessageDisplayed(),expectedMessage,"Message not displayed");
    }

    @Then("I should see Logo is Displayed")
    public void iShouldSeeLogoIsDisplayed() {
        new DashboardPage().verifyLogoIsDisplayed();
    }

    @And("I click on user Profile Logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().userProfileLogo();
    }

    @And("I mouse hover on Logout and click")
    public void iMouseHoverOnLogoutAndClick() {
        new DashboardPage().clickOnLogout();
    }

    @Then("I should see the text Login panel is Displayed")
    public void iShouldSeeTheTextLoginPanelIsDisplayed() {
      String expectedText = "Login";
      Assert.assertEquals(new LoginPage().verifyLoginTextDisplay(),expectedText,"Text Login panel is not Displayed");
    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("I should see error message {string}")
    public void iShouldSeeErrorMessage(String errorMessage) {
    Assert.assertEquals(new LoginPage().verifyErrorMessage(),errorMessage,"Error message not displayed");
    }
}
