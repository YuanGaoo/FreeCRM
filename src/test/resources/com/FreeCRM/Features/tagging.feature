@FuntionalTest
Feature: Free CRM application testing 

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password 
	Given This is a valid login test 
	
	@RegressionTest
Scenario: Login with incorrect username and correct password 
	Given This is a invalid login test 
	@SmokeTest
Scenario: Create a contact 
	Given This is a connact test case 
	@SmokeTest @RegressionTest
Scenario: Create a deal 
	Given This is a deal test case 
	@SmokeTest
Scenario: Create a case 
	Given This is a tasks test case 
	@RegressionTest
Scenario: Create a tasks 
	Given This is a tasks test case 
	@RegressionTest
Scenario: Verify left panel links 
	Given This is a tasks test case 
	@SmokeTest @RegressionTest
Scenario: Search a deal 
	Given This is a search  deal test 
	@RegressionTest
Scenario: Search a contact 
	Given This is a search  contact test 
	@RegressionTest
Scenario: Search a case 
	Given This is a search  case test 
	@SmokeTest
Scenario: Search a task 
	Given This is a search  task test 
	@SmokeTest
Scenario: Search a an email 
	Given This is a search  email test 
	@SmokeTest
Scenario: Search a forms 
	Given This is a search  forms test
	@SmokeTest @EndToEnd
	Scenario: Search a report 
	Given This is a search  report test
	@EndToEnd @SmokeTest
	Scenario: application logout
	Given This is a search  logout test