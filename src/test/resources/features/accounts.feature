@CreateAccount
Feature: Scenario Outline

  Background:
    Given user is on login page
    When user enters UserName "Steve1235" on login page
    And user enters Password "Job1235" on login page
    And clicks on login button
    Then user is navigate to the home page


  Scenario Outline: user is on the home page, click button create account, chose one of two account types, click button
  create account, navigate to the page account created, user clicks button accounts overview, user navigates to the
  accounts overview page and checks if account has been created

    Given user is on the home page
    When user clicks create new account
    And user choose a type of account "<account type>"
    And user clicks create account button
    Then navigate to the successful account created page
    When user clicks accounts overview button and navigates to the accounts overview page
    Then account overview page contains account number from successful account created page
    Examples:
      | account type |
      | 1            |

