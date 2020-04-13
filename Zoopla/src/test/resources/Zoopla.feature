Feature: Zoopla 

Description: Automation of Zoopla website.

Scenario: Zoopla website validation
Given User  Opens Browser
When User goes to Zoopla website
Then User able to close coockies

Scenario: User is able to signin
Given User  Opens Browser
When User goes to Zoopla website
Then User able to close coockies
When User enters username
And User enters password
And User clicks sign in
Then User is signed in 
When User enters in search
Then User clicks to  search
And User able to close pop up
Then User find all price
And User able to select fifth property     
Then  User able to verify logo
And User able to verify agent name                                                                                                                                                                                                                                                                   
Then User able to verify phone number
And User able to sign out















