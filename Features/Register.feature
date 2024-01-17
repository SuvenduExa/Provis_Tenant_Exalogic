Feature: Registration Functionality
@sanity
Scenario: validate user able to Register 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And Click on Register button
Then Select any Choose User Type
And Click on Next button
Then Click on Community drop down
And Select any one option
Then Click on Precinct / Building drop down
And Select any one option under precinct
Then Click on Unit Number drop down
And Select any one option under unit number
And Click on Next button in unit details page
Then Enter number of Adults
And Enter number of Children
And Enter number of Senior Citizens
And Enter number of People of Determination
Then Enter Full Name
Then Enter Contact Number
Then Enter PO Box
And Enter Email Address
Then Click on Nationality dropdown
And Select any one option under Nationality drop down
Then Click on Occupation dropdown
And Select any one option Occupation dropdown
And Click on Next button in Resident detail
Then Enter Name
Then Enter Email Address
Then Enter Contact Number
Then Click on Emirate of Residence dropdown
And Select any one option of Residence dropdown
 Then Click any one option on Would you like to move in?
Then click on Tenancy Start Date
And Select anyTenancy Start Date
Then click on Tenancy End Date
And Select any Tenancy End Date
Then click on Confirmed Move-in Date
And Select any Confirmed Move-in Date 
Then Click on ID Proof/s
And Select a File in ID Proof/s
Then Click on Contract / Agreement Copy
And Select a File Contract / Agreement Copy
Then click on I accept Community Rules and Regulations
And Click on Submit button
