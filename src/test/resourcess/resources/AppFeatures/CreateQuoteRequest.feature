Feature: Create Quote Request

Scenario: Create Quote Request
######Navigate to Login Page#######
Given the user launches the financiallease app
And the user navigates to profile tab

######App Launches in English/Translated to Dutch#####
Then the user test language translator

#######Valid Login with Notification#####
When the user clicks login button
When the user enter valid username "kalai.neelamegam+t25@financiallease.nl"
When the user enter valid password "Apple#2024"
And the user clicks login
Then the user gets Welkom Terug notification 

########SalesForceAcceptance Login######
#When the user open the "https://financiallease--accept.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Ffinanciallease--accept.sandbox.lightning.force.com%252Flightning%252Fo%252FWeb_Activity__c%252Flist%253FfilterName%253D00B1n000008vbmyEAA"
#Then the user enters username as "kalai.neelamegam@financiallease.nl.accept"
#Then the user enters password as "Antwoord123#"
#When the user clicks submitlogin button

####Selecting Product to Create a 	QuoteRequest####
When the user navigates to zoeken tab
Then the user is navigated to Home screen
When the user clicks Merk and Model tab
Then the user enter merk value "Mercedes-Benz"
Then the user enter model value "CLA-klasse"
When the user clicks Opslaan
Then the choosen values added to the field "Mercedes-Benz CLA-klasse"
Then the choosen values added to the field "2"
When the user clicks Bekijk button
When the user select the product "Mercedes-Benz CLA-Klasse - 180 Progressive Aut. [ Ambientlight Widescreen Stoelverwarming ]"


#Lease Calculator Validation####
When the user scroll to calculator
Then the price in Maandbedrag should be "362"
When the user adjust the Looptijd "48"
When the user enter invalid Aanbetaling value
When the user enter valid Aanbetaling value
Then the error message is displayed for invalid Aanbetaling "Aanbetaling mag niet hoger zijn dan €23444"
When the user enter invalid Slottermijn value
When the user enter valid Slottermijn value
Then the error message is displayed for invalid Slottermijn "Slottermijn mag maximaal €5189 zijn"




#When the user clicks Leads tab
#When the user enter the search string in salesforce acceptance "BlackEagle BEAST"
#When the user clicks the lead "BlackEagle BEAST"
#And the user convert the lead into opportunity
##Then verify the email of the lead "kalai.neelamegam+t25@financiallease.nl"