
Feature: To validate the registration with  Functionality

Background:
   Given The user should be in etsy page
    
   
   @regression
       Scenario:InvalidRegister_To verify the registration function with valid input datas
        When The user has to click the register link
        And The user has to fill the email,firstname and password
        And The user has to click the "register" button
        Then The user should register the app and receive "Welcome back" message
        @retest
        Scenario: validRegister_To verify the registration function with valid input datas
        When The user has to click the register link
        And The user has to fill the email,firstname and password
        And The user has to click the "register" button
        Then The user should register the app and receive "Welcome back" message
        