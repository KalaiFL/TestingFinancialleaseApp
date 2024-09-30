Feature: Search Query

Scenario: Search Query
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab
######App Launches in English/Translated to Dutch#####
Then the user test language translator

#######Navigate to Bewaard screen without login####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
When the user clicks zoekopdrachten tab
#Then the user should be able to see Account aanmaken and login option
When the user clicks login button in the zoekopdrachten tab
Then the user is in the login screen

#######Valid Login with Notification#####
When the user enter valid username "kalai.neelamegam+t25@financiallease.nl"
When the user enter valid password "Apple#2024"
And the user clicks login
Then the user gets Welkom Terug notification

####Selecting Product to Add to Wishlist####
When the user navigates to zoeken tab
Then the user is navigated to Home screen
When the user clicks Merk and Model tab
Then the user enter merk value "Iveco"
Then the user enter model value "Daily"
When the user clicks Opslaan
Then the choosen values added to the field "Iveco"
Then the choosen values added to the field "1"
When the user clicks Bekijk button


#####Create SearchQuery####
When the user clicks Bewaar zoekopdracht option
When the user clicks Opslaan
Then the button text updated to "Bewaard als Iveco"

####Update SearchQueryName####
When the user clicks "Bewaard als Iveco"
And the user update the search query name "SearchQuery1"
When the user clicks Opslaan
Then the button text updated to "Bewaard als Iveco"

####Enable Notification for Search Query####
When the user clicks "Bewaard als Iveco"
And the user enable the toggle for notifications
And the user select the notification option as "Wekelijks"
When the user clicks Opslaan

###Verify the selected option for Notificaiton###
When the user clicks Bewaard icon
When the user clicks zoekopdrachten tab
When the user clicks on created searchquery "Iveco"
When the user clicks "Bewaard als Iveco"
Then the user verify the option selected is "week"

####Delete Created Search Query####
When the user clicks zoekopdracht verwijderen
Then the created search query is deleted
When the user is navigated back to Bewaard screen
Then verify that the created search query is deleted

####Selecting Product to Add to Wishlist####
When the user navigates to zoeken tab
Then the user is navigated to Home screen
When the user clicks Merk and Model tab
Then the user enter merk value "Tesla"
Then the user enter model value "Model 3"
When the user clicks Opslaan
Then the choosen values added to the field "Tesla"
Then the choosen values added to the field "1"
When the user clicks Bekijk button

#####Create SearchQuery####
When the user clicks Bewaar zoekopdracht option
When the user clicks Opslaan
Then the button text updated to "Bewaard als Tesla"

When the user clicks Bewaard icon
When the user clicks zoekopdrachten tab
When the user clicks delete icon for "Tesla" search query

