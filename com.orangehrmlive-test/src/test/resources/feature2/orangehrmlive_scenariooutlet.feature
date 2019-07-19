@loginversion_2
Feature: Login  as admin/hr 
	As a user, I want to login to OrangeHrm Website
	when I provide username and password
	
Background: 
	Given I am on the orangehrm webpage 
	
Scenario Outline: Login as a Admin/hr version two 
	When I login with "<username>" and "<password>"in the username textbox 
	Then I should be able to verify that I am logged in 
	
Examples:
|	username	|	password	|
|	admin   	|	admin123	|
|	Malala123   |	malala321	|				