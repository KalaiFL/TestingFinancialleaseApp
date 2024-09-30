Feature: Create Quote Request

Scenario: Create Quote Request

########SalesForceAcceptance Login######
When the user open the "https://financiallease--accept.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Ffinanciallease--accept.sandbox.lightning.force.com%252Flightning%252Fo%252FWeb_Activity__c%252Flist%253FfilterName%253D00B1n000008vbmyEAA"
Then the user enters username as "kalai.neelamegam@financiallease.nl.accept"
Then the user enters password as "Antwoord123#"
When the user clicks submitlogin button

#####ConvertLeadIntoOpportunity####
When the user clicks Zoeken textbox
Then the user enter the zoeken text "Nvhvjv"
And the user navigated to the correct webactivity
#When the user clicks Lead "Cristian Grosu"
When the user convert the Lead into Opportunity
And the Opportunity is created
Then the leaseAdvisor creates an empty BankRequest
