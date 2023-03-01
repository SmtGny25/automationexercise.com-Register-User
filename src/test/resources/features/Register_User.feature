Feature: automationexercise.com - Register User

  Scenario: Validate Successful SignUp "Enter Account Information"
    Given I access the Automation Exercise website homepage
    When I click on SingupLogin button
    And I enter a name user name
    And I enter a email "smtgny000@mail.com"
    And I click Signup
    Then I should see submission on the page that opened
    When I click Mr. Button
    And I fill a name "smtgny000"
    And I fill a password
    And I fill a date
    And I fill a month
    And I fill a year
    And I click the Sign up for our newsletter!
    Then I click the Receive special offers from our partners!
    When I enter First Name "someat"
    And I enter Last Name "Goodbash"
    And I enter Company "Someat-Goodbash"
    And I enter address "America"
    And I enter address 2 "America"
    And I enter Country "United States"
    And I enter State "New Jersey"
    And I enter City "Trenton"
    And I enter Zipcode "08601"
    And I enter Mobile Number "+1111111111111111"
    And I click to Create Account Button
    Then I should be presented signup message " Account Created"
    When I click to "Continue" Button
    Then I should be presented Logged in as
    When I click on Delete Acoount button
    Then I should be presented delete account message "Acoount Deleted"
