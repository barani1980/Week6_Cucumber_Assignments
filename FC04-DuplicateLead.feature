Feature: Duplicate Lead feature of LeafTaps Application

Background: Login to leaftaps application

Given enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed
Given click on CRMSFA Link

Scenario Outline: Duplicate Leads in LeafTaps application

Given Click Leads Tab
Given Click Find Leads Link
Given Click Phone label
Given Enter Phone Number <phoneNo>
Given Click Find Leads
Given Click First Resulting lead
Given Click Duplicate lead button
And Click Submit button

Examples:
|phoneNo|
|99|