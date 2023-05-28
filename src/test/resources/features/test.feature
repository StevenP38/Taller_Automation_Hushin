#Author: Steven

@tag
Feature: I am  Testing the inventory billiard page

  @tag1
  Scenario Outline: I am verify the login
    Given Start inventory page
    And  I enter the user <user> and the <password>
    When I press the login button
    Then I validate the succesful login
    
    Examples: 
      | user   |  password   | 
      | Brayan |  Prueba1234 | 
      | Jorge  |  Jorge2023* | 

      