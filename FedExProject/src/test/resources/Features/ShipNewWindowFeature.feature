Feature: Verify Shipping page feature


  Scenario: As a user I should verify Shipping page feature
  
    Given user navigate the url
    
    When click on return pkg
    And scroll and click on create shipping label
    And Input your name and receipent name
    And click on continue 
    Then shows error msg