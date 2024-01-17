Feature: Report an Issue Against Another Unit Tenant
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on Report an Issu
Then click on Select Issue Typ
Then click on Report an Issue in Common Area
Then click on Category for Report an Issue in Common Area
Then Select Air Conditioning on Category
Then Click on Sub Category drop down for Report an Issue in Common Area
Then select Ac defect under Sub Category drop down
Then click on Precinct drop down for Report an Issue in Common Area
Then Select Arc Retail under precinct for Report an Issue in Common Area
Then click on Floor drop down 
Then select Retails second ground floor
Then click on Common Area drop down
Then select Pizza Express
Then Upload a photo for Report an Issue in Common Area "C:\Users\Suvendu\Downloads\\images.png" 
Then Enter Additional Note for Report an Issue in Common Area " Testing vgghfghgukhk yhjgugugu jhffugu jfjggug  hfhff  hftftfv jghggjy fhjfhfhg jgjgg hffj  fhfggg"
Then click on submit for Report an Issue in Common Area