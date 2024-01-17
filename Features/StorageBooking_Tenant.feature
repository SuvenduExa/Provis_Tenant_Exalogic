Feature: Storage Booking
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Building for Storage Booking
Then click on Gate&Arc for Storage Booking
Then click on Storage Booking
And click on Book Now button for Storage Booking
Then Enter Month for Storage Booking "3"
Then click on Expected Move In To Storage
And click on the date for Move In To Storage
Then Enter Purpose of use "store"
And Click on  Storage Agreement Terms and Condition check box
Then Click on Book Now for Storage Booking
Then enter Card Number for Storage Booking  "5204740009900014"
And Click on Expiry Month for Storage Booking
And Select the Month for Storage Booking
And Click on Expiry Year for Storage Booking
And Select Year for Storage Booking
And Enter CVV for Storage Booking "123"
Then Click on Make Payment for Storage Booking
Then Click on Submitbtn for Storage Booking
#Then Click on Ok button
Then Click on Download receipt for Storage Booking
And Click on Download Arrow for Storage Booking

