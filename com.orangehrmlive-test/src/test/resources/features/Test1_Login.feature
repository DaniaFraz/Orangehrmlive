@login_1
Feature: Login  as admin/hr

	As a user, I want to login to OrangeHrm Website
	when I provide username and password
	
Background: 
	Given I am on the orangehrm webpage 
	
Scenario: Login as a Admin/hr version one 
When I login as a admin/hr 
Then I should be able to verify that I am logged in 

Scenario: Login as a Admin/hr version two
When I input username in the username textbox
And I input password into password textbox
And I click on Login Button 
Then I should be able to verify that I am logged in 

