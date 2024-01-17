Feature: Amenity Booking
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then hits on my Building on Amenity Booking
Then hits on Gate&Arc on Amenity Booking
Then click on Amenity Booking
And click on Book button
Then click on Unit drop down
And select unit no
Then click on Check In Date 
And select one date in check in date calendar
Then select Time Slot 
And click in I understand and agree check box
And click on ok button on pop up
Then click on book button under Amenity Booking