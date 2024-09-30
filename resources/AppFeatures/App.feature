Feature: Login Scenarios

Scenario: FINANCIALLEASE.NL APP FUNCTIONAL AUTOMATION
######LOGIN#######
Given the user launches the financiallease app
And the user navigates to profile tab
When the user clicks login button
Then the user is in the login screen
#######Incorrect Username#####
When the user enter valid username "kalai.neelamegam+uiop@financiallease.nl"
When the user enter valid password "Apple#2023"
And the user clicks login
Then the user should get "Er bestaat geen gebruiker met het opgegeven e-mailadres."
#######Empty Username Empty Password#####
When the user enter valid username ""
When the user enter valid password ""
And the user clicks login
When the user clicks Toon button
Then the user should get "E-mailadres is verplicht"
Then the user should get "Een wachtwoord is verplicht"
#######Incorrect password####
When the user enter valid username "kalai.neelamegam+testing10@financiallease.nl"
When the user enter valid password "APPLE#2023"
And the user clicks login
#Then the user should get "Ongeldige gebruikersnaam of wachtwoord."
#######Valid Username Valid Password#####
When the user enter valid username "kalai.neelamegam+tr@financiallease.nl"
When the user enter valid password "Apple#2023"
Then the password is visible to the user "Apple#2023"
When the user clicks Verberg button
Then the password is hashed
And the user clicks login
Then the user gets Welkom Terug notification

######PASSWORD RESET######
And the user clicks on persoonlijke infromatie
When the user clicks on Bewerk option
Then the user navigated to wachtwoord wijzigen screen
When the user enter the oldpassword "Apple#2023"
When the user enter the newpassword "Apple#2023"
Then the user clicks Wachtwoord opslaan button
Then the user get notification "Wachtwoord gewijzigd"
#And the user is back to profiel tab

####FILL PERSONAL/BEDRIJF INFORMATION###
When the user clicks voeg toe of Persoonsgegevens
When the user selects Aanhef  as "Mevrouw"
When the user enters the Voornaam as "Quality"
When the user enters the Voorletters as "QA"
When the user enters the Tussenvoegsel  as "Testing"
When the user enters the Achternaam  as "Assurance"
When the user enters the Dag  as "06"
When the user enters the Maand  as "01"
When the user enters the Jaar  as "2023"
Then the user clicks Opslaan

When the user clicks voeg toe of Bedrijfsgegevens
#When the user enters Bedrijfsnaam as "Flex Testing"
#When the user enters Telefoonnummer as "0634799932"

#####LOGOUT####
#And the user navigates to profile tab
#When the user clicks on the Uitloggen button
#Then the user is in the login screen


