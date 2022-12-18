
Feature: To validate the login functionality of esty application


Background:
 Given The user should be in esty page
 
 
  @smoke @regression
  Scenario: InvalidLogin_To validate the login functionality with invalid credentials
  When The user has to fill the username "venkatesh" and password "808923" 
  And The user has to click the "login" button
  Then The user navigate to the invalid login page
  
  @sanity 
  Scenario: ValidLogin_To Validate the login functionality with invalid credentials
  When The user has to fill the username "Raj" and password "76789"
  And The user has to click the "login" button
  Then The user navigate to the invalid login page     
  
  