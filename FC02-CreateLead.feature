Feature: Create Lead feature of LeafTaps Application

Background: Test login with positive credentials

Given enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed
Given click on CRMSFA Link

Scenario Outline: Create new Leads in LeafTaps application

Given Click Leads Tab
Given Click Create Lead link
Given Enter Company Name as <compName>
Given Enter First Name as <fName>
Given Enter Last Name as <lName>
Given Click Submit button

Examples:
|compName|fName|lName|
|TL1|Babu|M|
|TL2|Hari|R|