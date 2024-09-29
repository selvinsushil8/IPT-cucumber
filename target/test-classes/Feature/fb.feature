Feature: FB login module
Scenario Outline: validate user login module

Given user should navigate to login url
When user should able to enter username "<username>"
And user should able to enter password "<password>"
Then validate user should able to click log in button
Examples:

|username|password|
|selvin@gmail.com|1234|
|sushil@gmail.com|7436hsadgjsd|
|kumar@gmail.com|hdsf847dfsj|