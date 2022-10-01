@F1
Feature: Verify User is able to login.
	@smoke
	Scenario: Check if User is able to Login with Correct ID and Password.
	Given User Opens "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User Enters UserName "Admin"
	And User Enters Passoword "admin123"
	Then User Clicked Login Button
	@sanity
	Scenario: Check if User is not able to Login with inorrect ID and Password.
	Given User Opens "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
	And User Enters UserName "Admin125"
	And User Enters Passoword "admin123"
	Then User Clicked Login Button