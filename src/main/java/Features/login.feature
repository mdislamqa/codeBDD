Feature: Free CRM Login Feature

#WITHOUT USING EXAMPLES KEYWORD
#
Scenario: Free Login Test Scenario

Given User is already on login page

When Title of login page is Free CRM

Then User enter "naveenk" and "test@123"

Then User click on submit button
Then User is on Home page

#WITH EXAMPLES KEYWORD
#Scenario Outline: Free Login Test Scenario
#
#Given User is already on login page
#
#When Title of login page is Free CRM
#
#Then User enter "<username>" and "<password>"
#
#Then User click on submit button
#Then User is on Home page
#
#Examples:
      #| username | password | 
      #| naveenk  | test@123 |
      #| tom      | tom@123  | 
        #
      #
    