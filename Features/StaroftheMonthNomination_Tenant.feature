Feature: Star of the Month Nomination
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "AASHVIKSRIHARI_test@OUTLOOK.COM" and password as "oEX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Building for StaroftheMonthNomination
Then click on Gate&Arc for StaroftheMonthNomination
Then click on StaroftheMonthNomination
And Enter Name of the Employee "subhaa"
And Click on Department drop down
And Select Administration
Then Enter Reason for Nomination "Testing tgtdtrfkhytrsdghgjfgd drdtrfthj ndtdtgf"
And Click on submit button for StaroftheMonthNomination