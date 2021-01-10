

Feature: Verify search feature 

 Background: 
   Given Fedex Homepage is launched.

  Scenario: As a user verify search button is working successfully 
  When click on search icon
  And input tracking number
  And press enter
  Then user can see error msg 