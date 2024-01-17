Feature: AddUnit
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then User click on My Request on AddUnit
Then User Click on My Service on AddUnit
Then User click on Select a Service drop down on AddUnit
And click on Add Unit under Select a Service drop down on AddUnit
Then click on I am a Tenant radio button under User Type page
Then click on Next button under user Type page
Then click on Community drop down under unit Details page
And Select any one option in Community under unit Details page
Then Click on Precinct Building drop down under unit Details page
And Select any one option under precinct on unit Details page
Then Click on Unit Number drop down under unit Details page
And Select any one option under unit number on unit Details page
And User Clicks on next button in unit Details page
Then Enter Name on Resident Details page "Suvendu"
And Enter Contact Number on Resident Details page "501239635"
And Enter Email Address on Resident Details page "subha123@gmail.com"
Then Click on Occupation drop down on Resident Details page
And Select any one option under Occupation drop down on Resident Details page
Then click on Next button under Resident Details page
Then Click on Tenancy Start Date on occupancy Details pag
And Click any Date from Tenancy Start Date
Then Click on Tenancy End Date on occupancy Details pag
And Click any Date from Tenancy End Date
Then Upload ID Proof
Then Upload Contract  Agreement Copy
Then Click on Rules and Regulations
Then sClick on Submit under occupancy Details page
And close browser