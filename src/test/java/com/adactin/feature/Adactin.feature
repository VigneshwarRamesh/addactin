Feature: LOg in Fuctionality for Adactin Application

Scenario: User enter username and password 
    Given User launch the application 
    When User enter "Vigneshwar" as username
    And User enter "Ch#77777" as password
    Then Verify the valid username and valid password 
    
 Scenario: User enter the Search Hotel
     Given User to ennte the search hotels details 
     When User to select the location as "New York"
     And User to select the hotel "Hotel Sunshine"
     And User to select the room type "Double"
     And User to enter the checkin date "13/02/2021"
     And User to enter the checkout date "15/02/2021"
     And User to select adult per room "1 - One"
     And User to select chiid per room "2 - Two"
     Then User to verify the entered values and search
     
     Scenario: User selects the hotel
    Given User selects the hotel
    When User chooses the selected hotel
    And User Chooses the hotel and clicks it
    Then User gives continue
    
    
Scenario: User books the hotel
    Given User books the hotel
    When User enters "Vigneshwar" as first name
    And User enters "Ramesh" as last name
    And User enters Billing address as "No 7/4 ramaswamy Garden adyar Chennai 600020"
    And User enters Credit card number as "4578485625456258"
    And User selects the credit card type
    And User selects the expiry month of the credit card
    And User selects the expiry year of the credit card
    And User enters the CVV number as "222"
    Then User finalizes everything and gives book now
    
Scenario: User logs out from the site
    Given User logs out from the site
    When User logs out from the hotel booking app
    And User clicks log out button
    Then User comes out from the app