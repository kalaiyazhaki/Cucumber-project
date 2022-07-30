@Sachin
Feature: To validate the login functionality of the Zappos page
Background:
Given User should launch chrome and load the url

@Sanity @Dravid
Scenario: Validate login functionality with invalid email and invalid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the invalid email and invalid password
And User should click the login button
And User should print the title of ur page
Then User should navigate to incorrect credential page

@Smoke @Regression
Scenario: Validate login functionality with invalid email and VALID password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the invalid email and VALID password
And User should click the login button
And User should print the title of ur page
Then User should navigate to incorrect credential page

@Bvt
Scenario: Validate login functionality with INVALID email and invalid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the INVALID email and invalid password
#2D Map
    #    0		1				2			3            Cell     
       |user|mobile|laptop|color|           # header    
       |admin|moto@12|hp@34|pink|           #0   ROW Data
       |priya|samsung|dell@54|blue|         #1   ROW Data
       |sai|redmi@34|sony|red@89|           #2   ROW Data
       |saran|max@7|apple|yellow|           #3   ROW Data
       |keerthi|realme|micro|brown@567|     #4   ROW Data
       
And User should click the login button
And User should print the title of ur page
Then User should navigate to incorrect credential page

@Functional
Scenario: Validate login functionality with invalid EMAIL and invalid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the invalid EMAIL and invalid password
#1D Map
    #0 header 1 data      Cell
       |user|admin|        #0   ROW
       |football|ball|     #1   ROW
       |color|pink@456|    #2   ROW
       |mobile|moto|       #3   ROW
       |course|java@123|   #4   ROW
       
And User should click the login button
And User should print the title of ur page
Then User should navigate to incorrect credential page

@Sanity
Scenario: Validate login functionality with valid email and invalid PASSWORD

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the valid email and invalid PASSWORD
#2D List
    #                   Cell
    #  0     1      2    3        4         5      
    |java|java@123|sql|sql@34|selenium|selenium@123|  #0   ROW
    |pen|pen@123|pencil|pencil@34|note|note@123|      #1   ROW
    |deva|deva@123|gayu|gayu@34|sowmi|sowmi@123|      #2   ROW
    
And User should click the login button
And User should print the TITLE of ur page
Then User should navigate to incorrect credential page

@Regression
Scenario: Validate login functionality with valid email and invalid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the valid email and invalid passworD
#1D List
   #                 Cell
   #   0     1      2     3       4         5      
    |maya|maya@123|pavi|pavi@34|shalini|shalini@123| #0 ROW don't consider this row index number
And User should click the login button
Then User should navigate to incorrect credential page

@Cloud
Scenario: Validate login functionality with valid email and valid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the valid email and valid password
And User should click the login button
And User should logout the account
Then User should navigate to correct credential page 

Scenario Outline: Validate login functionality with invalid email and valid password

When User should click the sign in button
And User should click the sign in with zappos button
And User should pass the invalid email"<upper>" and valid password "<lower>"
And User should click the login button
And User should print the current url of the page
Then User should navigate to incorrect credential page

Examples:
         |upper|lower|
         |anu|Anu@12|
         |priya|priya@123|
         |malini|Malini@1|

