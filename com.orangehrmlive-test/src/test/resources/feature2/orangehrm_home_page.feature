Feature: orangehrm login window 

#test Script
@homepage
Scenario: username field should be enabled 
	Given the user is on orangehrm home page 
	When the user clicks on the user input box 
	Then the user field should be enabled 