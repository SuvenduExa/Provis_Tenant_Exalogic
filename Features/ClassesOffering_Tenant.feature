Feature: Classes & Offering Tenant
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Building on Classes & Offering Tenant
Then click on Gate&Arc on Classes & Offering Tenant
Then Click on Classes&Offering 
Then Click on BookNow
Then Click on Select Your Package Radio Button
And Click on Select Your Schedule Radio Button
And Click on Unit Number under Book
And Click on any one option under Unit Number
And Enter Applicant Name "Akash"
And Enter Applicant Age "25"
Then Click on Pay&Book 
Then Enter Card Number "5204740009900014"
And Click on Expiry Month 
And Select the Month
And Click on Expiry Year
And Select Year
And Enter CVV "123"
Then Click on Make Payment
Then Click on Submitbtn
Then Click on Download receipt
And Click on Download Arrow
