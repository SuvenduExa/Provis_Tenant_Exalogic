Feature: MoveinWithinBuilding
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on myRequest on MoveinWithinBuilding
Then Click on myservice on MoveinWithinBuilding
Then Click on service dropdown on MoveinWithinBuilding 
And Click on MoveinWithinBuilding under Select a Service drop down
Then Click on Community drop down under MoveinWithinBuilding
And Select any one option Under Community on MoveinWithinBuilding
Then Click on Precinct drop down on MoveinWithinBuilding
And Select any one option under precinct on MoveinWithinBuilding
Then Click on Unit Number drop down on MoveinWithinBuilding
And Select any one option under unit number on MoveinWithinBuilding
Then click on next btn
Then Enter number of Adults "2"
And Click on NextButton 
Then click on Next button on Emergency Contact page
Then Click on Tenancy Start Date on Occupancy Details page
And Select one date in Tenancy Start Date
Then Click on Tenancy End Date on Occupancy Details page
And Select one date in Tenancy End Date
Then Click on Confirmed Move-in Date on Occupancy Details page
And Select one date in Confirmed Move-in Date
And Enter Time Slot for Lift Booking "11:40"
Then give your ID Proofs "C:\Users\Suvendu\Downloads\\images.png"
Then give your Contract Agreement Copy "C:\\Users\\Suvendu\\Downloads\\images.png"
Then click on Rules and Regulations check box
Then Click on SubmitButtn