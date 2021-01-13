Feature: Verify Search icon


  Scenario: Verify Search icon
    Given user navigate the url
   
    When I click on search icon 
    And Input tracking number
    And press enter
    Then displayed error msg 
    

