Feature: Move Out Request
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
And Click  myrequest on Move Out Request
And click  myservice on Move Out Request
And click  SelectaService dropdown on Move Out Request
And click  Move Out Request
And Click on Ok button
Then Enter Reasons for Leaving "Job Transfor"
Then Enter Location you are moving to "Dubai"
Then Click on Furniture Move out Date
And Select move out Date
And Enter Preferred time "12:40"
Then Click on Move out date Key handover date
And Select one date on Move out date Key handover date
And Enter Preferred time under handover date "13:40"
Then Click on TERMS AND CONDITIONS
Then Click on Submit buton