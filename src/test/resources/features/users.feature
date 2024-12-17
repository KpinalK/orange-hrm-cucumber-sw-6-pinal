@regression
Feature: Add User Test

  @smoke
  Scenario: Admin should add user successfully
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    And I click on the Admin tab
    And I should see System Users Text
    And I click on the Add button
    And  I should see Add Users text
    And I select user role "Admin"
    And I enter the Employee name "Ananya Dash"
    And I enter "Username"
    And I select the status "Disable"
    And I enter password
    And I enter the confirm password
    And I click on the Save Button
    Then I should see the message Successfully Saved

@sanity
  Scenario: Search the user created and verify it
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    And I click on the Admin tab
    And I should see System Users Text
    And I enter the "Username"
    And I select User Role
    And I select the status
    And I click on the Search Button
    Then I should see the User should be in the Result list


  Scenario: Verify that Admin should delete the User successfully
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    And I click on the Admin tab
    And I should see System Users Text
    And I enter the "Username"
    And I select User Role
    And I select the status
    And I click on the Search Button
    And I should see the User should be in the Result list
    And I click on Check box
    And I click on Delete Button
    And I see Popup will display
    And I click on the Ok Button on the Popup
    Then I should see the message Successfully Deleted


  Scenario Outline: search  the user and verify the message record found
    Given I am on home page
    When I enter the Username
    And I enter the password
    And I click on the Login Button
    And I click on the Admin tab
    And I should see System Users Text
    And I enter the Username "<username>"
    And I select the user role "<userRole>"
    And I enter Employee name "<employeeName>"
    And I select status "<status>"
    And I click on the Search Button
    Then I should see the message (1) Record Found
    And I see username "<username>"
    And I click on the Reset Tab
    Examples:
      | username     | userRole | employeeName  | status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwi  | Admin    | Odis Adalwin  | Enable |



