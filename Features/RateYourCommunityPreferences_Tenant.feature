Feature: Rate Your Community Preferences
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Building for Rate Your Community Preferences
Then click on Gate&Arc for Rate Your Community Preferences
Then click on Rate Your Community Preferences
And click on Rental Price
And click on Lease Flexibility
And click on Maintenance Standards
And click on Building Facilities
And click on Office Size and Quality of Finishes
And click on Neighborhood and Surrounding Area
And click on Cost of Utility
Then click on submit Rate Your Community Preferences