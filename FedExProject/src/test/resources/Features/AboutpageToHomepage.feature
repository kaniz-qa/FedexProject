Feature: Back about page to home page feature  



Scenario: As a user , I can able to go back from about page to hame page

 Given user navigate the url
 When scroll end of the page and click on aboutFedex link
 And click on see full story button and go back 
 Then user should be see home page 