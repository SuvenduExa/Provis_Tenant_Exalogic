Feature: Login to Provis 
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
And user click on account
When user click on logout
Then Page2 title should be "Login to Provis"
#And Close browser