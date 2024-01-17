Feature: DeliveryDisposalRequest
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
And Click on myrequest on DeliveryDisposalRequest
And click on myservice on DeliveryDisposalRequest
And click on SelectaService dropdown on DeliveryDisposalRequest
And click on DeliveryDisposalRequest
Then Click on Community drop down under DeliveryDisposalRequest
And Click any one Community under DeliveryDisposalRequest
Then Click on Precinct drop down under DeliveryDisposalRequest
And Click any one Precinct under DeliveryDisposalRequest
Then Click on Unit Number drop down under DeliveryDisposalRequest
And Click any one Unit Number under DeliveryDisposalRequest
Then Click on Type of Request under DeliveryDisposalRequest
And Click any one Type of Request under DeliveryDisposalRequest
Then Enter Number of Items under DeliveryDisposalRequest
Then Enter Items Description under DeliveryDisposalRequest "Testing"
Then Click on DeliveryDisposal Date and select a date
Then Enter Contact Person Name " Suvendu"
Then Enter Contact Person Number "501238596"
Then Enter Submit button