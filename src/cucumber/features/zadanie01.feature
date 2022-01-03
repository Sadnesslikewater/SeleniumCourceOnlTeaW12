Feature: Mystore Login

  Scenario Outline: log into MyStore store at https://mystore-testlab.coderslab.pl and create new address
    Given Web page opened https://mystore-testlab.coderslab.pl
    And First key sign in pressed
    And Email address entered in input box
    And Password entered in input box
    And Second key sign in pressed
    When Addresses button pressed
    And Create new address button pressed
    Then Form filled with data: <alias>, <address>, <city>, <zipCode>, <country>, <phone>
    And Correctness of data checked
    And Save button pressed
    Examples:
      | alias | address | city   | zipCode | country        | phone     |
      | Mario | PipeStr | London | 00102   | United Kingdom | 602987654 |





