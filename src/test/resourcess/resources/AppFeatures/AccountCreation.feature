Feature: Login Scenarios

Scenario: FINANCIALLEASE.NL APP FUNCTIONAL AUTOMATION
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab

######CREATE ACCOUNT###
######Cancel Account Creation####
When the user clicks Account aanmaken
Then the user is in the Account Creation screen
When the user clicks back button
Then the user is in the App profile tab
When the user clicks Account aanmaken
Then the user is in the Account Creation screen
#######Incorrect Username Error Message#####
When the user enter new account id "AppIsWorkingGood##"
And the user clicks Doorgaan
Then the user should receive the error message for invalid email
######Valid Email and Password####
When the user enter new account id "kalai.neelamegam+t142@financiallease.nl"
And the user clicks Doorgaan
When the user enter password "Apple#2024"
And the user clicks Doorgaan