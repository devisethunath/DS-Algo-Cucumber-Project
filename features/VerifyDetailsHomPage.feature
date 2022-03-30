Feature: Verify Details in DsAlgo portal Homepage

Description:Verify the elements in DsAlgo Homepage

Scenario: DsAlgo Home Page elements verification

Given User eneters the url "https://dsportalapp.herokuapp.com/" in the browser
Given  User Clicks getstarted button

When user clicks the datastructure dropdown
Then 6 datastructure elements displayed