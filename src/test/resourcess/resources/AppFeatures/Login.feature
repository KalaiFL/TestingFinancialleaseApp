Feature: Login Scenarios

Scenario: FINANCIALLEASE.NL APP FUNCTIONAL AUTOMATION
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab

######Close Button on Login Page########
When the user clicks login button
Then the user is in the login screen
When the user clicks back button
Then the user is in the App profile tab
When the user clicks login button
#######Incorrect Username Error Message#####
When the user enter username "AppIsWorkingGood##"
And the user clicks Doorgaan
Then the user should receive the error message
######Valid Credentials#######
When the user enter username "kalai.neelamegam+t25@financiallease.nl"
And the user clicks Doorgaan
When the user enter password "Apple#2024"
When the user clicks Wachtwoord weergeven button
Then the password is visible to the user "Apple#2024"
When the user clicks Wachtwoord verbergen button
Then the password is hashed to the user "••••••••••"
And the user clicks Doorgaan
And the user navigates to profile tab
#When the user clicks on the Uitloggen button
