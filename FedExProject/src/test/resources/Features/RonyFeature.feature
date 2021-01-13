Feature: Verify price quotes and available options for shipments


Scenario: As a user I should be able to find price options for shipments.


Given user navigate the url


When User clicks on Rate & Ship
And Input from and to 
And click on checkbox
And Selects packaging option from drop-down list.
And Selects number of pkg , lb 
And Inserts length weight height per packagee
And Selects ship-date from drop-down list
And Click Show Rates
Then FedEx Retails rates shows