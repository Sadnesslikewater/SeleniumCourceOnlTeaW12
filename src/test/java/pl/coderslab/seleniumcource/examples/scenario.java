//package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//public class scenario {}
  /*  Scenario Outline: Search for "<searchPhrase>" in https://www.qwant.com/
    Given Web page https://www.qwant.com/ opened in browser
    When Search phrase "<searchPhrase>" entered in search input box
    And key enter pressed
    Then First "<resultCounts>" search results titles contain phrase "<searchPhrase>"
    Examples:
            |searchPhrase         |resultCounts|
            |W pustyni i w puszczy|3           |
            |Pharaoh              |2           |
            |Witcher              |2           |

    Examples:
            |searchPhrase   |resultCounts|
            |Mario          |Hydrauliczna 3|Kraków   |00-102 |United Kingdom|602987654|
            |Luigi          |Grzybkowa 1   |Gdańsk   |01-103 |United Kingdom|601876543|
            |Ernie          |Sezamkowa 5   |Warszawa |02-104 |United Kingdom|600765432|
}
