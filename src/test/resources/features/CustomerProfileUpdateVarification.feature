Feature: Customer Profile Update Feature

Scenario: Login as an Customer
Given I am in landing page http://it.microtechlimited.com
When I Click on Login menu
And Click on Customer Login
Then Enter User Id as "david@gmail.com"          
And I Enter Password as "1234"
And I Click on Login Button
Then Verify that I am in CUSTOMER Home Page
Then I will click My Profile
Then I will click update info
Then I see "Update Customer Info" page
And I update contact
And I update address
Then I click submit button
Then I will click refresh url
Then I will see updated contact
Then I will see updated address
