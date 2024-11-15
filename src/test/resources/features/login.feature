@loginTest
Feature: Login in to a website

	Background: 
	Given I want to launch url
  When I click on signIn Button
	
  Scenario Outline: Login in to an application
  And I enter "<username>" and "<password>" to application
  And I click on submit button
  Then I should be redirect to homepage
  
  Examples:
  | username                   | password |
  | monika.gupta01@nagarro.com | Test@123 |
  
  #Scenario Outline: Login in to an application with invalid username and password
    #And I enter "<username>" and "<password>" to application
    #And I click on submit button
    #Then I should get "<ErrMsg>"
#
    #Examples: 
      #| username                   | password   | ErrMsg                                                                                                      |
      #| monika@nagarro.com         | Test@123   | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
      #| monika.gupta01@nagarro.com | Test@12345 | The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
