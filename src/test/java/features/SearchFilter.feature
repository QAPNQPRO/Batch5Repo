@F2
Feature: Verify user is able to Search mobiles.
	@smoke
	Scenario: Check if user is able to search "Iphone 14"
	Given user opens url "https://www.flipkart.com"
	Then user search "IPhone 14"
	And User clicks search button
	@sanity
	Scenario: Check if user is able to search "Samsung s22"
	Given user opens url "https://www.flipkart.com"
	Then user search "Samsung s22"
	And User clicks search button  