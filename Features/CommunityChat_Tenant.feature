Feature: Storage Booking
@sanity
Scenario: Successful login with valid credentials 
Given User launches browser
When User opens URL "https://provis.realcube.estate/"
And User enters email as "135070@mail944.com" and password as "EX@logi(123"
And Click on login
Then page title should be "Provis"
And user click on close
Then click on My Building for Community Chat
Then click on Gate&Arc for Community Chat
Then click on Community Chat
And Click on Create Community Post
And Enter Title "Testing"
And Enter description for Community Chat "svdhsdchsgggsuggsgscgscccsbjcshcdhsdhcbvsdh vsh vh vsh vsh sh vshcshdhchchcbcd"
And Enter Video URL "https://www.google.com/"
And Upload Image or PDF "C:\Users\Suvendu\Downloads\\images.png"
And Click on Save button