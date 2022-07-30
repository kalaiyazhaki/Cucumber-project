Feature: To validate the forgot your password functionality of the Zappos page

@Testing
Scenario: Validate forgot your password with invalid email
Given User should launch chrome and load the url
When User should click the sign in button
And User should click the sign in with zappos button
And User should click the forgot your password link
And User should input invalid email in the find your account text box
And User should click the continue button
Then User should navigate to password reset page