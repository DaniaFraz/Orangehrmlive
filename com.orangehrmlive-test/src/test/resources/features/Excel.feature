@Excel
Feature: Valid registration of Employees Account by Admin/HR

Background:
Given  I am on the orangehrmlive webpage

Scenario: Employee Registration
When I login as a Admin/Hr
And I register Employee Account
Then Employee accounts are created and ready for further use