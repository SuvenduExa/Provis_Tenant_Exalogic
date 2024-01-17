Feature: AccessPassRequest
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on MyRequest for AccessPassRequest
Then click on MyService on AccessPassRequest
Then click on Service drop down on AccessPassRequest
And click on AccessPassRequest under Select a Service drop down
Then Click on Community drop down under AccessPassRequest
And Select any one option Under Community on AccessPassRequest
Then Click on Precinct drop down on AccessPassRequest
And Select any one option under precinct on AccessPassRequest
Then Click on Unit Number drop down on AccessPassRequest
And Select any one option under unit number on AccessPassRequest
Then Enter Number of Cards
Then click on Reason for Request
Then Enter Remarks
And Click on Terms and Condition
Then Click on Submit&Pay