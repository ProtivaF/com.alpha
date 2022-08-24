@signup
Feature: Sign-up page creation

Scenario: Verify signup functionality display in homepage
Given Launch application "<URL>"
Then Verify signup functionality display in homepage

Scenario:Verify signup page is display in signup page
Given  Launch application "<URL>"
Then click signuplink
Then  Verify signup page is display in signup page

Scenario: Verify signup page display with username and password field
Given  Launch application "<URL>"
Then click signuplink
Then Verify signup page display with username and password field

Scenario: Verify user can write username and password in signup page
Given  Launch application "<URL>"
 Then click signuplink
 Then Enter username and password
 Then Verify user can write username and password in signup page

Scenario: Verify user can signup successfully
Given  Launch application "<URL>"
 Then click signuplink
 Then Enter username and password
When Click signup button
Then Verify user can signup successfully

Scenario: Verify user cannot signup without username and password
Given  Launch application "<URL>"
 Then click signuplink
 Then keep username and password filed empty
When Click signup button
Then  Verify user cannot signup without username and password
