Feature: Delete Lead feature of LeafTaps Application

Background: Login to leaftaps application

Given enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed
Given click on CRMSFA Link

Scenario Outline: Delete Leads in LeafTaps application

Given Click Leads Tab
Given Click Find Leads Link
Given Click Phone label
Given Enter Phone Number <phoneNo>
Given Click Find Leads
Given Click the first resulting lead
Given Click Delete button
Given Click Find Leads Link
Given Input deleted leadID and search leads
When If Lead is Successfully Deleted
Then print record is deleted
But print record still exists

Examples:
|phoneNo|
|99|