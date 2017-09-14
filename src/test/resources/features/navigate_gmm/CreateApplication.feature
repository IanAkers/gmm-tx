Feature: Navigate GMM
#  As an English student

Background:
    Given the user has logged into GMM

#Scenario: Getting to page that shows application
#    When the user clicks on the sidebar link for application
#    Then they should see the page that lists their application

Scenario: Create a grant application 
	When the user clicks on the sidebar link for application
    And the user clicks on the link to create application
    Then the user should see the page to select the grant type
    When the user selects the grant type
    And the user hits the submit button
    Then the user should see the page to enter application data
	When the user enters the general information
    And the user enters the grant information
    And the user enters the address information
    And the user hits the button
    Then the user should see the confirmation page
	
															#Scenario: Create a grant application 
															#    When the user is on the page that shows applications 
															#    And the user clicks on the link to create application 
															#    Then they should see the page to select the grant type
															#    
															#Scenario: Select grant type 
															#    When the user is on the page that asks for grant type 
															#    And the user selects grant type from pulldown list    
															#    Then the user sees the page to enter application data
#Scenario: Enter application data
#    When the user enters the general information
#    And the user enters the grant information
#    And the user enters the address information
#    And the user hits the button
#    Then the user should see the confirmation page
