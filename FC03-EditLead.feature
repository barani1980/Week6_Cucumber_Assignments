Feature: Edit Lead feature of LeafTaps Application

Background: Login to leaftaps application

Given enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed
Given click on CRMSFA Link

Scenario Outline: Edit Leads in LeafTaps application

Given Click Leads Tab
Given Click Find Leads Link
Given Click Phone label
Given Enter Phone Number <phoneNo>
Given Click Find Leads
Given Click First Resulting lead
Given Click Edit button
Given Update Company name <companyName>
And Click Submit button

Examples:
|phoneNo|companyName|
|99|DXC|