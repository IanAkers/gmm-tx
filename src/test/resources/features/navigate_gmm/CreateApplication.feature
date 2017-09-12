Feature: Navigate GMM
#  As an English student

Background:
	Given the user has logged into GMM

Scenario: Getting to page that shows application 
	When the user clicks on the sidebar link for application 
	Then they should see the page that lists their application 
	
Scenario: Create a grant application 
	When the user is on the page that shows applications 
	And the user clicks on the link to create application 
	Then they should see the page to enter application data
	
Scenario: Enter application data 
	Given the user has entered all application data
	When the user hits the button to save
	Then they should see the confirmation page	
