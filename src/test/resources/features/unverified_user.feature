#Tim Radionov
#Feb 3 2023
#Course Project in purpose to create a video tutorial for youtube

#@Smoke
Feature: Scenario Outline

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters UserName "<userName>" on login page
    And user enters Password "<password>" on login page
    And clicks on login button
    Then user is navigate to the home page

    Examples:
      | userName  | password |
      | Steve1235 | Job1235  |

  Scenario Outline: Check login is unsuccessful with invalid credentials
    Given user is on login page
    When user enters UserName "<userName>" on login page
    And user enters Password "<password>" on login page
    And clicks on login button
    Then user is navigate to the home page

    Examples:
      | userName | password |
      | Steven   | Job      |

  Scenario Outline: Check if create account function is successful with valid credentials
    Given user is on sign up page
    When user enters first name "<first name>" on signup page
    And user enters last name "<last name>" on signup page
    And user enters address "<address>" on signup page
    And user enters city "<city>" on signup page
    And user enters state "<state>" on signup page
    And user enters zip code "<zip code>" on signup page
    And user enters phone number "<phone number>" on signup page
    And user enters social security number "<ssn>" on signup page
    And user enters user name "<user name>" on signup page
    And user enters password "<password>" on signup page
    And user enters confirm "<confirm password>" on signup page
    And click on signup button
    Then user is navigate to the signup successful message

    Examples:
      | first name | last name | address | city | state | zip code | phone number | ssn | user name | password | confirm password |
      | first name | last name | address | city | state | zip code | phone number | ssn | Steve1235 | Job1235  | Job1235          |
