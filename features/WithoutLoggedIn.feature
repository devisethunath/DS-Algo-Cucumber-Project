Feature: Response  without logging in

Description: User is trying to access elements without logging in

Scenario: User is not logged in and clicks GetStarted button

Given User is on the DsAlgoPortal app home page "https://dsportalapp.herokuapp.com/home"
When User clicks on GetStarted Button
Then message is displayed "You are not logged in"

Scenario: User is not logged in and clicks on DataStructure Arrays

Given User is on the DsAlgoPortal app home page "https://dsportalapp.herokuapp.com/home"
When User Clicks on DataSTructure dropdown
And user clicks on Arrays in Datastructure dropdown
Then message is displayed "You are not logged in"



