@regression
Feature: Login Test

  @smoke
  Scenario: Verify user should login successfully
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    Then I should see Dashboard Message

  @Sanity
  Scenario: Verify that the Logo display on home page
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    Then I should see Logo is Displayed


  Scenario: Verify user should Logout successfully
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    And I click on user Profile Logo
    And I mouse hover on Logout and click
    Then I should see the text Login panel is Displayed


  Scenario Outline: Verify error message with invalid credentials
    Given I am on home page
    When  I enter username "<username>"
    And I enter password "<password>"
    And I click on the Login Button
    Then I should see error message "<errorMessage>"
    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |







