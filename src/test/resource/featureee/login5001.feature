@login 
Feature: Login page creation

Scenario: Verify login option display with username and password in login page.
Given Launch application "<URL>"
Then Click loginlink
Then Verify login option display with username and password in login page.

Scenario: Verify profile page display with valid username and pasword
Given  Launch application "<URL>"
Then Click loginlink 
Then Enter user name and password and click login 
Then Verify user Profile Page display with valid username and password.

Scenario: Verify user login not successful with invalid username and password
Given  Launch application "<URL>"
Then Click loginlink 
Then Enter invalid username and invalid password and click login 
Then Verify user login not successful with invalid username and password

Scenario: Verify user login not successful with invalid username and valid password
Given  Launch application "<URL>"  
Then Click loginlink 
Then Enter invalid username and valid password and click login 
Then Verify user login not successful with invalid username and valid password

Scenario: Verify user login not successful with valid username and invalid password
Given  Launch application "<URL>"
Then Click loginlink
Then Enter valid username and invalid password and click login 
Then Verify user login not successful with valid username and invalid password

Scenario: Verify user wont be able to login without username and password
Given  Launch application "<URL>"
Then Click loginlink 
Then keep username and password filed empty and click login 
Then Verify user wont be able to login without username and password

Scenario: Verify user wont be able to login without username 
Given  Launch application "<URL>"  
Then Click loginlink 
Then enter password and click login 
Then Verify user wont be able to login without username 

Scenario: Verify user wont be able to login without password
Given  Launch application "<URL>" 
Then Click loginlink 
Then enter username and click login 
Then Verify user wont be able to login without password
