@homeTest
Feature: Login in to a website and redirect to home page
  
  
	Background: 
	Given I want to launch url
  When I click on signIn Button
	
  Scenario Outline: Check home page redirection
  And I enter "<username>" and "<password>" to application
  And I click on submit button
  When I click on whats new section
  Then I should be able to see new in womens text
  
  Examples:
  | username                   | password |
  | monika.gupta01@nagarro.com | Test@123 |