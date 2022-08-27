Feature: To validate login funcatnility
Scenario: To validate the login funcationility with valid username and invilad password
Given user should launch the browser and load the url
When user should type valid username  and invalid password
And user should click the login button
Then user should navigate the incorret credentials 