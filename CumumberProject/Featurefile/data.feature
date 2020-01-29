Feature: Login Functionality 
@data-driven 
Scenario: Login with valid credentials 
	Given Navigate to Home page 
	When user enters username and password 
	Then user logged in successfully 
@data-driven 
Scenario:
The one where user picks different product through search functionality 
	When Lalitha searches below products in the search box: 
		|Head|
		|Travel|
	Then product should be added in the cart if available
	
@user-specific
Scenario Outline: test login 
	Given Navigate to Home page 
	When user enters "<uname>" and "<pwd>" 
	Then user logged in successfully
	
Examples:
	|uname|pwd|
	|lalitha|Password123|
	|shradha|shot|