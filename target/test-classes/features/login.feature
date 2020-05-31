Feature: Login into Application

Scenario: Positive test validating login
Given Initializing the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in page
When Ueser enters "test99@gmail.com" and "123456" and logs in 
Then Verify that user is successfully logged in


