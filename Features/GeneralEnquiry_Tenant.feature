Feature: General Enquiry Tenant
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on General Enquiry
Then Click on Category drop down
Then Select Enquiry Helath club
Then Click on Enquiry Type drop down
Then Select Events
Then Enter Remarks "Testing ddhgkuhtesdfgjjhhgf Testing htfjuk kytdhd dhtjtfgufdh Testing"
Then Click on Submit General Enquiry