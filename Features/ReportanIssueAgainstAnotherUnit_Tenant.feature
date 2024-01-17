Feature: Report an Issue Against Another Unit Tenant
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on Report an Issue
Then click on Select Issue Type
Then click on Report an Issue Against Another Unit
Then click on Complaint Category drop down
Then Select Parking
Then click on Community for Report an Issue Against Another Unit
Then select Gate&Arc for Report an Issue Against Another Unit
Then click on Precinct for Report an Issue Against Another Unit
Then select The Gate for Report an Issue Against Another Unit
Then click on Unit Number for Report an Issue Against Another Unit
Then Select Gatet for Report an Issue Against Another Unit
Then select Attachment for Report an Issue Against Another Unit "C:\Users\Suvendu\Downloads\\images.png"
Then Enter Additional Notes for Report an Issue Against Another Unit "Testing hdzxjhgufdghmz h mhdsxdcjmdxckugfxcvvfgfgjghfjgytgvbvcvbvmnyjrfggcgjbkcvvvmbbvsdvbkujhgesxgcvjhfz nn"
Then Click on Submit for Report an Issue Against Another Unit