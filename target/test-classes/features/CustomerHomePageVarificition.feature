Feature: Verify Customer Login Functionality

  @smoke
Scenario Outline: Verify Customer Login functionality happy path
Given I am in landing page http://it.microtechlimited.com
When I Click on Login menu
And Click on Customer Login
Then Enter User Id as "david@gmail.com"          
And I Enter Password as "1234"
And I Click on Login Button
Then Verify that I am in CUSTOMER Home Page