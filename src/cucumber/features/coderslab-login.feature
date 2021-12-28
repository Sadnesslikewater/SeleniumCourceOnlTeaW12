Feature: Coderslab login

  Scenario: log into "Coders Lab" educational portal at https://lms.coderslab.pl
    Given Web page https://lms.coderslab.pl/ opened in browser
    When email address entered in input box
    And password entered in input box
    And key zaloguj pressed
    Then you are logged into "Coders Lab" educational portal, name of logged in person appears at the corner