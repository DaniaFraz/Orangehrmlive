@Delete_User_test3 
Feature: Delete employee as a Admin/hr 

Background:
Given  I am on the orangehrmlive webpage

Scenario: Delete employee as a Admin/hr 
	Given I am on the orangehrm webpage 
	When  I input username in the username textbox 
	And   I input password into password textbox 
	And   I click on Login Button 
	And   I go to PIM tab from menu 
	And   I check the checkbox assoicated with employee 
	And   I click on delete button 
	Then  employee should be deleted