Feature: Merge Lead feature of LeafTaps Application

Background: Login to leaftaps application

Given enter the username as demosalesmanager
And enter the password as crmsfa
When click on login button
Then homepage should be displayed
Given click on CRMSFA Link

Scenario Outline: Merge Leads in LeafTaps application

Given Click Leads Tab
Given Click Merge leads
Given Click on first Lookup
Given Input Firstname for lookup1 as <firstName> and search
Given Store the first resulting leadID into a String
Given Click the first resulting leadID for lookup1
Given Click on second Lookup
Given Input Firstname for lookup2 as <mergeFirstName> and search
Given Click the first resulting leadID for lookup2
Given Click the Merge button and accept the alert
When Search for the lookup1 lead id
Then lookup1 lead id doesnot exist anymore

Examples:
|firstName|mergeFirstName|
|Hari|Gopi|