Feature: Login Scenarios

Scenario: FINANCIALLEASE.NL APP FUNCTIONAL AUTOMATION
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab

#######Valid Login with Notification#####
When the user clicks login button
When the user enter username "kalai.neelamegam+t25@financiallease.nl"
And the user clicks Doorgaan
When the user enter password "Apple#2024"
And the user clicks Doorgaan
And the user navigates to profile tab

####LEASEREQUESTS####
When the user clicks LeaseRequests option
#Then the user is in the alle aanvragen screen
And the user closes the App update popup
Then the user should get "Je hebt geen lopende aanvragen"
And the user clicks back button in the alle aanvragen screen
When the user click Profile button

######Edit Details in Persoonsgegevens######
When the user clicks Persoonsgegevens Aanpassen
###EmptySubmission###
When the user Remove the existing value and submit the empty persoonsgegevens form
Then the user should get error message for all mandatory fields
###InvalidTelefoonNumber###
When the user edit value of Telefoonnumber as "8888"
Then the user should get error message for invalid Telefoonnumber "Telefoonnummer is te kort"
###InvalidDataSubmission###
When the user edit value for date of birth "56" "25" "2050"
Then the user should get error message for invalid data
###ValidDataSubmission###
When the user enter valid data in all mandatory fields "Vrouw" "BlackEagle" "BE" "BEAST" "0684799932" "21" "06" "1993"
Then the user should receive the notification Opgeslagen


 ######Edit Details in Bedrijfsgegevens######
When the user clicks Bedrijfsgegevens Aanpassen
###EmptySubmission###
When the user Remove the existing value and submit the empty Bedrijfsgegevens form
Then the user should get error message for all mandatory fields in Bedrijfsgegevens form
###validDataSubmission###
When the user edit value of kvk as "97979797"
Then the user should receive the notification Opgeslagen
And the user is navigated back to Profile section

###CONTACTUS SCREEN####
When the user clicks Contact us option
Then the contact options are visible on the screen
When the user click sluit button

####FAQ SCREEN#####
When the user clicks FAQ Option
Then the user navigates to FAQ screen
When the user clicks back arrow of FAQ screen

###FEEDBACK#####
When the user clicks on the feedback form
And the user clicks Versturen
###Empty Submission##
Then the user should get error message for empty submission
###Cancel Feedback Screen###
And the user is navigated back from feedback screen
####Valid Feedback Submission##
When the user clicks on the feedback form
Then the user enters valid feedback "The app is working super Fast"
And the user clicks Versturen
When the user clicks sluit button

###LANGUAGETRANSLATOR####
###Switch Language from English to Dutch####
#Given the user is using the app in English
#When the user selects the Dutch language option
#Then the app language switches to Dutch
####Switch Language from Dutch to English####
#Given the user is using the app in Dutch
#When the user selects the English language option
#Then the app language switches to English
####Close Button on Language Popup####
#And the user clicks close button
#Then the user test language translator

###PRIVACYPOLICY####
When the user clicks privacy policy option
Then the user is navigated to privacy policy webpage
And the user is navigated back to profile tab
###TERMSOFUSE###
When the user clicks TermsOfUse options
Then the user is navigated to Terms policy webpage
And the user is navigated back to profile tab

#####LOGOUT####
#And the user navigates to profile tab
#When the user clicks on the Uitloggen button
#Then the Inloggen option is available to the user

#####ACCOUNT DELETION#####
When the user click Profile button
When the user clicks on account deletion option
#Then the account deletion popup appears on the screen
###Cancel Account Deletion####
When the user clicks close button of Account deletion
Then the user is navigated back to persoonlijke informatie screen
When the user clicks on account deletion option
When the user clicks Toon button
#####Incorrect Current Password####
When the user enter the password "Apple#29"
Then the user clicks Account Deletion button
Then the user should get "Onjuist wachtwoord"
#####Correct Current Password####
#When the user enter the password "Apple#2024"
#When the user clicks Verberg button
#Then the password is hashed "••••••••••"
#Then the user clicks Account Deletion button
#Then the user is navigated back to persoonlijke informatie screen


