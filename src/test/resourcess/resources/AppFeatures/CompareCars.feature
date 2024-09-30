Feature: Compare Cars

Scenario: Compare Cars
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab
######App Launches in English/Translated to Dutch#####
Then the user test language translator

#######Navigate to Bewaard screen without login####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
Then the user should be able to see Account aanmaken and login option
When the user clicks login button
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

#####Add Product to Wishlist#####
When the user add car to favlist "Iveco Daily - 35S18 Automaat L2H2 LED ACC Navi Camera 12m3 Airco"
Then the car is added to Fav car

######Verify Product added to Wishlist#####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
Then the user verifies that the car is added to fav list "Iveco Daily"

####Selecting another Product to Add to Wishlist####
When the user navigates to zoeken tab
When the user navigates to zoeken tab
Then the user is navigated to Home screen
When the user clicks Merk and Model tab
Then the user enter merk value "Ford"
Then the user enter model value "Transit"
When the user navigates back to the Home screen
Then the choosen values added to the field "Iveco, Ford Transit"
Then the choosen values added to the field "2"
When the user clicks Bekijk button

#####Add Product to Wishlist#####
When the user add car to favlist "Ford Transit - 130pk Automaat L3H2 Dubbel Cabine Zilvergrijs Airco Cruise 7m3 Airco Dubbel cabine Cruise control"
Then the car is added to Fav car

######Verify Product added to Wishlist#####
When the user clicks Bewaard icon
Then the user is navigated to Bewaard screen
Then the user verifies that the car is added to fav list "Volkswagen Golf"

#####Enable Vergelijken for both Products####
When the user clicks vergelijken option
Then the "selecteer nog een auto" is visible on the screen
#When the user clicks vergelijken option "Volkswagen Golf, € 268 p/m, Vergelijken"
#Then the "2 auto's geselecteerd" is visible on the screen
#When the user clicks compare option to compare cars
#Then the user is navigated to vergelijken screen

