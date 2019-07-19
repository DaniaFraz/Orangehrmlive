@logindatadriven
Feature: Valid registration of employee Account by Admin

Background: 
Given I am on the orangehrm webpage 

Scenario: Employee Registration 

When I login as a admin/hr 
And I register Employee Account 
	|	Ariana	|	Wills	|	Grace123!	|	arianawill123	|	arianawill123	|
	|	Sara	|	josh	|	Grace123!!	|	sara123			|	sara123			|
Then Employee accounts are activiated and ready for further use

#With header
@Login_dataTable_withheadder
Scenario: Employee Registration with header

When I login as a admin/hr 
And I register Employee Account with header
	|	fname	|	lastname|	username	|	password	|	confirmpassword |
	|	Ariana	|	Wills	|	Grace123!	|	arianawill123	|	arianawill123	|
	|	Sara	|	josh	|	Grace123!!	|	sara12312		|	sara12312		|
Then Employee accounts are activiated and ready for further use	