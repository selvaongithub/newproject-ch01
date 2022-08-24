Feature: Facebool login

  Scenario Outline: Login Page
    Given open Fb and launch the application
   
 
    When Enter user name as "<username>" and password as "<password>"
    Then Close the browser

    Examples: 
      | username  | password |
      | laura | lxxx |
      | raj | rxxx |
      
    