Feature: Register with valid username and password
Description: User tries to register with valid username and password

Scenario: Register with valid username and password
Given User is on the dsalgo Portal home page
When User clicks Register button
And User enter valid username and password 
And click the button for register
Then User gets the message "New Account Created."

Scenario: Try to Register with empty fields
Given User is on the dsalgo Portal home page
When User clicks Register button
And User enters valid username and empty password 
And click the button for register
Then user gets message "Please fill out this field"