Feature: Login to Retail Website

#Echa feature file starts with feauture keyword and name for feature file 
#Each scenario starts with Scenario keyword and : then name of scenario
#Given is used for precondition
#when is used for an action
#And id used for actions step following when keyword
#Then is used for expected result and writting assertions
#scenario outline will run same scenario with multiple set of data and
#we use Examples  keyword to store the data under it
#we can writens name step N times as longnas they are the same (case sensetive , and no extra space)
#but in step defenation we should have only one step associated with this step.

@smokeTest @Regrassion @endtoendTesting
Scenario:_Retail wabsite Login test
Given user is on Retail website
When user on Myaccount
And user click on Login option
And user enter userName '202415184'and password'Alisher201'
And user click on Login BUtton
Then user should be logged in to Myaccount dashboard

@endtoendTesting
Scenario Outline:Retail wabsite login test with multiple accounts
Given user is on Retail website
When user on Myaccount
And user click on Login option
And user enter userName '202415184'and password'Alisher201'
And user click on Login BUtton
Then user should be logged in to Myaccount dashboard

Examples:
|userName|password|
|202415184|Alisher206|









