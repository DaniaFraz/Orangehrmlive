@OrangeHrmtest_AddEmplyee
Feature: Login  as admin/hr 
	As a admin/HR
	I want to add a New Employee
	so that the HR & the employee can complete the boarding process.
	
	Background:
	Given  I am on the orangehrmlive webpage
Scenario: Add an employee 

	Given I am on the orangehrm webpage
	When I input username in the username textbox
	And I input password into password textbox 
	And I click on Login Button 
	And I go to PIM tab from menu 
	And I click add employee 
	And I complete the required information 
	And I save new employee data 
	And I go to PIM tab from menu 
	Then click on employee list for verification 
	
	







	
	
	