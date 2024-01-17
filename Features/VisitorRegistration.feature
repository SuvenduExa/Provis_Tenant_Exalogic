Feature: VisitorRegistration

Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Request on VisitorRegistration
Then Click on My Service on VisitorRegistration
Then click on Select a Service drop down on VisitorRegistration
And click on Visitor Registration
Then Enter Visitor Name "Suvendu"
And Enter Visitor Mobile Number "50 478 9012"
And Enter Visitor Email "subha123@gmail.com"
Then Click on Visitor Type drop down
And click any one option on Visitor Type drop down
Then Click on Choose button on Visitor ID Proof
#And Select Visitor ID Proof
Then Click on Community drop down
And Click any one Community
Then Click on Precinct drop down
And Click any one Precinct
Then Click on Unit Number drop down
And Click any one Unit Number
Then Click on Check In Date
And Click any Date from Check In Date Calender
Then Click on Check In Time picker
And Select Time
Then Click on Expected Check Out Date
And Click any Date from Expected Check Out Date Calender
Then Enter text on Additional Notes "Testing Provis"
And Click on submit button
