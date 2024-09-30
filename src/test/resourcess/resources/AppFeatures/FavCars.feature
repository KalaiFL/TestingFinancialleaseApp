Feature: Save Fav Cars

Scenario: Save Fav Cars

######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab

#######Navigate to Bewaard screen without login####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
Then the user should be able to see Account aanmaken and login option
When the user clicks login button
Then the user is in the login screen

#######Valid Login with Notification#####
When the user enter username "kalai.neelamegam+t25@financiallease.nl"
And the user clicks Doorgaan
When the user enter password "Apple#2024"
And the user clicks Doorgaan
And the user navigates to profile tab
When the user clicks Bewaard icon

####Selecting Product to Add to Wishlist####
When the user navigates to zoeken tab
And the user closes the App update popup
When the user clicks Merk and Model tab
Then the user enter merk value "Iveco"
Then the user enter model value "Daily"
When the user clicks Opslaan
Then the choosen values added to the field "Iveco"
Then the choosen values added to the field "1"
When the user clicks Bekijk button

#####Add Product to Wishlist#####
When the user add car to favlist "Iveco Daily - 35S18 Automaat L2H2 LED ACC Navi Camera 12m3 Airco"
Then the car is added to Fav car

######Verify Product added to Wishlist#####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
Then the user verifies that the car is added to fav list "Iveco Daily"

#######Remove the added Product from Favcarlist####
When the user remove the product from favlist "Iveco Daily"
Then the user cancel the deletion attempt
When the user remove the product from favlist "Iveco Daily"
When the user clicks verwijderen
Then the user should receive notification for successful deletion