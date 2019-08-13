Feature: Free CRM Login Feature

Scenario Outline: Free Login Test Scenario

Given User is already on login page

When Title of login page is Free CRM

Then User enter "<username>" and "<password>"

And User click on submit button
And User is on Home page

Examples:
      | username | password | 
      | naveenk  | test@123 |
      | tom      | tom@123  | 
        
      
    