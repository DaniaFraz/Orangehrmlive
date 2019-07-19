@MyInfo_4
Feature:  
	Add Employee Information as EmployeeAs an employeeadd the 
	employee information fields (Personal Details)to complete 
	the boarding process.
	
	Scenario: Add Employee Information 
Given I am on the orangehrm webpage 
When  I enter employee username "Malala123" 
When  I enter employee password "malala321" 
And   I click on MyInfo Tab 
When  I click on edit button
And   I complete the required fields 
Then  the boarding process is complete
