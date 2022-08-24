
Feature: Contact page creation

@ContactTest
Scenario: Verify contact functionality display in homepage
Given Launch application "<URL>"
Then Verify contact functionality display in hoepage

@ContactTest
Scenario: Verify contact page is display in contact page
Given  Launch application "<URL>"
Then click contactlink
Then Verify contact page is display in contact page

@ContactTest
Scenario: Verify contact page display with email,name and message field
Given  Launch application "<URL>"
Then click contactlink
Then Verify contact page display with email,name and message field

@ContactTest
Scenario: Verify user can write email, name and message in contact page
Given  Launch application "<URL>"
Then click contactlink
Then enter email, name and message 
Then Verify user can write email, name and message in contact page

@ContactTest
Scenario: Verify user can send message successfully
Given  Launch application "<URL>"
Then click contactlink
Then enter email, name and message
Then click send message
Then Verify user can send message successfully
