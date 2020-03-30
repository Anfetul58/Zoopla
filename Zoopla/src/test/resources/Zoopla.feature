Feature: Zoopla 

Description: Automation of Zoopla website.

Scenario: Zoopla website validation

Given User  Opens Browser
When User goes to Zoopla website
Then Zoopla website loads


Scenario: User able to signin
Given User on webpage
When User enters email
Then User enters password
And User clicks signin
Then User able to signin

Scenario: User able to search
Given User is signed in
