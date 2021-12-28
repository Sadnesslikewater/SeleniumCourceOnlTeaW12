Feature: Qwant search

  Scenario: Search for "W pustyni i w puszczy" in https://www.qwant.com/
    Given Web page https://www.qwant.com/ opened in browser
    When Search phrase "W pustyni i w puszczy" entered in search input box
    And key enter pressed
    Then First 3 search results titles contain phrase "W pustyni i w puszczy"


  Scenario Outline: Search for "<searchPhrase>" in https://www.qwant.com/
    Given Web page https://www.qwant.com/ opened in browser
    When Search phrase "<searchPhrase>" entered in search input box
    And key enter pressed
    Then First "<resultCounts>" search results titles contain phrase "<searchPhrase>"
    Examples:
          |searchPhrase         |resultCounts|
          |W pustyni i w puszczy|3           |
          |Pharaoh              |2           |
          |Witcher              |2           |


