Feature: Navigate GMM
#  As an English student


Scenario: Getting to page that shows application 
	Given the user has logged into GMM 
	When the user clicks on the link for application 
	Then they should go to the page that lists their application 
	
Scenario: Create a grant application 
	Given the user is on the page to create application 
	When the user clicks on the link to create application 
	Then they should go to the page to create application