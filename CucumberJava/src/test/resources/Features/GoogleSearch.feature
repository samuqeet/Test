Feature: feature to test google search functionality

Scenario: validate google search

Given browser is open
And the user see the search bar
When user enters text in search bar
And hit enter button
Then serarch results are displayed

